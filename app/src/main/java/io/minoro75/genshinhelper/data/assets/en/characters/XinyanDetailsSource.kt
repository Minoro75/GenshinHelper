package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object XinyanDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Xinyan",
          "rarity": 4,
          "element": "pyro",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9d/Character_Xinyan_Thumb.png",
          "talents_books": {
            "book_name": "Gold",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_Philosophies_of_Gold.png",
            "book_days": "WED/SAT/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Tusk of Monoceros Caeli",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1c/Item_Tusk_of_Monoceros_Caeli.png"
          },
          "talents_priority": [
            "Attack",
            "Burst",
            "Skill"
          ],
          "artifacts": [
            {
              "artifact_name": "Pale Flame",
              "artifact_url": "https://paimon.moe/images/artifacts/pale_flame_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Physical DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
              "artifact_sands": "ATK% / Energy Recharge"
            },
             {
              "artifact_name": "Bloodstained Chivalry",
              "artifact_url": "https://paimon.moe/images/artifacts/bloodstained_chivalry_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Physical DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
              "artifact_sands": "ATK% / Energy Recharge"
            }
          ],
          "weapon_best": {
            "weapon_name": "Redhorn Stonethresher",
            "weapon_url": "https://paimon.moe/images/weapons/redhorn_stonethresher.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Skyward Pride",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_pride.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Snow-Tombed Starsilver",
              "weapon_url": "https://paimon.moe/images/weapons/snow-tombed_starsilver.png",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Prototype Archaic",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_archaic.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}