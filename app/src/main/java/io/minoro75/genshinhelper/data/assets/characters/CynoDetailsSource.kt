package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object CynoDetailsSource {
    @Language("JSON")
    val details = """
            {
              "name": "Cyno",
              "rarity": 5,
              "element": "electro",
              "weapon": "polearm",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d1/Character_Cyno_Thumb.png",
              "talents_books": {
                "book_name": "Admonition",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9b/Item_Philosophies_of_Admonition.png",
                "book_days": "MON/THU/SUN"
              },
              "weekly_boss_item": {
                "boss_item_name": "Mudra of the Malefic General",
                "boss_item_url": "https://paimon.moe/images/items/mudra_of_the_malefic_general.png"
              },
              "talents_priority": [
                "Burst",
                "Skill",
                "Attack"
              ],
              "artifacts": [
                {
                  "artifact_name": "Thundering Fury",
                  "artifact_url": "https://paimon.moe/images/artifacts/thundering_fury_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Electro DPS",
                  "artifact_circlet": "CRIT Rate / CRIT DMG",
                  "artifact_sands": "Elemental Mastery / ATK%"
                }
              ],
              "weapon_best": {
                "weapon_name": "Staff of the Scarlet Sands",
                "weapon_url": "https://paimon.moe/images/weapons/staff_of_the_scarlet_sands.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Primordial Jade Winged-Spear",
                  "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_winged-spear.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Deathmatch",
                  "weapon_url": "https://paimon.moe/images/weapons/deathmatch.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "White Tassel",
                  "weapon_url": "https://paimon.moe/images/weapons/white_tassel.png",
                  "weapon_rarity": 3
                }
              ]
            }
        """.trimIndent()
}