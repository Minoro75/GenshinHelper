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
            repository.getCharacters().collect {
                when (it) {
                    is Resource.Error -> Unit
                    is Resource.Loading -> state = state.copy(isLoading = it.isLoading)
                    is Resource.Success -> it.data?.let { list ->
                        state = state.copy(characters = list)
                    }
                }
            }
        }
    }
}
