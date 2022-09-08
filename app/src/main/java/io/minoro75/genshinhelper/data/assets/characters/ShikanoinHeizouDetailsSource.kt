package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object ShikanoinHeizouDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Shikanoin Heizou",
          "rarity": 4,
          "element": "anemo",
          "weapon": "catalyst",
          "image_url": "https://paimon.moe/images/characters/shikanoin_heizou.png",
          "talents_books": {
            "book_name": "Transience",
            "book_url": "https://paimon.moe/images/items/philosophies_of_transience.png",
            "book_days": "MON/THU/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "The Meaning of Aeons",
            "boss_item_url": "https://paimon.moe/images/items/the_meaning_of_aeons.png"
          },
          "talents_priority": [
            "Skill",
            "Attack",
            "Burst"
            
          ],
          "artifacts": [
            {
              "artifact_name": "Viridescent Venerer",
              "artifact_url": "https://paimon.moe/images/artifacts/viridescent_venerer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Anemo DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG / Elemental Mastery",
              "artifact_sands": "ATK% / Elemental Mastery"
            }
          ],
          "weapon_best": {
            "weapon_name": "Skyward Atlas",
            "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
            "weapon rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Kagura's Verity",
              "weapon_url": "https://paimon.moe/images/weapons/kaguras_verity.png",
              "weapon rarity": 5
            },
            {
              "weapon_name": "The Widsith",
              "weapon_url": "https://paimon.moe/images/weapons/the_widsith.png",
              "weapon rarity": 4
            },
            {
              "weapon_name": "Mappa Mare",
              "weapon_url": "https://paimon.moe/images/weapons/mappa_mare.png",
              "weapon rarity": 4
            }
          ]
        }
    """.trimIndent()
}