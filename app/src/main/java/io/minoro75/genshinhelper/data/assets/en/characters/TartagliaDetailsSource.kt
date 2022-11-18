package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object TartagliaDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Tartaglia",
          "rarity": 5,
          "element": "hydro",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/53/Character_Tartaglia_Thumb.png",
          "talents_books": {
            "book_name": "Freedom",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
            "book_days": "MON/THU/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Shard of a Foul Legacy",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/48/Item_Shard_of_a_Foul_Legacy.png"
          },
          "talents_priority": [
            "Skill",
            "Burst",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Heart of Depth",
              "artifact_url": "https://paimon.moe/images/artifacts/heart_of_depth_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Hydro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "ATK%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Polar Star",
            "weapon_url": "https://paimon.moe/images/weapons/polar_star.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Thundering Pulse",
              "weapon_url": "https://paimon.moe/images/weapons/thundering_pulse.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "The Viridescent Hunt",
              "weapon_url": "https://paimon.moe/images/weapons/the_viridescent_hunt.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Hamayumi",
              "weapon_url": "https://paimon.moe/images/weapons/hamayumi.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}