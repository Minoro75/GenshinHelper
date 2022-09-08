package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object SangonomiyaKokomiDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Sangonomiya Kokomi",
          "rarity": 5,
          "element": "hydro",
          "weapon": "catalyst",
          "image_url": "https://paimon.moe/images/characters/sangonomiya_kokomi.png",
          "talents_books": {
            "book_name": "Transience",
            "book_url": "https://paimon.moe/images/items/philosophies_of_transience.png",
            "book_days": "MON/THU/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Hellfire Butterfly",
            "boss_item_url": "https://paimon.moe/images/items/hellfire_butterfly.png"
          },
          "talents_priority": [
            "Skill",
            "Burst",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Tenacity of the Millelith",
              "artifact_url": "https://paimon.moe/images/artifacts/tenacity_of_the_millelith_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "HP%",
              "artifact_circlet": "Healing Bonus",
              "artifact_sands": "Energy Recharge / HP%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Thrilling Tales of Dragon Slayers",
            "weapon_url": "https://paimon.moe/images/weapons/thrilling_tales_of_dragon_slayers.png",
            "weapon rarity": 3
          },
          "weapons_replacements": [
            {
              "weapon_name": "Prototype Amber",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_amber.png",
              "weapon rarity": 4
            },
            {
              "weapon_name": "Everlasting Moonglow",
              "weapon_url": "https://paimon.moe/images/weapons/everlasting_moonglow.png",
              "weapon rarity": 5
            },
            {
              "weapon_name": "Hakushin Ring",
              "weapon_url": "https://paimon.moe/images/weapons/hakushin_ring.png",
              "weapon rarity": 4
            }
          ]
        }
    """.trimIndent()
}