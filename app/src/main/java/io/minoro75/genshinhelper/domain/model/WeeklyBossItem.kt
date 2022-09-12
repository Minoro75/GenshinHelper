package io.minoro75.genshinhelper.domain.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WeeklyBossItem(
    @Json(name = "boss_item_name")
    val bossItemName: String,
    @Json(name = "boss_item_url")
    val bossItemUrl: String
)
