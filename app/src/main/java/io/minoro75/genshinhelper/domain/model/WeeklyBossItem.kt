package io.minoro75.genshinhelper.domain.model

import com.squareup.moshi.Json

data class WeeklyBossItem(
    @Json(name = "boss_item_name")
    val bossItemName: String,
    @Json(name = "boss_item_url")
    val bossItemUrl: String
)
