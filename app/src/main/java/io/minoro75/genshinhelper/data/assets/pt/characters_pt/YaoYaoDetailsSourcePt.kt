package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object YaoYaoDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Yaoyao",
          "rarity": 5,
          "element": "dendro",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/83/Yaoyao_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Diligence",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
            "book_days": "Tuesday/Friday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Daka's Bell",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a2/Item_Daka%27s_Bell.png"
          },
          "talents_priority": [
            "Skill",
            "Burst",
            "Attack"
          ],
          "artifacts": [
             {
                  "artifact_name": "Deepwood Memories",
                  "artifact_url": "https://paimon.moe/images/artifacts/deepwood_memories_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "HP%",
                  "artifact_circlet": "Healing Bonus",
                  "artifact_sands": "Energy Recharge"
                }
          ],
          "weapon_best": {
                  "weapon_name": "Favonius Lance",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
                  "weapon_rarity": 4
           },
          "weapons_replacements": [
            {
              "weapon_name": "Skyward Spine",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_spine.png",
              "weapon_rarity": 5
            },
            {
             "weapon_name": "Black Tassel",
             "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
             "weapon_rarity": 3
             
            },
            {
              "weapon_name": "Kitain Cross Spear",
              "weapon_url": "https://paimon.moe/images/weapons/kitain_cross_spear.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "rY_OIn-awyU"
        }
    """.trimIndent()
}