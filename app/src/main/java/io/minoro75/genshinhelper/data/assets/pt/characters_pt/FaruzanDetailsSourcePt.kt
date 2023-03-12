package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object FaruzanDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Faruzan",
          "rarity": 4,
          "element": "anemo",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b2/Faruzan_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Admonition",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9b/Item_Philosophies_of_Admonition.png",
            "book_days": "Monday/Thursday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Puppet Strings",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a2/Item_Daka%27s_Bell.png"
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
              "artifact_gobelet": "Anemo DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
              "artifact_sands": "Energy Recharge"
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
              "weapon_name": "Sacrificial Bow",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_bow.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Favonius Warbow",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_warbow.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "-hLHi70wbGE"
        }
    """.trimIndent()
}