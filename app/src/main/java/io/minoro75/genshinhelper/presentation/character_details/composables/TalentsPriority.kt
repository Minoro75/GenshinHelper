package io.minoro75.genshinhelper.presentation.character_details.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme
import io.minoro75.genshinhelper.presentation.theme.GenshinTypography

@Composable
fun TalentsPriority(priority: List<String>, textColor: Color, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = stringResource(id = R.string.talents_priority),
            style = GenshinTypography.bodyLarge,
            color = textColor
        )


        Row(
            modifier = modifier.height(25.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = priority[0],
                style = GenshinTypography.bodyMedium,
                color = textColor
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = ">",
                style = GenshinTypography.bodyMedium,
                color = textColor
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = priority[1],
                style = GenshinTypography.bodyMedium,
                color = textColor
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = ">",
                style = GenshinTypography.bodyMedium,
                color = textColor
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = priority[2],
                style = GenshinTypography.bodyMedium,
                color = textColor
            )

        }
    }

}

@Preview
@Composable
fun PreviewTalentsPriority() {
    GenshinHelperTheme {
        TalentsPriority(
            listOf(
                "Burst",
                "Skill",
                "Attack"
            ),
            MaterialTheme.colorScheme.onPrimaryContainer
        )
    }
}
