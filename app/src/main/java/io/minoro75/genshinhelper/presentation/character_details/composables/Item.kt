package io.minoro75.genshinhelper.presentation.character_details.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.request.ImageRequest
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.presentation.common.AsyncImageWithBackground
import io.minoro75.genshinhelper.presentation.theme.GenshinTypography
import io.minoro75.genshinhelper.presentation.theme.ItemBackground
import io.minoro75.genshinhelper.presentation.theme.RightCornerShape
import io.minoro75.genshinhelper.presentation.theme.TextColor

@Composable
fun Item(
    url: String,
    loadingPlaceholder: Int,
    errorPlaceholder: Int,
    name: String,
    rarity: Int,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .width(65.dp)
            .wrapContentHeight()
            .clip(RoundedCornerShape(10.dp))
            .background(ItemBackground)
    ) {
        AsyncImageWithBackground(
            model = ImageRequest.Builder(LocalContext.current)
                .data(url)
                .crossfade(true)
                .build(),
            contentDescription = name,
            placeholder = painterResource(id = loadingPlaceholder),
            error = painterResource(id = errorPlaceholder),
            contentScale = ContentScale.FillBounds,
            background = when (rarity) {
                3 -> R.drawable.background_rarity_3_star
                4 -> R.drawable.background_rarity_4_star
                5 -> R.drawable.background_rarity_5_star
                else -> throw IllegalArgumentException("No such rarity")
            },
            elementImage = null,
            modifier = modifier
                .fillMaxWidth()
                .height(65.dp)
                .clip(RightCornerShape)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = name, style = GenshinTypography.bodySmall,
            color = TextColor,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(start = 8.dp, end = 8.dp)
        )
        Spacer(modifier = Modifier.height(4.dp))
    }
}

@Preview
@Composable
fun ItemPreview() {
    Item(
        url = "",
        loadingPlaceholder = R.drawable.books_loading,
        errorPlaceholder = R.drawable.books_no_internet,
        name = "Praxis",
        rarity = 3
    )
}
