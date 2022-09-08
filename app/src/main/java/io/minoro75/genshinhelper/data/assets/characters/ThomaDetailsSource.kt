package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object ThomaDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Thoma",
          "rarity": 4,
          "element": "pyro",
          "weapon": "polearm",
          "image_url": "https://paimon.moe/images/characters/thoma.png",
          "talents_books": {
            "book_name": "Transience",
            "book_url": "https://paimon.moe/images/items/philosophies_of_freedom.png",
            "book_days": "MON/THU/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Hellfire Butterfly",
            "boss_item_url": "https://paimon.moe/images/items/hellfire_butterfly.png"
          },
          "talents_priority": [
            "Skill",
            "Burst",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Emblem of Severed Fate",
              "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "HP% / Pyro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG / HP%",
              "artifact_sands": "Energy Recharge"
            }
          ],
          "weapon_best": {
            "weapon_name": "Engulfing Lightning",
            "weapon_url": "https://paimon.moe/images/weapons/engulfing_lightning.png",
            "weapon rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Staff of Homa",
              "weapon_url": "https://paimon.moe/images/weapons/staff_of_homa.png",
              "weapon rarity": 5
            },
            {
              "weapon_name": "Favonius Lance",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
              "weapon rarity": 4
            },
            {
              "weapon_name": "The Catch",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon rarity": 4
            }
          ]
        }
    """.trimIndent()
}