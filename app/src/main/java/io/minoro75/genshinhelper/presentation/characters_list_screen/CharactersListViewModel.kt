package io.minoro75.genshinhelper.presentation.characters_list_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import io.minoro75.genshinhelper.presentation.characters_list_screen.state.CharacterListState
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class CharactersListViewModel @Inject constructor(
    repository: CharactersRepository
) : ViewModel() {

    val uiState: StateFlow<CharacterListState> =
        repository.getCharacters().map {
            CharacterListState(it!!, false)
        }.stateIn(
            scope = viewModelScope,
            initialValue = CharacterListState(emptyList(), true),
            started = SharingStarted.WhileSubscribed(5_000)
        )
}

