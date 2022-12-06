package io.minoro75.genshinhelper.presentation

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import dagger.hilt.android.AndroidEntryPoint
import io.minoro75.genshinhelper.presentation.character_details.composables.CharacterScreen
import io.minoro75.genshinhelper.presentation.characters_list_screen.composables.CharactersListScreen
import io.minoro75.genshinhelper.presentation.common.GenshinBottomNavigation
import io.minoro75.genshinhelper.presentation.common.NavigationItem
import io.minoro75.genshinhelper.presentation.home_screen.composables.HomeScreen
import io.minoro75.genshinhelper.presentation.info.composables.InfoScreen
import io.minoro75.genshinhelper.presentation.item_location.composables.ItemLocationScreen
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
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
            startDestination = NavigationItem.Home.route
        ) {
            composable(NavigationItem.Home.route) {
                HomeScreen(
                    onCharacterClick = { clickedCharacterName ->
                        navController.navigate("profile/$clickedCharacterName") {
                            launchSingleTop = true
                            popUpTo(NavigationItem.Home.route)
                        }
                    },
                    onItemClick = { itemName ->
                        navController.navigate("item/$itemName") {
                            launchSingleTop = true
                            popUpTo(NavigationItem.Home.route)
                        }
                    })
            }
            composable(NavigationItem.Characters.route) {
                CharactersListScreen(onCharacterClicked = { characterName ->
                    navController.navigate("profile/$characterName") {
                        popUpTo(NavigationItem.Characters.route)
                        launchSingleTop = true
                    }
                })
            }
            composable(NavigationItem.Info.route) {
                InfoScreen()
            }
            composable(
                route = "profile/{name}",
                arguments = listOf(navArgument("name") { type = NavType.StringType })
            ) {
                CharacterScreen(
                    onBackPressed = { navController.popBackStack() },
                    onItemClicked = { itemName ->
                        navController.navigate("item/$itemName") {
                            launchSingleTop = true
                        }
                    }
                )
            }
            composable(
                route = "item/{itemName}",
                arguments = listOf(navArgument("itemName") { type = NavType.StringType })
            ) {
                ItemLocationScreen(onBackPressed = { navController.popBackStack() })
            }
        }

    }
}
