package io.minoro75.genshinhelper.presentation.character_details.composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.minoro75.genshinhelper.domain.model.Artifact
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme

@Composable
fun Artifacts(artifacts : List<Artifact>) {

}

@Preview
@Composable
fun Preview4Artifacts() {
    GenshinHelperTheme {
        Artifacts(listOf(
            Artifact(
            4,"HP%","Electro DPS", "Shadow Burner of Amity",
            "Crit rate / crit DPS", "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png"
        )))
    }
}

@Preview
@Composable
fun Preview2Artifacts() {
    GenshinHelperTheme {
        Artifacts(listOf(
            Artifact(
                2,"HP%","Electro DPS", "Shadow Burner of Amity",
                "Crit rate / crit DPS", "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png"
            ),
            Artifact(
                2,"HP%","Electro DPS", "Shadow Burner of Amity",
                "Crit rate / crit DPS", "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png"
            )))
    }
}