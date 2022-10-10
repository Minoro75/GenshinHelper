package io.minoro75.genshinhelper.presentation.item_location

import androidx.lifecycle.ViewModel
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import javax.inject.Inject

class ItemLocationViewModel @Inject constructor(
    private val repository: CharactersRepository
) : ViewModel() {
}
