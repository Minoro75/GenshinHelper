package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object CharlotteDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Charlotte",
          "rarity": 4,
          "element": "cryo",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d2/Charlotte_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Justice",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/37/Item_Philosophies_of_Justice.png",
            "book_days": "Tuesday/Friday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Lightless Silk String",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Lightless_Silk_String.png/revision/latest"
          },
          "talents_priority": [
            "Skill",
            "Burst",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Golden Troupe",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/4d/Item_Golden_Song%27s_Variation.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "ATK% or Cryo DMG",
              "artifact_circlet": "CRIT DMG",
              "artifact_sands": "ATK%"
            }
          ],
          "weapon_best": {
              "weapon_name": "Kagura's Verity",
            "weapon_url": "https://paimon.moe/images/weapons/kaguras_verity.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Skyward Atlas",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Flowing Purity",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Weapon_Flowing_Purity.png/revision/latest",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Flowing Purity",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Weapon_Flowing_Purity.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
         "video_guide": "2TppCceBx6I"
        }
    """.trimIndent()
}