package io.minoro75.genshinhelper.presentation.characters_list_screen.composables

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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.request.ImageRequest
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.domain.model.CharacterModel
import io.minoro75.genshinhelper.presentation.common.AsyncImageWithBackground
import io.minoro75.genshinhelper.presentation.theme.*

@Composable
fun CharacterItem(
    character: CharacterModel,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .width(130.dp)
            .wrapContentHeight()
            .clip(RoundedCornerShape(10.dp))
            .background(ItemBackground)

    ) {
        AsyncImageWithBackground(
            model = ImageRequest.Builder(LocalContext.current)
                .data(character.imageUrl)
                .crossfade(true)
                .build(),
            contentDescription = character.name,
            placeholder = painterResource(id = R.drawable.placeholder_loading),
            error = painterResource(id = R.drawable.placeholder_no_internet),
            contentScale = ContentScale.FillBounds,
            background = when (character.rarity) {
                4 -> R.drawable.background_rarity_4_star
                5 -> R.drawable.background_rarity_5_star
                else -> throw IllegalArgumentException("No such rarity")
            },
            elementImage = when (character.element) {
                "anemo" -> R.drawable.anemo
                "pyro" -> R.drawable.pyro
                "hydro" -> R.drawable.hydro
                "electro" -> R.drawable.electro
                "geo" -> R.drawable.geo
                "cryo" -> R.drawable.cryo
                "dendro" -> R.drawable.dendro
                else -> throw IllegalArgumentException("No such element")

            },
            modifier = modifier
                .fillMaxWidth()
                .height(130.dp)
                .clip(RightCornerShape)
        )

        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = character.name, style = GenshinTypography.headlineLarge,
            color = TextColor,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(start = 8.dp, end = 8.dp)
        )
        Spacer(modifier = Modifier.height(4.dp))
    }
}

@Preview
@Composable
fun CharaterItemPreview() {
    GenshinHelperTheme {
        CharacterItem(
            CharacterModel(
                "Animeshka", 4, "anemo",
                "bow", "https://paimon.moe/images/characters/lisa.png"
            )
        )
    }
}
