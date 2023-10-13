package io.minoro75.genshinhelper.presentation.character_details

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import io.minoro75.genshinhelper.presentation.character_details.state.CharacterDetailsState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class CharacterDetailsScreenViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val repository: CharactersRepository
) : ViewModel() {

    val name = savedStateHandle.get<String>("name")

    private val _state = MutableStateFlow(CharacterDetailsState())
    val state = _state.asStateFlow()

    init {
        fetchData(name = name!!) //name won't be null in any case, trust me
    }

    private fun fetchData(name: String) {
        repository.getCharacterDetails(name)
            .onStart { _state.update { it.copy(null,true) } }
            .onEach { details ->
                _state.update {
                    it.copy(
                        charactersDetails = details,
                        isLoading = false
                    )
                }
            }
            .launchIn(viewModelScope)
    }

}
