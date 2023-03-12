package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object AmberDetailsSourcePt {
    @Language("JSON")
    val details = """
            {
              "name": "Amber",
              "rarity": 4,
              "element": "pyro",
              "weapon": "bow",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/75/Amber_Icon.png/revision/latest",
              "talents_books": {
                "book_name": "Freedom",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
                "book_days": "Monday/Thursday/Sunday"
              },
              "weekly_boss_item": {
                "boss_item_name": "Dvalin's Sigh",
                "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/07/Item_Dvalin%27s_Sigh.png"
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
              ],
              "video_guide": "oRMTPVfffUc"
            }
        """.trimIndent()
}
