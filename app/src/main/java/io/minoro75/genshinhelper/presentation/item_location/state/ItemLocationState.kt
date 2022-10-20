package io.minoro75.genshinhelper.presentation.item_location.state

import io.minoro75.genshinhelper.domain.model.HowToObtainItem

data class ItemLocationState(
    val locations: List<HowToObtainItem>? = null,
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)
