package io.minoro75.genshinhelper.presentation.home_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import io.minoro75.genshinhelper.presentation.home_screen.state.HomeScreenState
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toPersistentList
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.zip
import java.util.*
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(
    repository: CharactersRepository
) : ViewModel() {

    private val calendar = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    val uiState = repository.getTodayBooks(calendar)
        .zip(repository.getTodayWeaponResources(calendar)) { books, weapons ->
            HomeScreenState(books!!.toPersistentList(), weapons!!.toPersistentList(), false)
        }.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5_000),
        HomeScreenState(persistentListOf(), persistentListOf(), true)
    )
}