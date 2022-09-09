package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object KaeyaDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Kaeya",
          "rarity": 5,
          "element": "cryo",
          "weapon": "sword",
          "image_url": "https://paimon.moe/images/characters/kaeya.png",
          "talents_books": {
            "book_name": "Ballad",
            "book_url": "https://paimon.moe/images/items/philosophies_of_ballad.png",
            "book_days": "WED/SAT/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Spirit Locket of Boreas",
            "boss_item_url": "https://paimon.moe/images/items/spirit_locket_of_boreas.png"
          },
          "talents_priority": [
            "Burst",
            "Skill",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Blizzard Strayer",
              "artifact_url": "https://paimon.moe/images/artifacts/blizzard_strayer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Cryo DPS",
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
              "weapon_name": "Amenoma Kageuchi",
              "weapon_url": "https://paimon.moe/images/weapons/amenoma_kageuchi.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}