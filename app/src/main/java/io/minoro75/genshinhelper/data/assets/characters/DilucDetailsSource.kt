package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object DilucDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Diluc",
          "rarity": 5,
          "element": "pyro",
          "weapon": "claymore",
          "image_url": "https://paimon.moe/images/characters/diluc.png",
          "talents_books": {
            "book_name": "Resistance",
            "book_url": "https://paimon.moe/images/items/philosophies_of_resistance.png",
            "book_days": "TUE/FRI/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Dvalin's Plume",
            "boss_item_url": "https://paimon.moe/images/items/dvalins_plume.png"
          },
          "talents_priority": [
            "Skill",
            "Attack",
            "Burst"
          ],
          "artifacts": [
            {
              "artifact_name": "Crimson Witch of Flames",
              "artifact_url": "https://paimon.moe/images/artifacts/crimson_witch_of_flames_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Pyro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "ATK% / Elemental Mastery"
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
              "weapon_name": "Serpent Spine",
              "weapon_url": "https://paimon.moe/images/weapons/serpent_spine.png",
              "weapon rarity": 4
            },
            {
              "weapon_name": "Prototype Archaic",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_archaic.png",
              "weapon rarity": 4
            }
          ]
        }
    """.trimIndent()
}
