package io.minoro75.genshinhelper.presentation.character_details.composables

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import coil.request.ImageRequest
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.domain.model.TalentsBooks
import io.minoro75.genshinhelper.presentation.character_details.CharacterDetailsScreenViewModel
import io.minoro75.genshinhelper.presentation.common.Rarity
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme
import io.minoro75.genshinhelper.presentation.theme.GenshinTypography

@Composable
fun CharacterScreen(
    name: String,
    viewModel: CharacterDetailsScreenViewModel = hiltViewModel()
) {
    val state = viewModel.state

    if (state.isLoading) {
        CircularProgressIndicator(modifier = Modifier.size(20.dp))
    } else if (state.errorMessage == null) {
        Column(
            modifier =
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(
                    16.dp
                )
        ) {

            state.characterDetails?.let { character ->

            }

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(uiMode = UI_MODE_NIGHT_NO)
@Composable
fun CharacterPreview() {
    GenshinHelperTheme {
        Column(
            modifier =
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .padding(
                    16.dp
                )
        ) {

            CharacterInfoView(
                imageUrl = "https://paimon.moe/images/characters/ganyu.png",
                rarity = 5,
                element = "cryo",
                name = "Sangonomiya Kokomi",
                weapon = "catalyst",
                talentsBooks = TalentsBooks(
                    bookUrl = "https://paimon.moe/images/items/philosophies_of_freedom.png",
                    bookName = "Freedom",
                    bookDays = "MON/THU/SUN"
                )
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
                url = "https://paimon.moe/images/items/dvalins_sigh.png"
            )

            Spacer(Modifier.height(16.dp))

        }
    }
}