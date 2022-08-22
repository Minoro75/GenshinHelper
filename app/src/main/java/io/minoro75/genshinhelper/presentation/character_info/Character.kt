package io.minoro75.genshinhelper.presentation.character_info

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.presentation.theme.*


@Composable
fun CharacterItem(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .width(150.dp)
            .height(200.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(ItemBackground)

    ) {

        AsyncImageWithBackground(
            model = ImageRequest.Builder(LocalContext.current)
                .data("https://paimon.moe/images/characters/lisa.png")
                .crossfade(true)
                .build(),
            contentDescription = "Lisa",
            placeholder = painterResource(id = R.drawable.placeholder),
            contentScale = ContentScale.FillBounds,
            background = R.drawable.item_4_star,
            modifier = modifier
                .fillMaxWidth()
                .height(150.dp)
                .clip(RightCornerShape)
        )

        Text(text = "Sangonomiya Kokomi", style = GenshinTypography.bodyLarge,
            color = TextColor,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            .padding(top = 5.dp, start = 8.dp, end = 8.dp))
    }
}

@Composable
fun AsyncImageWithBackground(
    model: Any?,
    contentDescription: String?,
    placeholder: Painter?,
    contentScale: ContentScale,
    @DrawableRes background: Int,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Image(
            painter = painterResource(id = background),
            contentDescription = null,
            modifier = modifier.matchParentSize()
        )
        AsyncImage(
            model = model,
            contentDescription = contentDescription,
            placeholder = placeholder,
            contentScale = contentScale,
            modifier = modifier.matchParentSize()
        )
    }
}

@Preview
@Composable
fun ItemPreview() {
    GenshinHelperTheme {
        CharacterItem()
    }
}