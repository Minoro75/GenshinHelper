package io.minoro75.genshinhelper.domain.model

data class CharacterDetails(
    val artifacts: List<Artifact>,
    val element: String,
    val image_url: String,
    val name: String,
    val rarity: Int,
    val talents_books: TalentsBooks,
    val talents_priority: List<String>,
    val weapon: String,
    val weapon_best: WeaponBest,
    val weapons_replacements: List<WeaponsReplacement>,
    val weekly_boss_item: WeeklyBossItem
)