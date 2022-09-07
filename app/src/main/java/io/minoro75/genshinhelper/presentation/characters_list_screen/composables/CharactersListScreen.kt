package io.minoro75.genshinhelper.presentation.characters_list_screen.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.presentation.characters_list_screen.CharactersListViewModel
import io.minoro75.genshinhelper.presentation.common.GenshinBottomNavigation
import io.minoro75.genshinhelper.presentation.theme.GenshinTypography
import kotlin.random.Random

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CharactersListScreen(
    viewModel: CharactersListViewModel = hiltViewModel()
) {
    val state = viewModel.state

    // this vals and modifier.nested scroll creates effect of collapsing
    val appBarState = rememberTopAppBarScrollState()
    val scrollBehavior = remember { TopAppBarDefaults.enterAlwaysScrollBehavior(appBarState) }


    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            CenterAlignedTopAppBar(title = { TopBar() }
                , scrollBehavior = scrollBehavior)
        },
        bottomBar = { GenshinBottomNavigation()},
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
    val imageState = remember {
        mutableStateOf(0)
    }

    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(painter = painterResource(id = generateNewElement(imageState.value)),
            contentDescription = "icon",
        modifier = Modifier.clickable {
            imageState.value = Random.nextInt(0,6)
        })
        Spacer(modifier = Modifier.width(5.dp))
        Text(text = "Genshin Helper", style = GenshinTypography.bodyLarge)
    }
}

fun generateNewElement(current: Int): Int{
    return when(current){
        0 -> R.drawable.cryo
        1 -> R.drawable.anemo
        2 -> R.drawable.geo
        3 -> R.drawable.electro
        4 -> R.drawable.hydro
        5 -> R.drawable.dendro
        6 -> R.drawable.pyro
        else -> R.drawable.electro
    }
}


