package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object AloyDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Aloy",
          "rarity": 5,
          "element": "cryo",
          "weapon": "bow",
          "image_url": "https://paimon.moe/images/characters/aloy.png",
          "talents_books": {
            "book_name": "Freedom",
            "book_url": "https://paimon.moe/images/items/philosophies_of_freedom.png",
            "book_days": "MON/THU/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Molten Moment",
            "boss_item_url": "https://paimon.moe/images/items/molten_moment.png"
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
              "artifact_circlet": "Crit Rate / Crit DMG",
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
              "weapon_name": "Skyward Harp",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_harp.png",
              "weapon rarity": 5
            },
            {
              "weapon_name": "The Stringless",
              "weapon_url": "https://paimon.moe/images/weapons/the_stringless.png",
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
