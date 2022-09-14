package io.minoro75.genshinhelper.presentation.character_details.composables

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import io.minoro75.genshinhelper.R
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
            Row {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.placeholder),
                        contentDescription = "",
                        modifier = Modifier
                            .size(130.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(MaterialTheme.colorScheme.primaryContainer)
                            .border(
                                BorderStroke(2.dp, SolidColor(MaterialTheme.colorScheme.primary)),
                                RoundedCornerShape(10.dp)
                            )
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Rarity(rarity = 5, modifier = Modifier)
                }

                Spacer(modifier = Modifier.width(8.dp))
                Column(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .background(MaterialTheme.colorScheme.primaryContainer)
                        .border(
                            BorderStroke(2.dp, SolidColor(MaterialTheme.colorScheme.primary)),
                            RoundedCornerShape(8.dp)
                        )
                        .padding(16.dp)
                ) {
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Sangonomiya Kokomi",
                        style = GenshinTypography.bodyLarge,
                        color = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    WeaponType(weaponType = "polearm")
                }
            }

        }
    }
}