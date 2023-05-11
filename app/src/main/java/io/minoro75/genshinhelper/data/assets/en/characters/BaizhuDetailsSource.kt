package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object BaizhuDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Baizhu",
          "rarity": 5,
          "element": "dendro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/cb/Baizhu_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Gold",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_Philosophies_of_Gold.png",
            "book_days": "Wednesday/Saturday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Worldspan Fern",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f8/Item_Worldspan_Fern.png/revision/latest"
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
              "artifact_gobelet": "HP%",
              "artifact_circlet": "HP%",
              "artifact_sands": "HP%"
            }
          ],
         "weapon_best": {
                "weapon_name": "Jadefall's Splendor",
                "weapon_url": "https://paimon.moe/images/weapons/jadefalls_splendor.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Favonius Codex",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_codex.png",
                  "weapon_rarity": 4
                },
                {
                 "weapon_name": "Sacrificial Fragments",
                 "weapon_url": "https://paimon.moe/images/weapons/sacrificial_fragments.png",
                 "weapon_rarity": 4
                },
                {
                 "weapon_name": "Prototype Amber",
                  "weapon_url": "https://paimon.moe/images/weapons/prototype_amber.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "wO7tvbGVugw"
        }
    """.trimIndent()
}