package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object ZhongliDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Zhongli",
          "rarity": 5,
          "element": "geo",
          "weapon": "polearm",
          "image_url": "https://paimon.moe/images/characters/zhongli.png",
          "talents_books": {
            "book_name": "Gold",
            "book_url": "https://paimon.moe/images/items/philosophies_of_gold.png",
            "book_days": "WED/SAT/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Tusk of Monoceros Caeli",
            "boss_item_url": "https://paimon.moe/images/items/tusk_of_monoceros_caeli.png"
          },
          "talents_priority": [
            "Skill",
            "Burst",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Tenacity of the Millelith",
              "artifact_url": "https://paimon.moe/images/artifacts/tenacity_of_the_millelith_flower.png",
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
              "weapon_name": "Staff of Homa",
              "weapon_url": "https://paimon.moe/images/weapons/staff_of_homa.png",
              "weapon_rarity": 5
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
          ]
        }
    """.trimIndent()
}