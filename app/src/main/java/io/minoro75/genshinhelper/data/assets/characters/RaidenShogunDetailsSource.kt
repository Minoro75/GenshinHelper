package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object RaidenShogunDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Raiden Shogun",
          "rarity": 5,
          "element": "electro",
          "weapon": "polearm",
          "image_url": "https://paimon.moe/images/characters/raiden_shogun.png",
          "talents_books": {
            "book_name": "Light",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/95/Item_Philosophies_of_Light.png",
            "book_days": "WED/SAT/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Molten Moment",
            "boss_item_url": "https://paimon.moe/images/items/molten_moment.png"
          },
          "talents_priority": [
            "Burst",
            "Skill",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Emblem of Severed Fate",
              "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "ATK% / Electro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "Energy Recharge / ATK%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Engulfing Lightning",
            "weapon_url": "https://paimon.moe/images/weapons/engulfing_lightning.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Staff of Homa",
              "weapon_url": "https://paimon.moe/images/weapons/staff_of_homa.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Wavebreaker's Fin",
              "weapon_url": "https://paimon.moe/images/weapons/wavebreakers_fin.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "The Catch",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}