package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object SayuDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Sayu",
          "rarity": 5,
          "element": "anemo",
          "weapon": "claymore",
          "image_url": "https://paimon.moe/images/characters/sayu.png",
          "talents_books": {
            "book_name": "Light",
            "book_url": "https://paimon.moe/images/items/philosophies_of_light.png",
            "book_days": "WED/SAT/SUN"
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
              "artifact_gobelet": "Elemental Mastery",
              "artifact_circlet": "Elemental Mastery / Healing Bonus",
              "artifact_sands": "Energy Recharge / Elemental Mastery"
            }
          ],
          "weapon_best": {
            "weapon_name": "Wolf's Gravestone",
            "weapon_url": "https://paimon.moe/images/weapons/wolfs_gravestone.png",
            "weapon rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Skyward Pride",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_pride.png",
              "weapon rarity": 5
            },
            {
              "weapon_name": "Favonius Greatsword",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_greatsword.png",
              "weapon rarity": 4
            },
            {
              "weapon_name": "Katsuragikiri Nagamasa",
              "weapon_url": "https://paimon.moe/images/weapons/katsuragikiri_nagamasa.png",
              "weapon rarity": 4
            }
          ]
        }
    """.trimIndent()
}