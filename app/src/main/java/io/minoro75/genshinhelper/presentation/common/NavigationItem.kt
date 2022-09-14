package io.minoro75.genshinhelper.presentation.common

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector
import io.minoro75.genshinhelper.R

sealed class NavigationItem(val route: String, val icon: ImageVector, val title: Int) {
    object Home : NavigationItem(
        route = "home",
        icon = Icons.Default.Home,
        title = R.string.home
    )

    object Characters : NavigationItem(
        route = "characters",
        icon = Icons.Default.Person,
        title = R.string.characters
    )

    object Info : NavigationItem(
        route = "info",
        icon = Icons.Default.Info,
        title = R.string.info
    )
}
