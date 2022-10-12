package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object XiaoDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Xiao",
          "rarity": 5,
          "element": "anemo",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b9/Character_Xiao_Thumb.png",
          "talents_books": {
            "book_name": "Prosperity",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bd/Item_Philosophies_of_Prosperity.png",
            "book_days": "MON/THU/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Shadow of the Warrior",
            "boss_item_url": "https://paimon.moe/images/items/shadow_of_the_warrior.png"
          },
          "talents_priority": [
            "Attack",
            "Burst",
            "Skill"
          ],
          "artifacts": [
            {
              "artifact_name": "Vermillion Hereafter",
              "artifact_url": "https://paimon.moe/images/artifacts/vermillion_hereafter_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Anemo DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
              "artifact_sands": "ATK%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Primordial Jade Winged-Spear",
            "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_winged-spear.png",
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
              "weapon_url": "https://paimon.moe/images/weapons/deathmatch.png",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Favonius Lance",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}