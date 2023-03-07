package io.minoro75.genshinhelper.presentation.character_details

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import io.minoro75.genshinhelper.presentation.character_details.state.CharacterDetailsState
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class CharacterDetailsScreenViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    repository: CharactersRepository
) : ViewModel() {

    val name = savedStateHandle.get<String>("name")

    val uiState: StateFlow<CharacterDetailsState> =
        repository.getCharacterDetails(name!!).map {
            CharacterDetailsState(it!!, false)
        }.stateIn(
            scope = viewModelScope,
            initialValue = CharacterDetailsState(null, true),
            started = SharingStarted.WhileSubscribed(5_000)
        )
}
