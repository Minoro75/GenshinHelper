package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object BeidouDetailsSource {
    @Language("JSON")
    val details = """
            {
              "name": "Beidou",
              "rarity": 4,
              "element": "electro",
              "weapon": "claymore",
              "image_url": "https://paimon.moe/images/characters/beidou.png",
              "talents_books": {
                "book_name": "Gold",
                "book_url": "https://paimon.moe/images/items/philosophies_of_gold.png",
                "book_days": "WED/SAT/SUN"
              },
              "weekly_boss_item": {
                "boss_item_name": "Dvalin's Sigh",
                "boss_item_url": "https://paimon.moe/images/items/dvalins_sigh.png"
              },
              "talents_priority": [
                "Skill",
                "Burst",
                "Attack"
              ],
              "artifacts": [
                {
                  "artifact_name": "Emblem of Severed Fate",
                  "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Electro DPS",
                  "artifact_circlet": "CRIT Rate or CRIT DMG",
                  "artifact_sands": "ATK% / Energy Recharge"
                }
              ],
              "weapon_best": {
                "weapon_name": "Wolf's Gravestone",
                "weapon_url": "https://paimon.moe/images/weapons/wolfs_gravestone.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Akuoumaru",
                  "weapon_url": "https://paimon.moe/images/weapons/akuoumaru.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Serpent Spine",
                  "weapon_url": "https://paimon.moe/images/weapons/serpent_spine.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Katsuragikiri Nagamasa",
                  "weapon_url": "https://paimon.moe/images/weapons/katsuragikiri_nagamasa.png",
                  "weapon_rarity": 4
                }
              ]
            }
        """.trimIndent()
}
