package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object XianyunDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Xianyun",
          "rarity": 5,
          "element": "anemo",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d3/Xianyun_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Gold",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_Philosophies_of_Gold.png",
            "book_days": "Wednesday/Saturday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Lightless Eye of the Maelstrom",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Lightless_Silk_String.png/revision/latest"
          },
          "talents_priority": [
            "Burst",
            "Skill",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Viridescent Venerer",
              "artifact_url": "https://paimon.moe/images/artifacts/viridescent_venerer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Energy Recharge / ATK%",
              "artifact_circlet": "ATK%",
              "artifact_sands": "ATK%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Crane's Echoing Call",
            "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/61/Weapon_Crane%27s_Echoing_Call.png/revision/latest",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Skyward Atlas",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Oathsworn Eye",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/af/Weapon_Oathsworn_Eye.png/revision/latest",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Thrilling Tales of Dragon Slayers",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/19/Weapon_Thrilling_Tales_of_Dragon_Slayers.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "onAujG39e2Y"
        }
    """.trimIndent()
}