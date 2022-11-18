package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object KleeDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Klee",
          "rarity": 5,
          "element": "pyro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c3/Character_Klee_Thumb.png",
          "talents_books": {
            "book_name": "Freedom",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
            "book_days": "MON/THU/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Ring of Boreas",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d6/Item_Ring_of_Boreas.png"
          },
          "talents_priority": [
            "Attack",
            "Skill",
            "Burst"
          ],
          "artifacts": [
            {
              "artifact_name": "Crimson Witch of Flames",
              "artifact_url": "https://paimon.moe/images/artifacts/crimson_witch_of_flames_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Pyro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "ATK%"
            }
          ],
          "weapon_best": {
             "weapon_name": "Lost Prayer to the Sacred Winds",
              "weapon_url": "https://paimon.moe/images/weapons/lost_prayer_to_the_sacred_winds.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
            "weapon_name": "Skyward Atlas",
            "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "The Widsith",
              "weapon_url": "https://paimon.moe/images/weapons/the_widsith.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Mappa Mare",
              "weapon_url": "https://paimon.moe/images/weapons/mappa_mare.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}