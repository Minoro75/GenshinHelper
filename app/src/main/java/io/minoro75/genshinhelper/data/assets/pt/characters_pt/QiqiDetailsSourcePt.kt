package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object QiqiDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Qiqi",
          "rarity": 5,
          "element": "cryo",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b3/Qiqi_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Prosperity",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bd/Item_Philosophies_of_Prosperity.png",
            "book_days": "Monday/Thursday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Tail of Boreas",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/66/Item_Tail_of_Boreas.png"
          },
          "talents_priority": [
            "Burst",
            "Skill",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Tenacity of the Millelith",
              "artifact_url": "https://paimon.moe/images/artifacts/tenacity_of_the_millelith_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "ATK%",
              "artifact_circlet": "Healing Bonus / ATK%",
              "artifact_sands": "Energy Recharge / ATK%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Skyward Blade",
            "weapon_url": "https://paimon.moe/images/weapons/skyward_blade.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Aquila Favonia",
              "weapon_url": "https://paimon.moe/images/weapons/aquila_favonia.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Sacrificial Sword",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Favonius Sword",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_sword.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "TWi_uDwZYKs"
        }
    """.trimIndent()
}