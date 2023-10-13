package io.minoro75.genshinhelper.presentation.home_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import io.minoro75.genshinhelper.presentation.home_screen.state.HomeScreenState
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toPersistentList
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.flow.zip
import java.util.*
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(
    private val repository: CharactersRepository
) : ViewModel() {

    private val calendar = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    private val _state = MutableStateFlow(HomeScreenState())
    val state = _state.asStateFlow()

    init {
        fetchTodayData()
    }

    private fun fetchTodayData() {
        repository.getTodayBooks(calendar)
            .zip(repository.getTodayWeaponResources(calendar)) { todayBooks, todayWeaponResources ->
                _state.update {
                    it.copy(
                        todayBooks = todayBooks?.toPersistentList() ?: persistentListOf(),
                        todayWeaponResources = todayWeaponResources?.toPersistentList()
                            ?: persistentListOf(),
                        isLoading = false
                    )
                }
            }
            .launchIn(viewModelScope)
    }
}