package io.minoro75.genshinhelper.presentation.characters_list

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.presentation.character_card.CharacterItem
import io.minoro75.genshinhelper.presentation.theme.GenshinTypography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CharactersListScreen(
    viewModel: CharactersListViewModel = hiltViewModel()
) {
    val state = viewModel.state

    val appBarState = rememberTopAppBarScrollState()
    val scrollBehavior = remember { TopAppBarDefaults.enterAlwaysScrollBehavior(appBarState) }


    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            CenterAlignedTopAppBar(title = { TopBar()}
                , scrollBehavior = scrollBehavior)
        },
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

@Preview
@Composable
fun TopBar() {
    Row {
        Image(painter = painterResource(id = R.drawable.cryo), contentDescription = "icon")
        Spacer(modifier = Modifier.width(15.dp))
        Text(text = "Genshin Helper", style = GenshinTypography.bodyLarge)
        Spacer(modifier = Modifier.width(15.dp))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun scrollableBar() {
    val topAppBarScrollState: TopAppBarScrollState = rememberTopAppBarScrollState()
    val scrollBehavior =
        remember { TopAppBarDefaults.enterAlwaysScrollBehavior(topAppBarScrollState) }

    CenterAlignedTopAppBar(
        title = { Text(text = "OLEGGGGGG") },
        scrollBehavior = scrollBehavior
    )
}


