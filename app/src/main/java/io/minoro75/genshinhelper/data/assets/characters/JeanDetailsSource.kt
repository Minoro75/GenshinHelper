package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object JeanDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Jean",
          "rarity": 5,
          "element": "anemo",
          "weapon": "sword",
          "image_url": "https://paimon.moe/images/characters/jean.png",
          "talents_books": {
            "book_name": "Resistance",
            "book_url": "https://paimon.moe/images/items/philosophies_of_resistance.png",
            "book_days": "TUE/FRI/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Dvalin's Plume",
            "boss_item_url": "https://paimon.moe/images/items/dvalins_plume.png"
          },
          "talents_priority": [
            "Burst",
            "Skill",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Viridescent Venerer",
              "artifact_url": "https://paimon.moe/images/artifacts/viridescent_venerer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Anemo DPS",
              "artifact_circlet": "CRIT DMG / CRIT Rate / Healing Bonus",
              "artifact_sands": "ATK% / Energy Recharge"
            }
          ],
          "weapon_best": {
            "weapon_name": "Freedom-Sworn",
            "weapon_url": "https://paimon.moe/images/weapons/freedom-sworn.png",
            "weapon rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Skyward Blade",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_blade.png",
              "weapon rarity": 5
            },
            {
              "weapon_name": "Favonius Sword",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_sword.png",
              "weapon rarity": 4
            },
            {
              "weapon_name": "Amenoma Kageuchi",
              "weapon_url": "https://paimon.moe/images/weapons/amenoma_kageuchi.png",
              "weapon rarity": 4
            }
          ]
        }
    """.trimIndent()
}