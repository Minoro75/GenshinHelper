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
          "image_url": "https://paimon.moe/images/characters/kujou_sara.png",
          "talents_books": {
            "book_name": "Elegance",
            "book_url": "https://paimon.moe/images/items/philosophies_of_elegance.png",
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
              "weapon rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Elegy for the End",
            "weapon_url": "https://paimon.moe/images/weapons/elegy_for_the_end.png",
            "weapon rarity": 5
            },
            {
              "weapon_name": "Sacrificial Bow",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_bow.png",
              "weapon rarity": 4
            },
            {
              "weapon_name": "Favonius Warbow",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_warbow.png",
              "weapon rarity": 4
            }
          ]
        }
    """.trimIndent()
}