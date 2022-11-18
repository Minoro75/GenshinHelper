package io.minoro75.genshinhelper.presentation.item_location.state

import io.minoro75.genshinhelper.domain.model.HowToObtainItem

sealed interface ItemLocationState {
    object Loading : ItemLocationState
    data class Success(val items: List<HowToObtainItem>) : ItemLocationState
}
