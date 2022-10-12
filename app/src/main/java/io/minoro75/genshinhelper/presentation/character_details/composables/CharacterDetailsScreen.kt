package io.minoro75.genshinhelper.presentation.character_details.composables

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import io.minoro75.genshinhelper.domain.model.Artifact
import io.minoro75.genshinhelper.domain.model.TalentsBooks
import io.minoro75.genshinhelper.domain.model.WeaponBest
import io.minoro75.genshinhelper.domain.model.WeaponsReplacement
import io.minoro75.genshinhelper.presentation.character_details.CharacterDetailsScreenViewModel
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme

@Composable
fun CharacterScreen(
    onBackPressed: () -> Unit,
    onItemClicked: (String) -> Unit,
    viewModel: CharacterDetailsScreenViewModel = hiltViewModel()
) {
    val state = viewModel.state

    GenshinHelperTheme {

        if (state.isLoading) {
            CircularProgressIndicator(modifier = Modifier.size(20.dp))
        } else if (state.errorMessage == null) {

            state.characterDetails?.let { character ->

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
                    CharacterInfoView(
                        imageUrl = character.imageUrl,
                        rarity = character.rarity,
                        element = character.element,
                        name = character.name,
                        weapon = character.weapon,
                        talentsBooks = character.talentBooks,
                        onBackPressed = onBackPressed
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    TalentsPriorityView(
                        priority = character.talentsPriority
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    WeeklyBossItemView(
                        name = character.weeklyBossItem.bossItemName,
                        url = character.weeklyBossItem.bossItemUrl,
                        onItemClicked = onItemClicked
                    )
                    Spacer(Modifier.height(16.dp))
                    ArtifactsView(
                        artifacts = character.artifacts,
                        onItemClicked = onItemClicked
                    )
                    Spacer(Modifier.height(16.dp))
                    WeaponsView(
                        bis = character.weaponBest,
                        replacements = character.weaponsReplacements
                    )
                }
            }

        }
    }
}

@Preview(uiMode = UI_MODE_NIGHT_NO)
@Composable
fun CharacterPreview() {
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
            CharacterInfoView(
                imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/0/0a/Character_Ganyu_Thumb.png",
                rarity = 5,
                element = "cryo",
                name = "Sangonomiya Kokomi",
                weapon = "catalyst",
                talentsBooks = TalentsBooks(
                    bookUrl = "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
                    bookName = "Resistance",
                    bookDays = "MON/THU/SUN"
                ),
                onBackPressed = {}
            )
            Spacer(modifier = Modifier.height(8.dp))
            TalentsPriorityView(
                priority = listOf(
                    "Burst",
                    "Skill",
                    "Attack"
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            WeeklyBossItemView(
                name = "Dvalin's Sigh",
                url = "https://static.wikia.nocookie.net/gensin-impact/images/0/07/Item_Dvalin%27s_Sigh.png",
                onItemClicked = {}
            )
            Spacer(Modifier.height(16.dp))
            ArtifactsView(
                artifacts = listOf(
                    Artifact(
                        artifactAmount = 4,
                        artifactCirclet = "HP%",
                        artifactGobelet = "Electro DPS",
                        artifactName = "Shadow Burner of Amity",
                        artifactSands = "Crit rate / crit DPS",
                        artifactUrl = "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png"
                    )
                ),
                {}
            )
            Spacer(Modifier.height(16.dp))
            WeaponsView(
                bis = WeaponBest(
                    weaponRarity = 5,
                    weaponName = "Lost Prayer to the Sacred Winds",
                    weaponUrl = "https://paimon.moe/images/weapons/amos_bow.png"
                ),
                replacements = listOf(
                    WeaponsReplacement(
                        weaponRarity = 5,
                        weaponName = "Aqua Simulacra",
                        weaponUrl = "https://paimon.moe/images/weapons/aqua_simulacra.png"
                    ),
                    WeaponsReplacement(
                        weaponRarity = 4,
                        weaponName = "Prototype Crescent",
                        weaponUrl = "https://paimon.moe/images/weapons/prototype_crescent.png"
                    ),
                    WeaponsReplacement(
                        weaponRarity = 4,
                        weaponName = "Hamayumi",
                        weaponUrl = "https://paimon.moe/images/weapons/hamayumi.png"
                    )
                )
            )
        }
    }
}