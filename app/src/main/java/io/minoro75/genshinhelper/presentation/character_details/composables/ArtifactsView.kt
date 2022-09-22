package io.minoro75.genshinhelper.presentation.character_details.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.domain.model.Artifact
import io.minoro75.genshinhelper.presentation.theme.ArtifactCornerShape
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme
import io.minoro75.genshinhelper.presentation.theme.GenshinTypography
import io.minoro75.genshinhelper.presentation.theme.ItemBackground
import io.minoro75.genshinhelper.presentation.theme.TextColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ArtifactsView(artifacts: List<Artifact>) {
    OutlinedCard(
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.outlinedCardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        modifier = Modifier.fillMaxWidth(),
        border = BorderStroke(2.dp, SolidColor(MaterialTheme.colorScheme.primary))
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Artifacts",
            style = GenshinTypography.bodyLarge,
            color = MaterialTheme.colorScheme.onPrimaryContainer,
            modifier = Modifier.align(CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Artifacts(
            artifacts = artifacts,
            modifier = Modifier.align(CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Artifacts Stats",
            style = GenshinTypography.bodyLarge,
            color = MaterialTheme.colorScheme.onPrimaryContainer,
            modifier = Modifier.align(CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(4.dp))
        ArtifactsStats(artifact = artifacts[0])
        Spacer(modifier = Modifier.height(8.dp))

    }
}

@Composable
fun ArtifactsStats(artifact: Artifact) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        ArtifactStatsItem(artifact.artifactCirclet, R.drawable.circlet)
        ArtifactStatsItem(artifact.artifactGobelet, R.drawable.goblet)
        ArtifactStatsItem(artifact.artifactSands, R.drawable.sands)
    }
}

@Composable
fun Artifacts(artifacts: List<Artifact>, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        if (artifacts.size == 1) {
            ArtifactItem(artifact = artifacts[0])
        } else {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                ArtifactItem(artifact = artifacts[0])
                Spacer(modifier = Modifier.width(16.dp))
                ArtifactItem(artifact = artifacts[1])
            }
        }
    }

}

@Composable
fun ArtifactItem(artifact: Artifact) {
    Box {
        Item(
            url = artifact.artifactUrl,
            loadingPlaceholder = R.drawable.flower_loading,
            errorPlaceholder = R.drawable.flower_no_internet,
            name = artifact.artifactName,
            rarity = 5,
            textWidth = 100.dp,
            textStyle = GenshinTypography.bodyMedium,
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
        )
        Text(
            text = artifact.artifactAmount.toString(),
            color = TextColor,
            style = GenshinTypography.bodyLarge,
            modifier = Modifier
                .background(color = ItemBackground, shape = ArtifactCornerShape)
                .align(Alignment.TopEnd)
                .padding(end = 2.dp, start = 2.dp)
        )
    }

}

@Composable
fun ArtifactStatsItem(
    stat: String,
    image: Int
) {
    Column(
        modifier = Modifier
            .wrapContentWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(10.dp))
            .background(ItemBackground)
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = "circlet",
            modifier = Modifier.size(90.dp)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = stat,
            style = GenshinTypography.bodyMedium,
            color = TextColor,
            modifier = Modifier
                .width(90.dp)
                .align(alignment = CenterHorizontally)
                .padding(start = 8.dp, end = 8.dp)
        )
        Spacer(modifier = Modifier.height(4.dp))
    }

}

@Preview
@Composable
fun Preview4Artifacts() {
    GenshinHelperTheme {
        ArtifactsView(
            listOf(
                Artifact(
                    artifactAmount = 4,
                    artifactCirclet = "HP%",
                    artifactGobelet = "Electro DPS",
                    artifactName = "Shadow Burner of Amity",
                    artifactSands = "Crit rate / crit DPS",
                    artifactUrl = "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png"
                )
            )
        )
    }
}

@Preview
@Composable
fun Preview2Artifacts() {
    GenshinHelperTheme {
        ArtifactsView(
            listOf(
                Artifact(
                    artifactAmount = 2,
                    artifactCirclet = "ATK%",
                    artifactGobelet = "Electro DPS",
                    artifactName = "Blizzard Strayer",
                    artifactSands = "CRIT Rate / CRIT DMG",
                    artifactUrl = "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png"
                ),
                Artifact(
                    artifactAmount = 2,
                    artifactCirclet = "HP%",
                    artifactGobelet = "Electro DPS",
                    artifactName = "Shadow Burner of Amity",
                    artifactSands = "Crit rate / crit DPS",
                    artifactUrl = "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png"
                )
            )
        )
    }
}