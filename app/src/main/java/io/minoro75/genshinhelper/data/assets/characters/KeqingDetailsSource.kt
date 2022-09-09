package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object KeqingDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Keqing",
          "rarity": 5,
          "element": "electro",
          "weapon": "sword",
          "image_url": "https://paimon.moe/images/characters/keqing.png",
          "talents_books": {
            "book_name": "Prosperity",
            "book_url": "https://paimon.moe/images/items/philosophies_of_prosperity.png",
            "book_days": "MON/THU/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Ring of Boreas",
            "boss_item_url": "https://paimon.moe/images/items/ring_of_boreas.png"
          },
          "talents_priority": [
            "Burst",
            "Skill",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Thundering Fury",
              "artifact_url": "https://paimon.moe/images/artifacts/thundering_fury_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Electro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "ATK%"
            },
             {
              "artifact_name": "Gladiator's Finale",
              "artifact_url": "https://paimon.moe/images/artifacts/gladiators_finale_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Electro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "ATK%"
            }
          ],
          "weapon_best": {
             "weapon_name": "Mistsplitter Reforged",
              "weapon_url": "https://paimon.moe/images/weapons/mistsplitter_reforged.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
            "weapon_name": "Haran Geppaku Futsu",
            "weapon_url": "https://paimon.moe/images/weapons/haran_geppaku_futsu.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "The Black Sword",
              "weapon_url": "https://paimon.moe/images/weapons/the_black_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Amenoma Kageuchi",
              "weapon_url": "https://paimon.moe/images/weapons/amenoma_kageuchi.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}