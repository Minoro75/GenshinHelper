package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object HuTaoDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Hu Tao",
          "rarity": 5,
          "element": "pyro",
          "weapon": "polearm",
          "image_url": "https://paimon.moe/images/characters/hu_tao.png",
          "talents_books": {
            "book_name": "Diligence",
            "book_url": "https://paimon.moe/images/items/philosophies_of_diligence.png",
            "book_days": "TUE/FRI/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Shard of a Foul Legacy",
            "boss_item_url": "https://paimon.moe/images/items/shard_of_a_foul_legacy.png"
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
              "weapon_name": "Dragon's Bane",
              "weapon_url": "https://paimon.moe/images/weapons/dragons_bane.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Deathmatch",
              "weapon_url": "https://paimon.moe/images/weapons/deathmatch.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}