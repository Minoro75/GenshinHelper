package io.minoro75.genshinhelper.presentation.characters_list_screen.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import io.minoro75.genshinhelper.presentation.characters_list_screen.CharactersListViewModel
import io.minoro75.genshinhelper.presentation.common.LoadingScreen

@Composable
fun CharactersListScreen(
    onCharacterClicked: (String) -> Unit,
    viewModel: CharactersListViewModel = hiltViewModel()

) {
    val uiState by viewModel.state.collectAsStateWithLifecycle()

    if (uiState.isLoading) {
        LoadingScreen()
    } else {

        val size = remember {
            mutableIntStateOf(0)
        }

        val density = LocalDensity.current.density
        val padding = WindowInsets.statusBars.asPaddingValues()
        LazyVerticalGrid(
            columns = GridCells.Adaptive(100.dp),
            contentPadding = PaddingValues(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .fillMaxSize()
                .onGloballyPositioned {
                    size.intValue = it.size.width
                }

        ) {
            val sizeDp = (size.intValue / density).toInt()
            val rowsCount: Int = (sizeDp / 116)
            if (size.intValue != 0) {
                repeat(rowsCount) {
                    item {
                        Spacer(modifier = Modifier.height(padding.calculateTopPadding()))
                    }
                }
            }
            items(uiState.charactersList) { character ->
                CharacterItem(character,
                    modifier = Modifier
                        .clickable {
                            onCharacterClicked.invoke(character.name)
                        }
                )
            }
        }
    }
}

@Composable
fun Int.pxToDp() = with(LocalDensity.current) { this@pxToDp.toDp() }
