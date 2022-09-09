package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object TravelerAnemoDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Traveler (Anemo)",
          "rarity": 5,
          "element": "anemo",
          "weapon": "sword",
          "image_url": "https://paimon.moe/images/characters/traveler_anemo.png",
          "talents_books": {
            "book_name": "Freedom",
            "book_url": "https://paimon.moe/images/items/philosophies_of_freedom.png",
            "book_days": "MON/THU/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Dvalin's Sigh",
            "boss_item_url": "https://paimon.moe/images/items/dvalins_sigh.png"
          },
          "talents_priority": [
            "Skill",
            "Burst",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Viridescent Venerer",
              "artifact_url": "https://paimon.moe/images/artifacts/viridescent_venerer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Anemo DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
              "artifact_sands": "Energy Recharge"
            }
          ],
          "weapon_best": {
            "weapon_name": "Primordial Jade Cutter",
            "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_cutter.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Skyward Blade",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_blade.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Sacrificial Sword",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Iron Sting",
              "weapon_url": "https://paimon.moe/images/weapons/iron_sting.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}