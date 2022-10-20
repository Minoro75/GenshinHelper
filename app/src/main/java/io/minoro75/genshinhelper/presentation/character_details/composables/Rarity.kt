package io.minoro75.genshinhelper.presentation.common

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.minoro75.genshinhelper.presentation.theme.Rarity4
import io.minoro75.genshinhelper.presentation.theme.Rarity5

@Composable
fun Rarity(rarity: Int, modifier: Modifier) {
    Row(modifier) {
        when (rarity) {
            4 -> {
                Icon(
                    imageVector = Icons.Filled.Star, contentDescription = "",
                    tint = Rarity4
                )
                Icon(
                    imageVector = Icons.Filled.Star, contentDescription = "",
                    tint = Rarity4
                )
                Icon(
                    imageVector = Icons.Filled.Star, contentDescription = "",
                    tint = Rarity4
                )
                Icon(
                    imageVector = Icons.Filled.Star, contentDescription = "",
                    tint = Rarity4
                )
            }
            5 -> {
                Icon(
                    imageVector = Icons.Filled.Star, contentDescription = "",
                    tint = Rarity5
                )
                Icon(
                    imageVector = Icons.Filled.Star, contentDescription = "",
                    tint = Rarity5
                )
                Icon(
                    imageVector = Icons.Filled.Star, contentDescription = "",
                    tint = Rarity5
                )
                Icon(
                    imageVector = Icons.Filled.Star, contentDescription = "",
                    tint = Rarity5
                )
                Icon(
                    imageVector = Icons.Filled.Star, contentDescription = "",
                    tint = Rarity5
                )
            }
        }


    }
}

@Preview
@Composable
fun PreviewRarity() {
    Rarity(
        rarity = 5, modifier = Modifier
    )
}