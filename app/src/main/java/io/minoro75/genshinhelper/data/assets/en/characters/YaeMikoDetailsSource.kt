package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object YaeMikoDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Yae Miko",
          "rarity": 5,
          "element": "electro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/57/Character_Yae_Miko_Thumb.png",
          "talents_books": {
            "book_name": "Light",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/95/Item_Philosophies_of_Light.png",
            "book_days": "Wednesday/Saturday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "The Meaning of Aeons",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c9/Item_The_Meaning_of_Aeons.png"
          },
          "talents_priority": [
            "Skill",
            "Burst",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Thundering Fury",
              "artifact_url": "https://paimon.moe/images/artifacts/thundering_fury_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Electro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
              "artifact_sands": "ATK% / Energy Recharge"
            },
             {
              "artifact_name": "Gladiator's Finale",
              "artifact_url": "https://paimon.moe/images/artifacts/gladiators_finale_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Electro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
              "artifact_sands": "ATK% / Energy Recharge"
            }
          ],
          "weapon_best": {
            "weapon_name": "Kagura's Verity",
            "weapon_url": "https://paimon.moe/images/weapons/kaguras_verity.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Skyward Atlas",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "The Widsith",
              "weapon_url": "https://paimon.moe/images/weapons/the_widsith.png",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Hakushin Ring",
              "weapon_url": "https://paimon.moe/images/weapons/hakushin_ring.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}