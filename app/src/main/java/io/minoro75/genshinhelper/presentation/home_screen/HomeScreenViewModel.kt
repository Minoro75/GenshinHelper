package io.minoro75.genshinhelper.presentation.home_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import io.minoro75.genshinhelper.presentation.home_screen.state.HomeScreenBooksState
import io.minoro75.genshinhelper.presentation.home_screen.state.HomeScreenWeaponsState
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import java.util.Calendar
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(
    repository: CharactersRepository
) : ViewModel() {

    private val calendar = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    val uiBooksState: StateFlow<HomeScreenBooksState> =
        repository.getTodayBooks(calendar).map {
            HomeScreenBooksState.Success(it!!)
        }
            .stateIn(
                viewModelScope,
                SharingStarted.WhileSubscribed(5_000),
                HomeScreenBooksState.Loading
            )

    val uiWeaponsState: StateFlow<HomeScreenWeaponsState> =
        repository.getTodayWeaponResources(calendar).map {
            HomeScreenWeaponsState.Success(it!!)
        }
            .stateIn(
                viewModelScope, SharingStarted.WhileSubscribed(5_000),
                HomeScreenWeaponsState.Loading
            )
}