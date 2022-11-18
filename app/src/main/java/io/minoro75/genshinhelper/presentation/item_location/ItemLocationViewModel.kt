package io.minoro75.genshinhelper.presentation.item_location

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import io.minoro75.genshinhelper.presentation.item_location.state.ItemLocationState
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class ItemLocationViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val repository: CharactersRepository
) : ViewModel() {

    val name = savedStateHandle.get<String>("itemName")
    val uiState = repository.getItemLocation(name!!).map {
        ItemLocationState.Success(it!!)
    }.stateIn(
        scope = viewModelScope,
        initialValue = ItemLocationState.Loading,
        started = SharingStarted.WhileSubscribed(5_000)
    )
}
