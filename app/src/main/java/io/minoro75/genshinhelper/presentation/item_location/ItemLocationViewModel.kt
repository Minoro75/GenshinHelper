package io.minoro75.genshinhelper.presentation.item_location

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.minoro75.genshinhelper.domain.model.HowToObtainItem
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import io.minoro75.genshinhelper.presentation.item_location.state.ItemLocationState
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toPersistentList
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class ItemLocationViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val repository: CharactersRepository
) : ViewModel() {

    val name = savedStateHandle.get<String>("itemName")

    private val _state = MutableStateFlow(ItemLocationState())
    val state = _state.asStateFlow()

    init {
        fetchData()
    }

    private fun fetchData(){
        repository.getItemLocation(name!!) //it won't be null in any case
            .onEach { howToObtainItems: List<HowToObtainItem>? ->
                _state.update { it.copy(items = howToObtainItems?.toPersistentList() ?: persistentListOf(),
                    isLoading = false) }
            }
            .launchIn(viewModelScope)
    }

}
