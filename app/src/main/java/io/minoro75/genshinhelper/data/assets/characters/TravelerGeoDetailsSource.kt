package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object TravelerGeoDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Traveler (Geo)",
          "rarity": 5,
          "element": "geo",
          "weapon": "sword",
          "image_url": "https://paimon.moe/images/characters/traveler_anemo.png",
          "talents_books": {
            "book_name": "Prosperity",
            "book_url": "https://paimon.moe/images/items/philosophies_of_prosperity.png",
            "book_days": "MON/THU/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Tail of Boreas",
            "boss_item_url": "https://paimon.moe/images/items/tail_of_boreas.png"
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
              "artifact_gobelet": "Geo DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
              "artifact_sands": "ATK% / Energy Recharge"
            }
          ],
          "weapon_best": {
            "weapon_name": "Primordial Jade Cutter",
            "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_cutter.png",
            "weapon rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Summit Shaper",
              "weapon_url": "https://paimon.moe/images/weapons/summit_shaper.png",
              "weapon rarity": 5
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