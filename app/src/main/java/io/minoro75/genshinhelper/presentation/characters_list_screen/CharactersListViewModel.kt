package io.minoro75.genshinhelper.presentation.characters_list_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import io.minoro75.genshinhelper.presentation.characters_list_screen.state.CharacterListState
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toPersistentList
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class CharactersListViewModel @Inject constructor(
    private val repository: CharactersRepository
) : ViewModel() {

    private val _state = MutableStateFlow(CharacterListState())
    val state = _state.asStateFlow()

    init {
        fetchList()
    }

    private fun fetchList() {
        repository.getCharacters()
            .onEach { characters ->
                _state.update {
                    it.copy(
                        charactersList = characters?.toPersistentList() ?: persistentListOf(),
                        isLoading = false
                    )
                }
            }
            .launchIn(viewModelScope)
    }

}

