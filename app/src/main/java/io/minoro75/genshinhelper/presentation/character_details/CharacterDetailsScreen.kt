package io.minoro75.genshinhelper.presentation.character_details.composables

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import io.minoro75.genshinhelper.domain.model.Artifact
import io.minoro75.genshinhelper.domain.model.TalentsBooks
import io.minoro75.genshinhelper.domain.model.WeaponBest
import io.minoro75.genshinhelper.domain.model.WeaponsReplacement
import io.minoro75.genshinhelper.presentation.character_details.CharacterDetailsScreenViewModel
import io.minoro75.genshinhelper.presentation.common.LoadingScreen
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toPersistentList

@Composable
fun CharacterScreen(
    onBackPressed: () -> Unit,
    onItemClicked: (String) -> Unit,
    viewModel: CharacterDetailsScreenViewModel = hiltViewModel()
) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()

    if (state.isLoading) {
        LoadingScreen()
    } else {

        val details = state.charactersDetails!!
        Column(
            modifier =
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .systemBarsPadding()
                .padding(
                    16.dp
                )
        ) {
            CharacterInfoView(
                imageUrl = details.imageUrl,
                rarity = details.rarity,
                element = details.element,
                name = details.name,
                weapon = details.weapon,
                talentsBooks = details.talentBooks,
                onBackPressed = onBackPressed,
                onItemClicked = onItemClicked
            )
            Spacer(modifier = Modifier.height(16.dp))
            TalentsPriorityView(
                priority = details.talentsPriority.toPersistentList()
            )
            Spacer(modifier = Modifier.height(16.dp))
            WeeklyBossItemView(
                name = details.weeklyBossItem.bossItemName,
                url = details.weeklyBossItem.bossItemUrl,
                onItemClicked = onItemClicked
            )
            Spacer(Modifier.height(16.dp))
            YoutubeVideoPreviewView(videoId = details.videoGuide)
            Spacer(Modifier.height(16.dp))
            ArtifactsView(
                artifacts = details.artifacts.toPersistentList(),
                onItemClicked = onItemClicked
            )
            Spacer(Modifier.height(16.dp))
            WeaponsView(
                bis = details.weaponBest,
                replacements = details.weaponsReplacements.toPersistentList()
            )
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
                imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/7/79/Ganyu_Icon.png/revision/latest",
                rarity = 5,
                element = "cryo",
                name = "Sangonomiya Kokomi",
                weapon = "catalyst",
                talentsBooks = TalentsBooks(
                    bookUrl = "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
                    bookName = "Resistance",
                    bookDays = "Monday/Thursday/Sunday"
                ),
                onBackPressed = {},
                onItemClicked = {}
            )
            Spacer(modifier = Modifier.height(8.dp))
            TalentsPriorityView(
                priority = persistentListOf(
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
                artifacts = persistentListOf(
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
                replacements = persistentListOf(
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