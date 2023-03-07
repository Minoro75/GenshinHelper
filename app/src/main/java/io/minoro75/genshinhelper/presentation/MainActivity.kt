package io.minoro75.genshinhelper.presentation

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import dagger.hilt.android.AndroidEntryPoint
import io.minoro75.genshinhelper.presentation.character_details.composables.CharacterScreen
import io.minoro75.genshinhelper.presentation.characters_list_screen.composables.CharactersListScreen
import io.minoro75.genshinhelper.presentation.common.GenshinBottomNavigation
import io.minoro75.genshinhelper.presentation.common.NavigationItem
import io.minoro75.genshinhelper.presentation.home_screen.composables.HomeScreen
import io.minoro75.genshinhelper.presentation.info.composables.InfoScreen
import io.minoro75.genshinhelper.presentation.item_location.composables.ItemLocationScreen
import io.minoro75.genshinhelper.presentation.map.MapScreen
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {

            GenshinHelperTheme {
                MainScreen()
            }
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun MainScreen() {
    val navController = rememberAnimatedNavController()
    Scaffold(
        bottomBar = { GenshinBottomNavigation(navController) }) { paddingValues ->

        val layoutDirection = LocalConfiguration.current.layoutDirection
        AnimatedNavHost(
            modifier = Modifier.padding(
                start = paddingValues.calculateStartPadding(
                    if (layoutDirection == 0) LayoutDirection.Ltr
                    else LayoutDirection.Rtl
                ),
                end = paddingValues.calculateEndPadding(
                    if (layoutDirection == 0) LayoutDirection.Ltr
                    else LayoutDirection.Rtl
                ),
                bottom = paddingValues.calculateBottomPadding(),
                top = 0.dp
            ),
            enterTransition = {
                val targetRoute = targetState.destination.route
                val initialRoute = initialState.destination.route
                val offset = enterOffsetFor(targetRoute, initialRoute)
                slideInHorizontally(
                    initialOffsetX = { offset },
                    animationSpec = spring(dampingRatio = Spring.DampingRatioNoBouncy)
                )

            },
            exitTransition = {
                val targetRoute = targetState.destination.route
                val initialRoute = initialState.destination.route
                val offset = exitOffsetFor(targetRoute, initialRoute)
                slideOutHorizontally(
                    targetOffsetX = { offset },
                    animationSpec = spring(dampingRatio = Spring.DampingRatioNoBouncy)
                )
            },
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

            composable(NavigationItem.Map.route) {
                MapScreen()
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

fun enterOffsetFor(targetRoute: String?, initialRoute: String?): Int {
    return when (initialRoute to targetRoute) {
        NavigationItem.Home.route to NavigationItem.Characters.route,
        NavigationItem.Home.route to NavigationItem.Map.route,
        NavigationItem.Home.route to NavigationItem.Info.route,
        NavigationItem.Characters.route to NavigationItem.Map.route,
        NavigationItem.Characters.route to NavigationItem.Info.route,
        NavigationItem.Map.route to NavigationItem.Info.route -> 1080

        NavigationItem.Info.route to NavigationItem.Map.route,
        NavigationItem.Info.route to NavigationItem.Characters.route,
        NavigationItem.Info.route to NavigationItem.Home.route,
        NavigationItem.Map.route to NavigationItem.Characters.route,
        NavigationItem.Map.route to NavigationItem.Home.route,
        NavigationItem.Characters.route to NavigationItem.Home.route -> -1080

        else -> 1080 // Always from right to left
    }
}

fun exitOffsetFor(targetRoute: String?, initialRoute: String?): Int {
    return when (initialRoute to targetRoute) {
        NavigationItem.Home.route to NavigationItem.Characters.route,
        NavigationItem.Home.route to NavigationItem.Map.route,
        NavigationItem.Home.route to NavigationItem.Info.route,
        NavigationItem.Characters.route to NavigationItem.Map.route,
        NavigationItem.Characters.route to NavigationItem.Info.route,
        NavigationItem.Map.route to NavigationItem.Info.route -> -1080

        NavigationItem.Info.route to NavigationItem.Map.route,
        NavigationItem.Info.route to NavigationItem.Characters.route,
        NavigationItem.Info.route to NavigationItem.Home.route,
        NavigationItem.Map.route to NavigationItem.Characters.route,
        NavigationItem.Map.route to NavigationItem.Home.route,
        NavigationItem.Characters.route to NavigationItem.Home.route -> 1080

        else -> -1080 // Always from right to left
    }
}

