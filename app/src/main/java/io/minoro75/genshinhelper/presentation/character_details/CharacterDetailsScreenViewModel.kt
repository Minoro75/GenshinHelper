package io.minoro75.genshinhelper.presentation.character_details

import androidx.compose.runtime.State
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
import io.minoro75.genshinhelper.presentation.characters_list_screen.state.CharacterListState
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharacterDetailsScreenViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val repository: CharactersRepository
) : ViewModel() {

    val name = savedStateHandle.get<String>("name")

    val uiState: StateFlow<CharacterDetailsState> =
       repository.getCharacterDetails(name!!).map {
           CharacterDetailsState.Success(it!!)
       }.stateIn(
           scope = viewModelScope,
           initialValue = CharacterDetailsState.Loading,
           started = SharingStarted.WhileSubscribed(5_000)
       )
}
