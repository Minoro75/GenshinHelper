package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object TravelerElectroDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Traveler (Electro)",
          "rarity": 5,
          "element": "electro",
          "weapon": "sword",
          "image_url": "https://paimon.moe/images/characters/traveler_anemo.png",
          "talents_books": {
            "book_name": "Transience",
            "book_url": "https://paimon.moe/images/items/philosophies_of_prosperity.png",
            "book_days": "MON/THU/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Dragon Lord's Crown",
            "boss_item_url": "https://paimon.moe/images/items/dragon_lords_crown.png"
          },
          "talents_priority": [
            "Burst",
            "Skill",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Noblesse Oblige",
              "artifact_url": "https://paimon.moe/images/artifacts/noblesse_oblige_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Electro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
              "artifact_sands": "ATK% / Energy Recharge"
            }
          ],
          "weapon_best": {
            "weapon_name": "Skyward Blade",
            "weapon_url": "https://paimon.moe/images/weapons/skyward_blade.png",
            "weapon rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Sacrificial Sword",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
              "weapon rarity": 4
            },
            {
              "weapon_name": "Festering Desire",
              "weapon_url": "https://paimon.moe/images/weapons/festering_desire.png",
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