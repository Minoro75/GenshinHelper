package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object YoimiyaDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Yoimiya",
          "rarity": 5,
          "element": "pyro",
          "weapon": "bow",
          "image_url": "https://paimon.moe/images/characters/yoimiya.png",
          "talents_books": {
            "book_name": "Transience",
            "book_url": "https://paimon.moe/images/items/philosophies_of_transience.png",
            "book_days": "MON/THU/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Dragon Lord's Crown",
            "boss_item_url": "https://paimon.moe/images/items/dragon_lords_crown.png"
          },
          "talents_priority": [
            "Attack",
            "Skill",
            "Burst"
          ],
          "artifacts": [
            {
              "artifact_name": "Shimenawa's Reminiscence",
              "artifact_url": "https://paimon.moe/images/artifacts/shimenawas_reminiscence_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Pyro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
              "artifact_sands": "ATK%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Thundering Pulse",
            "weapon_url": "https://paimon.moe/images/weapons/thundering_pulse.png",
            "weapon rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Aqua Simulacra",
            "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
            "weapon rarity": 5
            },
            {
              "weapon_name": "Rust",
              "weapon_url": "https://paimon.moe/images/weapons/rust.png",
              "weapon rarity": 4
            },
            {
              "weapon_name": "Prototype Crescent",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_crescent.png",
              "weapon rarity": 4
            }
          ]
        }
    """.trimIndent()
}