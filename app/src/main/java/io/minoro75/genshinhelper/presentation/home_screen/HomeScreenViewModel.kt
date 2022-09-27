package io.minoro75.genshinhelper.presentation.home_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.minoro75.genshinhelper.common.Resource
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import io.minoro75.genshinhelper.presentation.home_screen.state.HomeScreenState
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import java.time.LocalDateTime
import javax.inject.Inject

class HomeScreenViewModel @Inject constructor(
    private val repository: CharactersRepository
) : ViewModel() {

    var state by mutableStateOf(HomeScreenState())
        private set

    init {
        fetchDailyActivities()
    }

    private fun fetchDailyActivities() {
        val today = LocalDateTime.now().dayOfWeek
        viewModelScope.launch {
            state = state.copy(isLoading = true)
            val books = async { repository.getTodayBooks(today) }
            val weapons = async { repository.getTodayWeaponResources(today) }

            books.await().collect {
                when (it) {
                    is Resource.Success -> {
                        state = state.copy(
                            todayBooks = it.data,
                            isLoading = false,
                            errorMessage = null
                        )
                    }

                    is Resource.Error -> {
                        state = state.copy(
                            todayBooks = null,
                            errorMessage = it.message,
                            isLoading = false
                        )
                    }

                    else -> Unit
                }
            }

            weapons.await().collect {
                when (it) {
                    is Resource.Success -> {
                        state = state.copy(
                            todayWeaponResources = it.data,
                            isLoading = false,
                            errorMessage = null
                        )
                    }

                    is Resource.Error -> {
                        state = state.copy(
                            todayWeaponResources = null,
                            errorMessage = it.message,
                            isLoading = false
                        )
                    }

                    else -> Unit
                }
            }

        }
    }
}