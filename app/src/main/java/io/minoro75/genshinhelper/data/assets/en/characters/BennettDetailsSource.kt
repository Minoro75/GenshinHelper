package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object BennettDetailsSource {
    @Language("JSON")
    val details = """
            {
              "name": "Bennett",
              "rarity": 4,
              "element": "pyro",
              "weapon": "sword",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7b/Character_Bennett_Thumb.png",
              "talents_books": {
                "book_name": "Resistance",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0b/Item_Philosophies_of_Resistance.png",
                "book_days": "TUE/FRI/SUN"
              },
              "weekly_boss_item": {
                "boss_item_name": "Dvalin's Plume",
                "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bf/Item_Dvalin%27s_Plume.png"
              },
              "talents_priority": [
                "Burst",
                "Skill",
                "Attack"
              ],
              "artifacts": [
                {
                  "artifact_name": "Noblesse Oblige",
                  "artifact_url": "https://paimon.moe/images/artifacts/noblesse_oblige_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "HP%",
                  "artifact_circlet": "Healing Bonus / HP%",
                  "artifact_sands": "Energy Recharge / HP%"
                }
              ],
              "weapon_best": {
                "weapon_name": "Skyward Blade",
                "weapon_url": "https://paimon.moe/images/weapons/skyward_blade.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "The Alley Flash",
                  "weapon_url": "https://paimon.moe/images/weapons/the_alley_flash.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Sacrificial Sword",
                  "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Prototype Rancour",
                  "weapon_url": "https://paimon.moe/images/weapons/prototype_rancour.png",
                  "weapon_rarity": 4
                }
              ]
            }
        """.trimIndent()
}
