package io.minoro75.genshinhelper.domain.model

import com.squareup.moshi.Json

data class WeaponBest(
    @Json(name = "weapon_rarity")
    val weaponRarity: Int,
    @Json(name = "weapon_name")
    val weaponName: String,
    @Json(name = "weapon_url")
    val weaponUrl: String
)
