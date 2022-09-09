package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object AmberDetailsSource {
    @Language("JSON")
    val details = """
            {
              "name": "Amber",
              "rarity": 4,
              "element": "pyro",
              "weapon": "bow",
              "image_url": "https://paimon.moe/images/characters/amber.png",
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
                "Burst",
                "Skill",
                "Attack"
              ],
              "artifacts": [
                {
                  "artifact_name": "Emblem of Severed Fate",
                  "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Pyro DPS",
                  "artifact_circlet": "Crit Rate / Crit DMG",
                  "artifact_sands": "ATK%"
                }
              ],
              "weapon_best": {
                "weapon_name": "Elegy for the End",
                "weapon_url": "https://paimon.moe/images/weapons/elegy_for_the_end.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Skyward Harp",
                  "weapon_url": "https://paimon.moe/images/weapons/skyward_harp.png",
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
