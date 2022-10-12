package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object NoelleDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Noelle",
          "rarity": 4,
          "element": "geo",
          "weapon": "claymore",
          "image_url": "https://paimon.moe/images/characters/noelle.png",
          "talents_books": {
            "book_name": "Resistance",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0b/Item_Philosophies_of_Resistance.png",
            "book_days": "TUE/FRI/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Dvalin's Claw",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a8/Item_Dvalin%27s_Claw.png"
          },
          "talents_priority": [
            "Attack",
            "Burst",
            "Skill"
          ],
          "artifacts": [
            {
              "artifact_name": "Husk of Opulent Dreams",
              "artifact_url": "https://paimon.moe/images/artifacts/husk_of_opulent_dreams_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Geo DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "DEF% / ATK%"
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
              "weapon_name": "Serpent Spine",
              "weapon_url": "https://paimon.moe/images/weapons/serpent_spine.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Whiteblind",
              "weapon_url": "https://paimon.moe/images/weapons/whiteblind.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}