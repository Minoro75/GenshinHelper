package io.minoro75.genshinhelper.domain.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CharacterDetails(
    val artifacts: List<Artifact>,
    val element: String,
    @Json(name = "image_url")
    val imageUrl: String,
    val name: String,
    val rarity: Int,
    @Json(name = "talents_books")
    val talentBooks: TalentsBooks,
    @Json(name = "talents_priority")
    val talentsPriority: List<String>,
    val weapon: String,
    @Json(name = "weapon_best")
    val weaponBest: WeaponBest,
    @Json(name = "weapons_replacements")
    val weaponsReplacements: List<WeaponsReplacement>,
    @Json(name = "weekly_boss_item")
    val weeklyBossItem: WeeklyBossItem
)
