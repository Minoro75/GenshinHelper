package io.minoro75.genshinhelper.presentation.common

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun GenshinBottomNavigation(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    NavigationBar(containerColor = MaterialTheme.colorScheme.background) {
        NavigationBarItem(selected = currentRoute == NavigationItem.Home.route,
            icon = {
                Icon(
                    painter = painterResource(id = NavigationItem.Home.icon),
                    contentDescription = ""
                )
            },
            label = { Text(text = stringResource(id = NavigationItem.Home.title)) },
            onClick = {
                navController.navigate(NavigationItem.Home.route) {
                    launchSingleTop = true
                }
            })

        NavigationBarItem(selected = currentRoute == NavigationItem.Characters.route,
            icon = {
                Icon(
                    painter = painterResource(id = NavigationItem.Characters.icon),
                    contentDescription = ""
                )
            },
            label = { Text(text = stringResource(id = NavigationItem.Characters.title)) },
            onClick = {
                navController.navigate(NavigationItem.Characters.route) {
                    launchSingleTop = true
                }
            })

        NavigationBarItem(selected = currentRoute == NavigationItem.Map.route,
            onClick = {
                navController.navigate(NavigationItem.Map.route) {
                    launchSingleTop = true
                    restoreState = true
                }
            },
            icon = {
                Icon(
                    painter = painterResource(id = NavigationItem.Map.icon),
                    contentDescription = ""
                )
            },
            label = { Text(text = stringResource(id = NavigationItem.Map.title)) })

        NavigationBarItem(selected = currentRoute == NavigationItem.Info.route,
            icon = {
                Icon(
                    painter = painterResource(id = NavigationItem.Info.icon),
                    contentDescription = ""
                )
            },
            label = { Text(text = stringResource(id = NavigationItem.Info.title)) },
            onClick = {
                navController.navigate(NavigationItem.Info.route) {
                    launchSingleTop = true
                }
            })
    }
}