package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object ChevreuseDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Chevreuse",
          "rarity": 4,
          "element": "pyro",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8a/Chevreuse_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Order",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/32/Item_Philosophies_of_Order.png",
            "book_days": "Wednesday/Saturday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Lightless Eye of the Maelstrom",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Lightless_Silk_String.png/revision/latest"
          },
          "talents_priority": [
            "Skill",
            "Burst",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Noblesse Oblige",
              "artifact_url": "https://paimon.moe/images/artifacts/noblesse_oblige_flower.png ",
              "artifact_amount": 4,
              "artifact_gobelet": "HP%",
              "artifact_circlet": "HP%",
              "artifact_sands": "HP%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Black Tassel",
            "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
            "weapon_rarity": 3
          },
          "weapons_replacements": [
            {
              "weapon_name": "Rightful Reward",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8d/Weapon_Rightful_Reward.png/revision/latest",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Favonius Lance",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
              "weapon_rarity": 4
            },
            {
            "weapon_name": "Black Tassel",
            "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
            "weapon_rarity": 3
            }
          ],
         "video_guide": "6UwQSh9yenw"
        }
    """.trimIndent()
}