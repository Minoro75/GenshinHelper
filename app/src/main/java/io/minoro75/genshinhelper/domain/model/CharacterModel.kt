package io.minoro75.genshinhelper.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class CharacterModel(
    val name: String,
    val rarity: Int,
    val element: String,
    val weapon: String,
    @SerialName("image_url")
    val imageUrl: String
)

