package io.minoro75.genshinhelper.presentation.characters_list_screen.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import io.minoro75.genshinhelper.presentation.characters_list_screen.CharactersListViewModel

@Composable
fun CharactersListScreen(
    onCharacterClicked: (String) -> Unit,
    viewModel: CharactersListViewModel = hiltViewModel()

) {
    val state = viewModel.state

    LazyVerticalGrid(
        columns = GridCells.Adaptive(100.dp),
        contentPadding = PaddingValues(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surfaceVariant)
    ) {
        items(state.characters) { character ->
            CharacterItem(character,
                modifier = Modifier
                    .clickable {
                        onCharacterClicked.invoke(character.name)
                    }
            )
        }
    }

}
