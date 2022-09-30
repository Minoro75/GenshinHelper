package io.minoro75.genshinhelper.presentation.character_details.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.presentation.common.AsyncImageWithBackground
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme
import io.minoro75.genshinhelper.presentation.theme.GenshinTypography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WeeklyBossItem(
    name: String,
    url: String,
    textColor: Color,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            OutlinedCard(
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                colors = CardDefaults.outlinedCardColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                ),
                border = BorderStroke(
                    2.dp,
                    SolidColor(MaterialTheme.colorScheme.primary)
                )
            ) {
                AsyncImageWithBackground(
                    model = url,
                    contentDescription = "",
                    placeholder = painterResource(id = R.drawable.boss_loading),
                    error = painterResource(id = R.drawable.boss_no_internet),
                    contentScale = ContentScale.FillBounds,
                    background = R.drawable.background_rarity_5_star,
                    elementImage = null,
                    Modifier
                        .size(70.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
            }

            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = name,
                color = textColor,
                style = GenshinTypography.bodyMedium
            )
        }
    }
}

@Preview
@Composable
fun PreviewWeeklyBossItem() {
    GenshinHelperTheme {
        WeeklyBossItem(
            name = "Dvalin's Sigh",
            url = "https://paimon.moe/images/items/dvalins_sigh.png",
            textColor = MaterialTheme.colorScheme.onPrimaryContainer
        )
    }
}