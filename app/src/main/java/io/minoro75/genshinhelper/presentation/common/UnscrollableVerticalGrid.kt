package io.minoro75.genshinhelper.presentation.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme

@Composable
fun UnscrollableVerticalGrid(
    list: List<Any>,
    item: @Composable () -> Unit
) {
    GenshinHelperTheme {
        Column(Modifier.fillMaxWidth().height(90.dp)) {
            Row {
                item
                item
                item
                item
                item
            }
        }
    }
}

@Preview
@Composable
fun PreviewUnscrollableVerticalGrid() {
    GenshinHelperTheme {
        UnscrollableVerticalGrid(listOf(1,2,3,4,5)
        ) {
            AsyncImageWithBackground(
                model = "",
                contentDescription = "aboba",
                placeholder = painterResource(id = R.drawable.placeholder_loading),
                error = painterResource(id = R.drawable.placeholder_no_internet),
                contentScale = ContentScale.FillBounds,
                background = R.drawable.background_rarity_4_star,
                elementImage = null,
                modifier = Modifier
                    .size(50.dp)
                    .clip(RoundedCornerShape(10.dp))
            )
        }
    }
}