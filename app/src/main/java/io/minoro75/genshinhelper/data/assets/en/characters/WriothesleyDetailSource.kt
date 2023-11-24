package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object WriothesleyDetailSource {
    @Language("JSON")
    val details = """
        {
          "name": "Wriothesley",
          "rarity": 5,
          "element": "cryo",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bb/Wriothesley_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Order",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/32/Item_Philosophies_of_Order.png",
            "book_days": "Wednesday/Saturday/Sunday"
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
              "artifact_gobelet": "Cryo DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
              "artifact_sands": "ATK%"
            }
          ],
          "weapon_best": {
              "weapon_name": "Cashflow Supervision",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f2/Weapon_Cashflow_Supervision.png/revision/latest",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
             "weapon_name": "Tulaytullah's Remembrance",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/fc/Weapon_Tulaytullah%27s_Remembrance.png/revision/latest",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "The Widsith",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f0/Weapon_The_Widsith.png/revision/latest",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Flowing Purity",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Weapon_Flowing_Purity.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
         "video_guide": "3vpftHE88Xc"
        }
    """.trimIndent()
}