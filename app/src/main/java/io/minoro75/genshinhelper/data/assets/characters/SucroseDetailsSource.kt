package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object SucroseDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Sucrose",
          "rarity": 4,
          "element": "anemo",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/61/Character_Sucrose_Thumb.png",
          "talents_books": {
            "book_name": "Freedom",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
            "book_days": "MON/THU/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Spirit Locket of Boreas",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/81/Item_Spirit_Locket_of_Boreas.png"
          },
          "talents_priority": [
            "Skill",
            "Burst",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Viridescent Venerer",
              "artifact_url": "https://paimon.moe/images/artifacts/viridescent_venerer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Anemo DPS / Elemental Mastery",
              "artifact_circlet": "CRIT Rate / Elemental Mastery",
              "artifact_sands": "ATK% / Elemental Mastery"
            }
          ],
          "weapon_best": {
            "weapon_name": "Sacrificial Fragments",
            "weapon_url": "https://paimon.moe/images/weapons/sacrificial_fragments.png",
            "weapon_rarity": 4
          },
          "weapons_replacements": [
            {
              "weapon_name": "Thrilling Tales of Dragon Slayers",
              "weapon_url": "https://paimon.moe/images/weapons/thrilling_tales_of_dragon_slayers.png",
              "weapon_rarity": 3
            },
            {
              "weapon_name": "Hakushin Ring",
              "weapon_url": "https://paimon.moe/images/weapons/hakushin_ring.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Mappa Mare",
              "weapon_url": "https://paimon.moe/images/weapons/mappa_mare.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}