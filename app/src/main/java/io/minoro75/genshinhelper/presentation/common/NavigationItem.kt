package io.minoro75.genshinhelper.presentation.common

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import io.minoro75.genshinhelper.R

sealed class NavigationItem(val route: String, val icon: Int, val title: Int) {
    object Home : NavigationItem(
        route = "home",
        icon = R.drawable.baseline_home_24,
        title = R.string.home
    )

    object Characters : NavigationItem(
        route = "characters",
        icon = R.drawable.ic_character,
        title = R.string.characters
    )

    object Map: NavigationItem(
        route = "map",
        icon =  R.drawable.ic_map,
        title = R.string.map
    )

    object Info : NavigationItem(
        route = "info",
        icon = R.drawable.ic_info,
        title = R.string.info
    )
}
