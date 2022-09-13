package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object EulaDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Eula",
          "rarity": 5,
          "element": "cryo",
          "weapon": "claymore",
          "image_url": "https://paimon.moe/images/characters/eula.png",
          "talents_books": {
            "book_name": "Resistance",
            "book_url": "https://paimon.moe/images/items/philosophies_of_resistance.png",
            "book_days": "MON/THU/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Dragon Lord's Crown",
            "boss_item_url": "https://paimon.moe/images/items/dragon_lords_crown.png"
          },
          "talents_priority": [
            "Burst",
            "Attack",
            "Skill"
          ],
          "artifacts": [
            {
              "artifact_name": "Pale Flame",
              "artifact_url": "https://paimon.moe/images/artifacts/pale_flame_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Physical DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "ATK%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Song of Broken Pines",
            "weapon_url": "https://paimon.moe/images/weapons/song_of_broken_pines.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Wolf's Gravestone",
              "weapon_url": "https://paimon.moe/images/weapons/wolfs_gravestone.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Serpent Spine",
              "weapon_url": "https://paimon.moe/images/weapons/serpent_spine.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Snow-Tombed Starsilver",
              "weapon_url": "https://paimon.moe/images/weapons/snow-tombed_starsilver.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}