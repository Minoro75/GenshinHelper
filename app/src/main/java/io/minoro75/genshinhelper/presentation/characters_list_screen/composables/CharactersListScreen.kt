package io.minoro75.genshinhelper.presentation.characters_list_screen.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import io.minoro75.genshinhelper.presentation.characters_list_screen.CharactersListViewModel
import io.minoro75.genshinhelper.presentation.common.GenshinBottomNavigation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CharactersListScreen(
    viewModel: CharactersListViewModel = hiltViewModel()
) {
    val state = viewModel.state

    Scaffold(
        bottomBar = { GenshinBottomNavigation() },
        content = {
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                contentPadding = PaddingValues(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                items(state.characters.size) { index ->
                    CharacterItem(state.characters[index],
                        modifier = Modifier
                            .clickable {
                                // TODO: implement click
                            }
                    )
                }
            }
        })
}
