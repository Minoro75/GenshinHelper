package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object YanfeiDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Yanfei",
          "rarity": 4,
          "element": "pyro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1f/Character_Yanfei_Thumb.png",
          "talents_books": {
            "book_name": "Gold",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_Philosophies_of_Gold.png",
            "book_days": "WED/SAT/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Bloodjade Branch",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b1/Item_Bloodjade_Branch.png"
          },
          "talents_priority": [
            "Attack",
            "Burst",
            "Skill"
          ],
          "artifacts": [
            {
              "artifact_name": "Crimson Witch of Flames",
              "artifact_url": "https://paimon.moe/images/artifacts/crimson_witch_of_flames_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Pyro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
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
             "weapon_name": "Frostbearer",
              "weapon_url": "https://paimon.moe/images/weapons/frostbearer.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}