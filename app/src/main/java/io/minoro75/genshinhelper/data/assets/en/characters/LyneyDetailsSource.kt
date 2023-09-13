package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object LyneyDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Lyney",
          "rarity": 5,
          "element": "pyro",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b2/Lyney_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Equity",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a0/Item_Philosophies_of_Equity.png",
            "book_days": "Monday/Thursday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Primordial Greenbloom",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e7/Item_Primordial_Greenbloom.png/revision/latest"
          },
          "talents_priority": [
            "Attack",
            "Skill",
            "Burst"
          ],
          "artifacts": [
            {
              "artifact_name": "Marechaussee Hunter",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8d/Item_Hunter%27s_Brooch.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Pyro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
              "artifact_sands": "ATK%"
            }
          ],
          "weapon_best": {
            "weapon_name": "The First Great Magic",
            "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/03/Weapon_The_First_Great_Magic.png/revision/latest",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Aqua Simulacra",
            "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Scion of the Blazing Sun",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/83/Weapon_Scion_of_the_Blazing_Sun.png/revision/latest",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Prototype Crescent",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_crescent.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "HAExnaJd4Hk"
        }
    """.trimIndent()
}