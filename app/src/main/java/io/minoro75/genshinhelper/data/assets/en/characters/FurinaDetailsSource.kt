package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object FurinaDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Furina",
          "rarity": 5,
          "element": "hydro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e6/Furina_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Justice",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/27/Item_Philosophies_of_Transience.png",
            "book_days": "Tuesday/Friday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Lightless Mass",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/ae/Item_Lightless_Mass.png/revision/latest"
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
              "artifact_gobelet": "HP%",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "HP%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Splendor of Tranquil Waters",
            "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/4f/Weapon_Splendor_of_Tranquil_Waters.png/revision/latest",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Key of Khaj-Nisut",
              "weapon_url": "https://paimon.moe/images/weapons/key_of_khaj-nisut.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Wolf-Fang",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e3/Weapon_Wolf-Fang.png/revision/latest",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Fleuve Cendre Ferryman",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7e/Weapon_Fleuve_Cendre_Ferryman.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "Ud6R9ziMNW8"
        }
    """.trimIndent()
}