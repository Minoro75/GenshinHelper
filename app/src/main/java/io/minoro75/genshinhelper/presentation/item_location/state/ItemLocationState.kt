package io.minoro75.genshinhelper.presentation.item_location.state

import io.minoro75.genshinhelper.domain.model.HowToObtainItem
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

data class ItemLocationState(
    val items: PersistentList<HowToObtainItem> = persistentListOf(),
    val isLoading: Boolean = true
)
