package io.minoro75.genshinhelper.domain.model

import kotlinx.collections.immutable.PersistentList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CharacterDetails(
    val artifacts: List<Artifact>,
    val element: String,
    @SerialName("image_url")
    val imageUrl: String,
    val name: String,
    val rarity: Int,
    @SerialName("talents_books")
    val talentBooks: TalentsBooks,
    @SerialName("talents_priority")
    val talentsPriority: List<String>,
    val weapon: String,
    @SerialName("weapon_best")
    val weaponBest: WeaponBest,
    @SerialName("weapons_replacements")
    val weaponsReplacements: List<WeaponsReplacement>,
    @SerialName("weekly_boss_item")
    val weeklyBossItem: WeeklyBossItem,
    @SerialName("video_guide")
    val videoGuide: String?
)
