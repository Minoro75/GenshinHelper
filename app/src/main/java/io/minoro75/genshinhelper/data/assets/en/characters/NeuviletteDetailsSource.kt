package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object NeuviletteDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Neuvilette",
          "rarity": 5,
          "element": "hydro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/21/Neuvillette_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Equity",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a0/Item_Philosophies_of_Equity.png",
            "book_days": "Monday/Thursday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Everamber",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/26/Item_Everamber.png/revision/latest"
          },
          "talents_priority": [
            "Attack",
            "Skill",
            "Burst"
          ],
          "artifacts": [
            {
              "artifact_name": "Marechaussee Hunter",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8d/Item_Hunter%27s_Brooch.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Hydro DPS / HP%",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "HP%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Tome of the Eternal Flow",
            "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/91/Weapon_Tome_of_the_Eternal_Flow.png/revision/latest",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
            "weapon_name": "Lost Prayer to the Sacred Winds",
            "weapon_url": "https://paimon.moe/images/weapons/lost_prayer_to_the_sacred_winds.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "The Widsith",
              "weapon_url": "https://paimon.moe/images/weapons/the_widsith.png",
              "weapon_rarity": 4
            },
            {
                  "weapon_name": "Prototype Amber",
                  "weapon_url": "https://paimon.moe/images/weapons/prototype_amber.png",
                  "weapon_rarity": 4
            }
          ],
          "video_guide": "1rd697FicW4"
        }
    """.trimIndent()
}