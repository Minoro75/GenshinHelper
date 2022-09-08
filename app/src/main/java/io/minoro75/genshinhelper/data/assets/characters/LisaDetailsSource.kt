package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object LisaDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Lisa",
          "rarity": 4,
          "element": "electro",
          "weapon": "catalyst",
          "image_url": "https://paimon.moe/images/characters/lisa.png",
          "talents_books": {
            "book_name": "Ballad",
            "book_url": "https://paimon.moe/images/items/philosophies_of_ballad.png",
            "book_days": "WED/SAT/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Dvalin's Claw",
            "boss_item_url": "https://paimon.moe/images/items/dvalins_claw.png"
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
              "artifact_name": "Noblesse Oblige",
              "artifact_url": "https://paimon.moe/images/artifacts/noblesse_oblige_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Electro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "ATK%"
            }
          ],
          "weapon_best": {
             "weapon_name": "Kagura's Verity",
              "weapon_url": "https://paimon.moe/images/weapons/kaguras_verity.png",
              "weapon rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Skyward Atlas",
            "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
            "weapon rarity": 5
            },
            {
              "weapon_name": "The Widsith",
              "weapon_url": "https://paimon.moe/images/weapons/the_widsith.png",
              "weapon rarity": 4
            },
            {
              "weapon_name": "Hakushin Ring",
              "weapon_url": "https://paimon.moe/images/weapons/hakushin_ring.png",
              "weapon rarity": 4
            }
          ]
        }
    """.trimIndent()
}