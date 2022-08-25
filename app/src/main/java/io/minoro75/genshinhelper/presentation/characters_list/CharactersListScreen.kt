package io.minoro75.genshinhelper.presentation.characters_list

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import io.minoro75.genshinhelper.presentation.character_card.CharacterItem

@Composable
fun CharactersListScreen(
    viewModel : CharactersListViewModel = hiltViewModel()
) {
    val state = viewModel.state

    LazyVerticalGrid(columns = GridCells.Fixed(3),
        contentPadding = PaddingValues(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    modifier = Modifier.fillMaxSize()){
        items(state.characters.size) {index ->
            CharacterItem(state.characters[index],
            modifier = Modifier
                .clickable {
                // TODO: implement click 
            }
            )
        }
    }
}