package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object ColleiDetailsSource {
    @Language("JSON")
    val details = """
            {
              "name": "Collei",
              "rarity": 4,
              "element": "dendro",
              "weapon": "bow",
              "image_url": "https://paimon.moe/images/characters/collei.png",
              "talents_books": {
                "book_name": "Praxis",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/82/Item_Philosophies_of_Praxis.png",
                "book_days": "WED/SAT/SUN"
              },
              "weekly_boss_item": {
                "boss_item_name": "Tears of the Calamitous God",
                "boss_item_url": "https://paimon.moe/images/items/tears_of_the_calamitous_god.png"
              },
              "talents_priority": [
                "Burst",
                "Skill",
                "Attack"
              ],
              "artifacts": [
                {
                  "artifact_name": "Deepwood Memories",
                  "artifact_url": "https://paimon.moe/images/artifacts/deepwood_memories_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Dendro DPS",
                  "artifact_circlet": "Crit Rate / Crit DMG",
                  "artifact_sands": "Energy Recharge / ATK%"
                }
              ],
              "weapon_best": {
                "weapon_name": "Polar Star",
                "weapon_url": "https://paimon.moe/images/weapons/polar_star.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Elegy for the End",
                  "weapon_url": "https://paimon.moe/images/weapons/elegy_for_the_end.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Aqua Simulacra",
                  "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
                  "weapon_rarity": 5
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
