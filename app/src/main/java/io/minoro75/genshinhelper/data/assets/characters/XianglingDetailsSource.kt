package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object XianglingDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Xiangling",
          "rarity": 4,
          "element": "pyro",
          "weapon": "polearm",
          "image_url": "https://paimon.moe/images/characters/xiangling.png",
          "talents_books": {
            "book_name": "Diligence",
            "book_url": "https://paimon.moe/images/items/philosophies_of_diligence.png",
            "book_days": "TUE/FRI/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Dvalin's Claw",
            "boss_item_url": "https://paimon.moe/images/items/dvalins_claw.png"
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
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
              "artifact_sands": "ATK%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Engulfing Lightning",
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
              "weapon_name": "The Catch",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "The Catch",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}