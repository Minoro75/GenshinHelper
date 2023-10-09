package io.minoro75.genshinhelper.presentation.home_screen.state

import io.minoro75.genshinhelper.domain.model.TodayBooks
import io.minoro75.genshinhelper.domain.model.TodayWeaponResources
import kotlinx.collections.immutable.PersistentList

data class HomeScreenState(
    val todayBooks: PersistentList<TodayBooks>,
    val todayWeaponResources: PersistentList<TodayWeaponResources>,
    val isLoading: Boolean
)
