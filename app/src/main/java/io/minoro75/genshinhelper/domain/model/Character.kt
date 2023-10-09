package io.minoro75.genshinhelper.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Character(
    val element: String,
    @SerialName("image_url")
    val imageUrl: String,
    val name: String,
    val rarity: Int
)