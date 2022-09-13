package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object VentiDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Venti",
          "rarity": 5,
          "element": "anemo",
          "weapon": "bow",
          "image_url": "https://paimon.moe/images/characters/venti.png",
          "talents_books": {
            "book_name": "Ballad",
            "book_url": "https://paimon.moe/images/items/philosophies_of_ballad.png",
            "book_days": "WED/SAT/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Tail of Boreas",
            "boss_item_url": "https://paimon.moe/images/items/tail_of_boreas.png"
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
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
              "artifact_sands": "ATK%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Aqua Simulacra",
            "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Elegy for the End",
              "weapon_url": "https://paimon.moe/images/weapons/elegy_for_the_end.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "The Stringless",
              "weapon_url": "https://paimon.moe/images/weapons/the_stringless.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Favonius Warbow",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_warbow.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}