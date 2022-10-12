package io.minoro75.genshinhelper.presentation.item_location

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.minoro75.genshinhelper.common.Resource
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import io.minoro75.genshinhelper.presentation.item_location.state.ItemLocationState
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ItemLocationViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val repository: CharactersRepository
) : ViewModel() {

    var state by mutableStateOf(ItemLocationState())
        private set

    init {
        val itemName = savedStateHandle.get<String>("itemName")
        setItemLocation(itemName!!)
    }

    fun setItemLocation(itemName: String) {
        viewModelScope.launch {
            state = state.copy(isLoading = true)

            repository.getItemLocation(itemName).collect { resource ->
                when (resource) {
                    is Resource.Success -> {
                        state = state.copy(
                            locations = resource.data,
                            isLoading = false,
                            errorMessage = null
                        )
                    }

                    is Resource.Error -> {
                        state = state.copy(
                            locations = null,
                            isLoading = false,
                            errorMessage = resource.message
                        )
                    }

                    else -> Unit
                }
            }
        }
    }
}
