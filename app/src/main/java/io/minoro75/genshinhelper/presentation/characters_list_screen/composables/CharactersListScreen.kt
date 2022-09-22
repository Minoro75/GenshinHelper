package io.minoro75.genshinhelper.presentation.characters_list_screen.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import io.minoro75.genshinhelper.presentation.characters_list_screen.CharactersListViewModel
import io.minoro75.genshinhelper.presentation.common.NavigationItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CharactersListScreen(
    navHostController: NavHostController,
    viewModel: CharactersListViewModel = hiltViewModel()

) {
    val state = viewModel.state

    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        contentPadding = PaddingValues(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surfaceVariant)
    ) {
        items(state.characters.size) { index ->
            val character = state.characters[index]
            CharacterItem(state.characters[index],
                modifier = Modifier
                    .clickable {
                        navHostController.navigate("profile/${character.name}") {
                            popUpTo(NavigationItem.Characters.route)
                            launchSingleTop = true
                        }
                    }
            )
        }
    }

}
