package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object ArlecchinoDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Arlecchino",
          "rarity": 5,
          "element": "pyro",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9a/Arlecchino_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Order",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/32/Item_Philosophies_of_Order.png",
            "book_days": "Wednesday/Saturday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Fading Candle",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e4/Item_Fading_Candle.png/revision/latest"
          },
          "talents_priority": [
            "Attack",
            "Skill",
            "Burst"
          ],
          "artifacts": [
            {
              "artifact_name": "Fragment of Harmonic Whimsy",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/ff/Item_Harmonious_Symphony_Prelude.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Pyro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
              "artifact_sands": "ATK%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Crimson Moon's Semblance",
            "weapon_url": "https://paimon.moe/images/weapons/engulfing_lightning.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Staff of Homa",
              "weapon_url": "https://paimon.moe/images/weapons/staff_of_homa.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Deathmatch",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Blackcliff Pole",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "D8xP2FXY3CQ"
        }
    """.trimIndent()
}