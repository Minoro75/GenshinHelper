package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object ShenheDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Shenhe",
          "rarity": 5,
          "element": "cryo",
          "weapon": "polearm",
          "image_url": "https://paimon.moe/images/characters/shenhe.png",
          "talents_books": {
            "book_name": "Prosperity",
            "book_url": "https://paimon.moe/images/items/philosophies_of_prosperity.png",
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
              "artifact_name": "Gladiator's Finale",
              "artifact_url": "https://paimon.moe/images/artifacts/gladiators_finale_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "ATK%",
              "artifact_circlet": "ATK%",
              "artifact_sands": "ATK% / Energy Recharge"
            },
            {
              "artifact_name": "Shimenawa's Reminiscence",
              "artifact_url": "https://paimon.moe/images/artifacts/shimenawas_reminiscence_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "ATK%",
              "artifact_circlet": "ATK%",
              "artifact_sands": "ATK% / Energy Recharge"
            }
          ],
          "weapon_best": {
            "weapon_name": "Calamity Queller",
            "weapon_url": "https://paimon.moe/images/weapons/calamity_queller.png",
            "weapon rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Engulfing Lightning",
              "weapon_url": "https://paimon.moe/images/weapons/engulfing_lightning.png",
              "weapon rarity": 5
            },
            {
              "weapon_name": "Favonius Lance",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
              "weapon rarity": 4
            },
            {
              "weapon_name": "The Catch",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon rarity": 4
            }
          ]
        }
    """.trimIndent()
}