package io.minoro75.genshinhelper.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import io.minoro75.genshinhelper.presentation.characters_list_screen.composables.CharactersListScreen
import io.minoro75.genshinhelper.presentation.common.GenshinBottomNavigation
import io.minoro75.genshinhelper.presentation.common.NavigationItem
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            GenshinHelperTheme {
                MainScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { GenshinBottomNavigation(navController) }) { paddingValues ->
        NavHost(
            modifier = Modifier.padding(paddingValues),
            navController = navController,
            startDestination = NavigationItem.Characters.route
        ) {
            composable(NavigationItem.Home.route) {}
            composable(NavigationItem.Characters.route) { CharactersListScreen() }
            composable(NavigationItem.Info.route) {}
        }

    }
}
