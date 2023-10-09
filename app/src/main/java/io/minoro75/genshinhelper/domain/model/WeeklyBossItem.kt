package io.minoro75.genshinhelper.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeeklyBossItem(
    @SerialName("boss_item_name")
    val bossItemName: String,
    @SerialName("boss_item_url")
    val bossItemUrl: String
)
