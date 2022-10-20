package io.minoro75.genshinhelper.domain.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Character(
    val element: String,
    @Json(name = "image_url")
    val imageUrl: String,
    val name: String,
    val rarity: Int
)