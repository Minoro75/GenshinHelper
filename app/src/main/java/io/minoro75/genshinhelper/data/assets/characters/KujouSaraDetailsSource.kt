package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object KujouSaraDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Kujou Sara",
          "rarity": 4,
          "element": "electro",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/96/Character_Kujou_Sara_Thumb.png",
          "talents_books": {
            "book_name": "Elegance",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/6f/Item_Philosophies_of_Elegance.png",
            "book_days": "TUE/FRI/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Ashen Heart",
            "boss_item_url": "https://paimon.moe/images/items/ashen_heart.png"
          },
          "talents_priority": [
            "Skill",
            "Burst",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Noblesse Oblige",
              "artifact_url": "https://paimon.moe/images/artifacts/noblesse_oblige_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Electro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "ATK% / Energy Recharge"
            }
          ],
          "weapon_best": {
             "weapon_name": "Skyward Harp",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_harp.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
            "weapon_name": "Elegy for the End",
            "weapon_url": "https://paimon.moe/images/weapons/elegy_for_the_end.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Sacrificial Bow",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_bow.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Favonius Warbow",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_warbow.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}