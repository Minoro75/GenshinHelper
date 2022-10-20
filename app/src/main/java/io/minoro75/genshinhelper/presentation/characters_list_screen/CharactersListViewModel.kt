package io.minoro75.genshinhelper.presentation.characters_list_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.minoro75.genshinhelper.common.Resource
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import io.minoro75.genshinhelper.presentation.characters_list_screen.state.CharactersListState
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharactersListViewModel @Inject constructor(
    private val repository: CharactersRepository
) : ViewModel() {

    var state by mutableStateOf(CharactersListState())
    private set

    init {
        fetchCharacters()
    }

    private fun fetchCharacters() {
        viewModelScope.launch {
            state = state.copy(isLoading = true)
            repository.getCharacters().collect {
                when (it) {
                    is Resource.Error -> {
                        state = state.copy(errorMessage = it.message,
                        isLoading = false,
                        characters = null)
                    }
                    is Resource.Success -> it.data?.let { list ->
                        state = state.copy(characters = list,
                        isLoading = false,
                        errorMessage = null)
                    }
                    else -> Unit
                }
            }
        }
    }
}
