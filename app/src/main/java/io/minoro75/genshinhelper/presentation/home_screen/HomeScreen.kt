@file:OptIn(ExperimentalMaterial3Api::class)

package io.minoro75.genshinhelper.presentation.home_screen.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.domain.model.Character
import io.minoro75.genshinhelper.domain.model.TodayWeaponResources
import io.minoro75.genshinhelper.presentation.common.LoadingScreen
import io.minoro75.genshinhelper.presentation.home_screen.HomeScreenViewModel
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme
import io.minoro75.genshinhelper.presentation.theme.GenshinTypography

@Composable
fun HomeScreen(
    viewModel: HomeScreenViewModel = hiltViewModel(),
    onCharacterClick: (String) -> Unit,
    onItemClick: (String) -> Unit
) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()

    if (state.isLoading) {
        LoadingScreen()
    } else {

        Column(
            modifier =
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .padding(
                    16.dp
                )
        ) {

            OutlinedCard(
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                colors = CardDefaults.outlinedCardColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                border = BorderStroke(2.dp, SolidColor(MaterialTheme.colorScheme.primary))
            ) {
                Text(
                    text = stringResource(id = R.string.greeting),
                    style = GenshinTypography.bodyLarge,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(16.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            TodayBooksView(
                books = state.todayBooks,
                onCharacterClick = onCharacterClick, onItemClick = onItemClick
            )

            Spacer(modifier = Modifier.height(16.dp))

            TodayWeapons(
                list = state.todayWeaponResources,
                onItemClick = onItemClick
            )
        }

    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(device = Devices.NEXUS_5)
@Composable
fun PreviewHomeScreen() {
    GenshinHelperTheme {
        Column(
            modifier =
            Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .padding(
                    16.dp
                )
        ) {
            OutlinedCard(
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                colors = CardDefaults.outlinedCardColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                border = BorderStroke(2.dp, SolidColor(MaterialTheme.colorScheme.primary))
            ) {
                Text(
                    text = "Welcome, Traveler here is your daily adventures",
                    style = GenshinTypography.bodyLarge,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(16.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            TodayBooksView(
                books = listOf(
                    io.minoro75.genshinhelper.domain.model.TodayBooks(
                        "Prosperity",
                        "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
                        listOf(
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/e/e5/Aloy_Icon.png/revision/latest"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 4,
                                imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/e/e5/Aloy_Icon.png/revision/latest"
                            )
                        )
                    ),
                    io.minoro75.genshinhelper.domain.model.TodayBooks(
                        "Prosperity",
                        "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
                        listOf(
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/e/e5/Aloy_Icon.png/revision/latest"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 4,
                                imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/e/e5/Aloy_Icon.png/revision/latest"
                            )
                        )
                    ),
                    io.minoro75.genshinhelper.domain.model.TodayBooks(
                        "Prosperity",
                        "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
                        listOf(
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/e/e5/Aloy_Icon.png/revision/latest"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 4,
                                imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/e/e5/Aloy_Icon.png/revision/latest"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/e/e5/Aloy_Icon.png/revision/latest"
                            )
                        )
                    ),
                    io.minoro75.genshinhelper.domain.model.TodayBooks(
                        "Prosperity",
                        "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
                        listOf(
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/e/e5/Aloy_Icon.png/revision/latest"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 4,
                                imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/e/e5/Aloy_Icon.png/revision/latest"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/e/e5/Aloy_Icon.png/revision/latest"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/e/e5/Aloy_Icon.png/revision/latest"
                            )
                        )
                    )
                ),
                {},
                {}
            )

            Spacer(modifier = Modifier.height(16.dp))

            TodayWeapons(
                list = listOf(
                    TodayWeaponResources(
                        "Dandelion Gladiator",
                        "https://paimon.moe/images/items/dream_of_the_dandelion_gladiator.png"
                    ),
                    TodayWeaponResources(
                        "Dandelion Gladiator",
                        "https://paimon.moe/images/items/dream_of_the_dandelion_gladiator.png"
                    ),
                    TodayWeaponResources(
                        "Dandelion Gladiator",
                        "https://paimon.moe/images/items/dream_of_the_dandelion_gladiator.png"
                    ),
                    TodayWeaponResources(
                        "Dandelion Gladiator",
                        "https://paimon.moe/images/items/dream_of_the_dandelion_gladiator.png"
                    ),
                    TodayWeaponResources(
                        "Dandelion Gladiator",
                        "https://paimon.moe/images/items/dream_of_the_dandelion_gladiator.png"
                    ),
                    TodayWeaponResources(
                        "Dandelion Gladiator",
                        "https://paimon.moe/images/items/dream_of_the_dandelion_gladiator.png"
                    ),
                    TodayWeaponResources(
                        "Dandelion Gladiator",
                        "https://paimon.moe/images/items/dream_of_the_dandelion_gladiator.png"
                    ),
                    TodayWeaponResources(
                        "Dandelion Gladiator",
                        "https://paimon.moe/images/items/dream_of_the_dandelion_gladiator.png"
                    ),
                    TodayWeaponResources(
                        "Dandelion Gladiator",
                        "https://paimon.moe/images/items/dream_of_the_dandelion_gladiator.png"
                    )
                ),
                {}
            )
        }
    }
}


