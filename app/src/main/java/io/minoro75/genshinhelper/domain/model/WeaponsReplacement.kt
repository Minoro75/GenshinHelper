package io.minoro75.genshinhelper.domain.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WeaponsReplacement(
    @Json(name = "weapon_rarity")
    val weaponRarity: Int,
    @Json(name = "weapon_name")
    val weaponName: String,
    @Json(name = "weapon_url")
    val weaponUrl: String
)
