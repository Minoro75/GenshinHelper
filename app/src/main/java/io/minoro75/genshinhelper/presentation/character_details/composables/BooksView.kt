package io.minoro75.genshinhelper.presentation.character_details.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme
import io.minoro75.genshinhelper.presentation.theme.GenshinTypography
import java.util.*

@Composable
fun BooksView(
    url: String,
    name: String,
    daysAvailable: String,
    textColor: Color,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier) {
        Item(
            url = url,
            loadingPlaceholder = R.drawable.books_loading,
            errorPlaceholder = R.drawable.books_no_internet,
            name = name,
            rarity = 4,
            textWidth = 80.dp,
            textStyle = GenshinTypography.bodySmall,
            modifier = Modifier.size(80.dp)

        )
        val daysList = daysAvailable.split("/")
        Spacer(modifier = Modifier.width(8.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Availalbe at:",
                color = textColor,
                style = GenshinTypography.bodyMedium
            )
            Text(
                text = daysList[0].lowercase(Locale.getDefault())
                    .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() },
                color = textColor,
                style = GenshinTypography.bodyMedium
            )
            Text(
                text = daysList[1].lowercase(Locale.getDefault())
                    .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() },
                color = textColor,
                style = GenshinTypography.bodyMedium
            )
            Text(
                text = daysList[2].lowercase(Locale.getDefault())
                    .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() },
                color = textColor,
                style = GenshinTypography.bodyMedium
            )
        }

    }


}

@Preview
@Composable
fun PreviewBooks() {
    GenshinHelperTheme {
        BooksView(
            url = "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
            name = "Resistance",
            daysAvailable = "MON/THU/SUN",
            textColor = MaterialTheme.colorScheme.onPrimaryContainer
        )
    }
}
