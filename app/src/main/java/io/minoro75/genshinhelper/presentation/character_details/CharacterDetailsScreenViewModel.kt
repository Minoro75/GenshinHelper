package io.minoro75.genshinhelper.presentation.character_details

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.minoro75.genshinhelper.common.Resource
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import io.minoro75.genshinhelper.presentation.character_details.state.CharacterDetailsState
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharacterDetailsScreenViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val repository: CharactersRepository
) : ViewModel() {

    var state by mutableStateOf(CharacterDetailsState())
        private set

    init {
      val name = savedStateHandle.get<String>("name")
      setDetails(name!!)
    }
    private fun setDetails(name:String){
        viewModelScope.launch {
            state = state.copy(isLoading = true)

            repository.getCharacterDetails(name).collect { resource ->

                    when (resource) {
                    is Resource.Success -> {
                        state = state.copy(
                            characterDetails = resource.data,
                            isLoading = false,
                            errorMessage = null
                        )
                    }
                    is Resource.Error -> {
                        state = state.copy(
                            errorMessage = resource.message,
                            isLoading = false,
                            characterDetails = null
                        )
                    }

                    else -> Unit
                }
            }

        }
    }
}
