package io.minoro75.genshinhelper.presentation.item_location.state

import io.minoro75.genshinhelper.domain.model.HowToObtainItem

data class ItemLocationState(
    val items: List<HowToObtainItem>,
    val isLoading: Boolean
)
