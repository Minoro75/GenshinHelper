package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object BarbaraDetailsSource {
    @Language("JSON")
    val details = """
            {
              "name": "Barbara",
              "rarity": 4,
              "element": "hydro",
              "weapon": "catalyst",
              "image_url": "https://paimon.moe/images/characters/barbara.png",
              "talents_books": {
                "book_name": "Freedom",
                "book_url": "https://paimon.moe/images/items/philosophies_of_freedom.png",
                "book_days": "MON/THU/SUN"
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
                  "artifact_name": "Ocean-Hued Clam",
                  "artifact_url": "https://paimon.moe/images/artifacts/husk_of_opulent_dreams_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "HP",
                  "artifact_circlet": "HP / Healing Bonus",
                  "artifact_sands": "HP"
                }
              ],
              "weapon_best": {
                "weapon_name": "Thrilling Tales of Dragon Slayers",
                "weapon_url": "https://paimon.moe/images/weapons/thrilling_tales_of_dragon_slayers.png",
                "weapon rarity": 3
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Everlasting Moonglow",
                  "weapon_url": "https://paimon.moe/images/weapons/everlasting_moonglow.png",
                  "weapon rarity": 5
                },
                {
                  "weapon_name": "Prototype Amber",
                  "weapon_url": "https://paimon.moe/images/weapons/prototype_amber.png",
                  "weapon rarity": 4
                },
                {
                  "weapon_name": "Favonius Codex",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_codex.png",
                  "weapon rarity": 4
                }
              ]
            }
        """.trimIndent()
}