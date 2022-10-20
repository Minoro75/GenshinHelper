package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object KaedeharaKazuhaDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Kaedehara Kazuha",
          "rarity": 5,
          "element": "anemo",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f0/Character_Kaedehara_Kazuha_Thumb.png",
          "talents_books": {
            "book_name": "Diligence",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
            "book_days": "TUE/FRI/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Gilded Scale",
            "boss_item_url": "https://paimon.moe/images/items/gilded_scale.png"
          },
          "talents_priority": [
            "Burst",
            "Skill",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Viridescent Venerer",
              "artifact_url": "https://paimon.moe/images/artifacts/viridescent_venerer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Elemental Mastery / Anemo DPS",
              "artifact_circlet": "Elemental Mastery / CRIT Rate / CRIT DMG",
              "artifact_sands": "Elemental Mastery / ATK%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Freedom-Sworn",
            "weapon_url": "https://paimon.moe/images/weapons/freedom-sworn.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Haran Geppaku Futsu",
              "weapon_url": "https://paimon.moe/images/weapons/haran_geppaku_futsu.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Favonius Sword",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Sacrificial Sword",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}