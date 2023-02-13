package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object HuTaoDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Hu Tao",
          "rarity": 5,
          "element": "pyro",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e9/Hu_Tao_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Diligence",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
            "book_days": "Tuesday/Friday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Shard of a Foul Legacy",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/48/Item_Shard_of_a_Foul_Legacy.png"
          },
          "talents_priority": [
            "Attack",
            "Skill",
            "Burst"
          ],
          "artifacts": [
            {
              "artifact_name": "Crimson Witch of Flames",
              "artifact_url": "https://paimon.moe/images/artifacts/crimson_witch_of_flames_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Pyro DPS",
              "artifact_circlet": "CRIT DMG / CRIT Rate",
              "artifact_sands": "HP%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Staff of Homa",
            "weapon_url": "https://paimon.moe/images/weapons/staff_of_homa.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Primordial Jade Winged-Spear",
              "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_winged-spear.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Deathmatch",
              "weapon_url": "https://paimon.moe/images/weapons/deathmatch.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Dragon's Bane",
              "weapon_url": "https://paimon.moe/images/weapons/dragons_bane.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "5kLowTPUGCQ0"
        }
    """.trimIndent()
}