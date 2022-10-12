package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object CandaceDetailsSource {
    @Language("JSON")
    val details = """
            {
              "name": "Candace",
              "rarity": 4,
              "element": "hydro",
              "weapon": "polearm",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bf/Character_Candace_Thumb.png",
              "talents_books": {
                "book_name": "Admonition",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9b/Item_Philosophies_of_Admonition.png",
                "book_days": "MON/THU/SUN"
              },
              "weekly_boss_item": {
                "boss_item_name": "Tears of the Calamitous God",
                "boss_item_url": "https://paimon.moe/images/items/tears_of_the_calamitous_god.png"
              },
              "talents_priority": [
                "Skill",
                "Burst",
                "Attack"
              ],
              "artifacts": [
                {
                  "artifact_name": "Noblesse Oblige",
                  "artifact_url": "https://paimon.moe/images/artifacts/noblesse_oblige_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "HP%",
                  "artifact_circlet": "HP%",
                  "artifact_sands": "HP%"
                }
              ],
              "weapon_best": {
                "weapon_name": "Skyward Spine",
                "weapon_url": "https://paimon.moe/images/weapons/skyward_spine.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Favonius Lance",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "The Catch",
                  "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Black Tassel",
                  "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
                  "weapon_rarity": 3
                }
              ]
            }
        """.trimIndent()
}
