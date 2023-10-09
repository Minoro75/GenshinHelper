package io.minoro75.genshinhelper.presentation.character_details.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

@Composable
fun TalentsPriorityView(
    priority: PersistentList<String>,
    modifier: Modifier = Modifier
) {
    OutlinedCard(
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.outlinedCardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        border = BorderStroke(2.dp, SolidColor(MaterialTheme.colorScheme.primary))
    ) {
        Column(modifier = modifier.padding(8.dp)) {
            TalentsPriority(
                priority = priority,
                textColor = MaterialTheme.colorScheme.onPrimaryContainer
            )
        }
    }
}

@Preview
@Composable
fun PreviewTalentsPriorityView() {
    GenshinHelperTheme {
        TalentsPriorityView(
            priority = persistentListOf(
                "Burst",
                "Skill",
                "Attack"
            )
        )
    }
}