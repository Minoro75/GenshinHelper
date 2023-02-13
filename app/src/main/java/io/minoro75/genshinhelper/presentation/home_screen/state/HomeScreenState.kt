package io.minoro75.genshinhelper.presentation.home_screen.state

import io.minoro75.genshinhelper.domain.model.TodayBooks
import io.minoro75.genshinhelper.domain.model.TodayWeaponResources

sealed interface HomeScreenBooksState {
    data class Success(val todayBooks: List<TodayBooks>) : HomeScreenBooksState
    object Loading : HomeScreenBooksState
}

sealed interface HomeScreenWeaponsState {
    data class Success(val todayBooks: List<TodayWeaponResources>) : HomeScreenWeaponsState
    object Loading : HomeScreenWeaponsState
}
