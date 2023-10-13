package io.minoro75.genshinhelper.presentation.home_screen.state

import io.minoro75.genshinhelper.domain.model.TodayBooks
import io.minoro75.genshinhelper.domain.model.TodayWeaponResources
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

data class HomeScreenState(
    val todayBooks: PersistentList<TodayBooks> = persistentListOf(),
    val todayWeaponResources: PersistentList<TodayWeaponResources> = persistentListOf(),
    val isLoading: Boolean = true
)
