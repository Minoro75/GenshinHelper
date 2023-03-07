package io.minoro75.genshinhelper.presentation.home_screen.state

import io.minoro75.genshinhelper.domain.model.TodayBooks
import io.minoro75.genshinhelper.domain.model.TodayWeaponResources

data class HomeScreenState(
    val todayBooks: List<TodayBooks>,
    val todayWeaponResources: List<TodayWeaponResources>,
    val isLoading: Boolean
)
