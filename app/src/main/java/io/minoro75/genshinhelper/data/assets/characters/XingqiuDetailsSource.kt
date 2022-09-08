package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object XingqiuDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Xingqiu",
          "rarity": 4,
          "element": "hydro",
          "weapon": "sword",
          "image_url": "https://paimon.moe/images/characters/xingqiu.png",
          "talents_books": {
            "book_name": "Gold",
            "book_url": "https://paimon.moe/images/items/philosophies_of_gold.png",
            "book_days": "WED/SAT/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Tail of Boreas",
            "boss_item_url": "https://paimon.moe/images/items/tail_of_boreas.png"
          },
          "talents_priority": [
            "Burst",
            "Attack",
            "Skill"
          ],
          "artifacts": [
            {
              "artifact_name": "Emblem of Severed Fate",
              "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Hydro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
              "artifact_sands": "ATK% / Energy Recharge"
            }
          ],
          "weapon_best": {
            "weapon_name": "Sacrificial Sword",
            "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
            "weapon rarity": 4
          },
          "weapons_replacements": [
            {
              "weapon_name": "Primordial Jade Cutter",
              "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_cutter.png",
              "weapon rarity": 5
            },
            {
              "weapon_name": "Mistsplitter Reforged",
              "weapon_url": "https://paimon.moe/images/weapons/mistsplitter_reforged.png",
              "weapon rarity": 4
            },
            {
             "weapon_name": "Amenoma Kageuchi",
              "weapon_url": "https://paimon.moe/images/weapons/amenoma_kageuchi.png",
              "weapon rarity": 4
            }
          ]
        }
    """.trimIndent()
}