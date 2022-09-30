@file:OptIn(ExperimentalMaterial3Api::class)

package io.minoro75.genshinhelper.presentation.home_screen.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import io.minoro75.genshinhelper.domain.model.Character
import io.minoro75.genshinhelper.domain.model.TodayWeaponResources
import io.minoro75.genshinhelper.presentation.home_screen.HomeScreenViewModel
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme
import io.minoro75.genshinhelper.presentation.theme.GenshinTypography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    viewModel: HomeScreenViewModel = hiltViewModel()
) {
    GenshinHelperTheme {
        val state = viewModel.state
        if (state.isLoading) {
            CircularProgressIndicator(modifier = Modifier.size(20.dp))
        } else if (state.errorMessage == null) {

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

                state.todayBooks?.let {
                    TodayBooks(it)
                }

                Spacer(modifier = Modifier.height(16.dp))

                state.todayWeaponResources?.let {
                    TodayWeapons(it)
                }
            }

        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview
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

            TodayBooks(
                books = listOf(
                    io.minoro75.genshinhelper.domain.model.TodayBooks(
                        "Prosperity",
                        "https://paimon.moe/images/items/philosophies_of_freedom.png",
                        listOf(
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 4,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 4,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 4,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            )
                        )
                    ),
                    io.minoro75.genshinhelper.domain.model.TodayBooks(
                        "Prosperity",
                        "https://paimon.moe/images/items/philosophies_of_freedom.png",
                        listOf(
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 4,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 4,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 4,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            )
                        )
                    ),
                    io.minoro75.genshinhelper.domain.model.TodayBooks(
                        "Prosperity",
                        "https://paimon.moe/images/items/philosophies_of_freedom.png",
                        listOf(
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 4,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 4,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 4,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            )
                        )
                    ),
                    io.minoro75.genshinhelper.domain.model.TodayBooks(
                        "Prosperity",
                        "https://paimon.moe/images/items/philosophies_of_freedom.png",
                        listOf(
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 4,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 4,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 5,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            ),
                            Character(
                                element = "cryo",
                                name = "Raiden Miku",
                                rarity = 4,
                                imageUrl = "https://paimon.moe/images/characters/aloy.png"
                            )
                        )
                    )
                )
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
                )
            )
        }
    }
}


