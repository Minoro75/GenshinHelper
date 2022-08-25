package io.minoro75.genshinhelper.presentation.character_card

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
import io.minoro75.genshinhelper.domain.model.CharacterModel
import io.minoro75.genshinhelper.presentation.theme.*


@Composable
fun CharacterItem(
    character: CharacterModel, modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .width(150.dp)
            .height(170.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(ItemBackground)

    ) {

        AsyncImageWithBackground(
            model = ImageRequest.Builder(LocalContext.current)
                .data(character.imageUrl)
                .crossfade(true)
                .build(),
            contentDescription = character.name,
            placeholder = painterResource(id = R.drawable.placeholder),
            contentScale = ContentScale.FillBounds,
            background = when (character.rarity) {
                4 -> R.drawable.item_4_star
                5 -> R.drawable.item_5_star
                else -> throw IllegalArgumentException("No such rarity")
            },
            elementImage = when (character.element) {
                "anemo" -> R.drawable.anemo
                "pyro" -> R.drawable.pyro
                "hydro" -> R.drawable.hydro
                "electro" -> R.drawable.electro
                "geo" -> R.drawable.geo
                "cryo" -> R.drawable.cryo
                else -> throw IllegalArgumentException("No such element")

            },
            modifier = modifier
                .fillMaxWidth()
                .height(130.dp)
                .clip(RightCornerShape)
        )

        Text(
            text = character.name, style = GenshinTypography.bodyLarge,
            color = TextColor,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(top = 5.dp, start = 8.dp, end = 8.dp)
        )
    }
}

@Composable
fun AsyncImageWithBackground(
    model: Any?,
    contentDescription: String?,
    placeholder: Painter?,
    contentScale: ContentScale,
    @DrawableRes background: Int,
    @DrawableRes elementImage: Int,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Image(
            painter = painterResource(id = background),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = modifier.matchParentSize()

        )
        AsyncImage(
            model = model,
            contentDescription = contentDescription,
            placeholder = placeholder,
            contentScale = contentScale,
            modifier = modifier.matchParentSize()
        )

        Image(
            painter = painterResource(id = elementImage),
            contentDescription = null,
            modifier = Modifier
                .padding(3.dp)
                .size(30.dp)
                .align(Alignment.TopStart)
        )
    }
}

@Preview
@Composable
fun ItemPreview() {
    GenshinHelperTheme {
        CharacterItem(
            CharacterModel(
                "Animeshka", 4, "anemo",
                "bow", "https://paimon.moe/images/characters/lisa.png"
            )
        )
    }
}
