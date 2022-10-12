package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object DoriDetailsSource {
    @Language("JSON")
    val details = """
            {
              "name": "Dori",
              "rarity": 4,
              "element": "electro",
              "weapon": "claymore",
              "image_url": "https://paimon.moe/images/characters/dori.png",
              "talents_books": {
                "book_name": "Ingenuity",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Item_Philosophies_of_Ingenuity.png",
                "book_days": "TUE/FRI/SUN"
              },
              "weekly_boss_item": {
                "boss_item_name": "Bloodjade Branch",
                "boss_item_url": "https://paimon.moe/images/items/bloodjade_branch.png"
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
                  "artifact_amount": 2,
                  "artifact_gobelet": "Electro DPS",
                  "artifact_circlet": "HP%/ Healing Bonus%",
                  "artifact_sands": "Energy Recharge / HP%"
                },
                {
                  "artifact_name": "Tenacity of the Millelith",
                  "artifact_url": "https://paimon.moe/images/artifacts/tenacity_of_the_millelith_flower.png",
                  "artifact_amount": 2,
                  "artifact_gobelet": "Electro DPS",
                  "artifact_circlet": "HP%/ Healing Bonus%",
                  "artifact_sands": "Energy Recharge / HP%"
                }
              ],
              "weapon_best": {
                "weapon_name": "Sacrificial Greatsword",
                "weapon_url": "https://paimon.moe/images/weapons/sacrificial_greatsword.png",
                "weapon_rarity": 4
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Skyward Pride",
                  "weapon_url": "https://paimon.moe/images/weapons/skyward_pride.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Favonius Greatsword",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_greatsword.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Katsuragikiri Nagamasa",
                  "weapon_url": "https://paimon.moe/images/weapons/katsuragikiri_nagamasa.png",
                  "weapon_rarity": 4
                }
              ]
            }
        """.trimIndent()
}