package io.minoro75.genshinhelper.presentation.character_details

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.minoro75.genshinhelper.common.Resource
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import io.minoro75.genshinhelper.presentation.character_details.state.CharacterDetailsState
import kotlinx.coroutines.launch
import javax.inject.Inject

class CharacterDetailsScreenViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val repository: CharactersRepository
) : ViewModel() {

    var state by mutableStateOf(CharacterDetailsState())
        private set

    init {
        viewModelScope.launch {
            val name = savedStateHandle.get<String>("name") ?: return@launch
            state = state.copy(isLoading = true)

            repository.getCharacterDetails(name).collect { resource ->
                state = when (resource) {
                    is Resource.Success -> {
                        state.copy(
                            characterDetails = resource.data,
                            isLoading = false,
                            errorMessage = null
                        )
                    }
                    is Resource.Error -> {
                        state.copy(
                            errorMessage = resource.message,
                            isLoading = false,
                            characterDetails = null
                        )
                    }
                    is Resource.Loading -> {
                        state.copy(
                            isLoading = resource.isLoading,
                            characterDetails = null,
                            errorMessage = null
                        )
                    }
                }
            }

        }

    }
}
