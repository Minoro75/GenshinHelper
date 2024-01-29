package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object NaviaDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Navia",
          "rarity": 5,
          "element": "geo",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c0/Navia_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Equity",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a0/Item_Philosophies_of_Equity.png",
            "book_days": "Monday/Thursday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Lightless Silk String",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Lightless_Silk_String.png/revision/latest"
          },
          "talents_priority": [
            "Skill",
            "Attack",
            "Burst"
          ],
          "artifacts": [
            {
               "artifact_name": "Nighttime Whispers",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9f/Item_Selfless_Floral_Accessory.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Geo DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
              "artifact_sands": "ATK%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Verdict",
            "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1d/Weapon_Verdict.png/revision/latest",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "The Unforged",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Weapon_The_Unforged.png/revision/latest",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Serpent Spine",
              "weapon_url": "https://paimon.moe/images/weapons/serpent_spine.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Tidal Shadow",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/69/Weapon_Tidal_Shadow.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "u1vmEENUgcQ"
        }
    """.trimIndent()
}