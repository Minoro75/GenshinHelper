package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object GamingDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Gaming",
          "rarity": 4,
          "element": "pyro",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/77/Gaming_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Prosperity",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bd/Item_Philosophies_of_Prosperity.png",
            "book_days": "Monday/Thursday/Sunday"
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
              "artifact_name": "Marechaussee Hunter",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8d/Item_Hunter%27s_Brooch.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Pyro DPS",
              "artifact_circlet": "CRIT DMG ",
              "artifact_sands": "Elemental Mastery"
            }
          ],
          "weapon_best": {
            "weapon_name": "Serpent Spine",
              "weapon_url": "https://paimon.moe/images/weapons/serpent_spine.png",
              "weapon_rarity": 4
          },
          "weapons_replacements": [
            {
                "weapon_name": "Redhorn Stonethresher",
                "weapon_url": "https://paimon.moe/images/weapons/redhorn_stonethresher.png",
                "weapon_rarity": 5
            },
            {
              "weapon_name": "Mailed Flower",
              "weapon_url": "https://paimon.moe/images/weapons/mailed_flower.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Tidal Shadow",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/69/Weapon_Tidal_Shadow.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "m1wYPCsqzsU"
        }
    """.trimIndent()
}
