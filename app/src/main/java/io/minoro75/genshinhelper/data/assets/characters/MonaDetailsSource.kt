package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object MonaDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Mona",
          "rarity": 5,
          "element": "hydro",
          "weapon": "catalyst",
          "image_url": "https://paimon.moe/images/characters/mona.png",
          "talents_books": {
            "book_name": "Resistance",
            "book_url": "https://paimon.moe/images/items/philosophies_of_ballad.png",
            "book_days": "TUE/FRI/SUN"
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
              "artifact_name": "Emblem of Severed Fate",
              "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Hydro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "ATK%"
            }
          ],
          "weapon_best": {
             "weapon_name": "Skyward Atlas",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Memory of Dust",
            "weapon_url": "https://paimon.moe/images/weapons/memory_of_dust.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "The Widsith",
              "weapon_url": "https://paimon.moe/images/weapons/the_widsith.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Mappa Mare",
              "weapon_url": "https://paimon.moe/images/weapons/mappa_mare.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}