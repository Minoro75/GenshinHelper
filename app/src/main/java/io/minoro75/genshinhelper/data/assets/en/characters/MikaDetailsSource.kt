package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object MikaDetailsSource {
    @Language("JSON")
    val details = """
            {
              "name": "Mika",
              "rarity": 4,
              "element": "cryo",
              "weapon": "polearm",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/dd/Mika_Icon.png/revision/latest",
              "talents_books": {
                "book_name": "Ballad",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7e/Item_Philosophies_of_Ballad.png",
                "book_days": "Wednesday/Saturday/Sunday"
              },
              "weekly_boss_item": {
            "boss_item_name": "Mirror of Mushin",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/ee/Item_Mirror_of_Mushin.png"
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
                  "artifact_sands": "Energy Recharge / HP%"
                }
              ],
              "weapon_best": {
                  "weapon_name": "Favonius Lance",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
                  "weapon_rarity": 4
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Engulfing Lightning",
                  "weapon_url": "https://paimon.moe/images/weapons/engulfing_lightning.png",
                  "weapon_rarity": 5
                },
                {
                 "weapon_name": "Black Tassel",
                 "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
                 "weapon_rarity": 3
                },
                {
                  "weapon_name": "Skyward Spine",
                  "weapon_url": "https://paimon.moe/images/weapons/skyward_spine.png",
                  "weapon_rarity": 5
                }
              ],
              "video_guide": "r_o9floF0Yo"
            }
        """.trimIndent()
}