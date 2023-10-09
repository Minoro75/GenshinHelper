package io.minoro75.genshinhelper.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeaponsReplacement(
    @SerialName("weapon_rarity")
    val weaponRarity: Int,
    @SerialName("weapon_name")
    val weaponName: String,
    @SerialName("weapon_url")
    val weaponUrl: String
)
