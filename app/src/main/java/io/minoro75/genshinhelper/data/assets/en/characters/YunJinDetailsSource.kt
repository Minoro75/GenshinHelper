package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object YunJinDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Yun Jin",
          "rarity": 4,
          "element": "geo",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/cb/Character_Yun_Jin_Thumb.png",
          "talents_books": {
            "book_name": "Diligence",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
            "book_days": "Tuesday/Friday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Ashen Heart",
            "boss_item_url": "https://paimon.moe/images/items/ashen_heart.png"
          },
          "talents_priority": [
            "Burst",
            "Skill",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Husk of Opulent Dreams",
              "artifact_url": "https://paimon.moe/images/artifacts/husk_of_opulent_dreams_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "DEF%",
              "artifact_circlet": "DEF% / CRIT Rate",
              "artifact_sands": "DEF% / Energy Recharge"
            }
          ],
          "weapon_best": {
            "weapon_name": "Engulfing Lightning",
            "weapon_url": "https://paimon.moe/images/weapons/engulfing_lightning.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Favonius Lance",
            "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
            "weapon_rarity": 4
            },
            {
              "weapon_name": "The Catch",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Prototype Starglitter",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_starglitter.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "SCxNTYac1RU"
        }
    """.trimIndent()
}