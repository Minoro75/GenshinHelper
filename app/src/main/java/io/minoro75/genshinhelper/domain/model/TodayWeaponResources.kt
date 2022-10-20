package io.minoro75.genshinhelper.domain.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TodayWeaponResources(
    val name: String,
    val url: String
)
