package io.minoro75.genshinhelper.presentation.character_details.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme
import io.minoro75.genshinhelper.presentation.theme.GenshinTypography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WeeklyBossItemView(
    name: String,
    url: String,
    onItemClicked: (String) -> Unit
) {
    OutlinedCard(
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.outlinedCardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClicked.invoke(name) },
        border = BorderStroke(2.dp, SolidColor(MaterialTheme.colorScheme.primary))
    ) {
        Text(
            text = stringResource(id = R.string.weekly_boss),
            style = GenshinTypography.bodyLarge,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 8.dp)
        )
        WeeklyBossItem(
            name = name,
            url = url,
            textColor = MaterialTheme.colorScheme.onPrimaryContainer,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, bottom = 16.dp)
                .align(Alignment.Start)
        )
    }
}

@Preview
@Composable
fun PreviewWeeklyBossItemView() {
    GenshinHelperTheme {
        WeeklyBossItemView(
            name = "Dvalin's Sigh",
            url = "https://static.wikia.nocookie.net/gensin-impact/images/0/07/Item_Dvalin%27s_Sigh.png",
            {}
        )
    }
}