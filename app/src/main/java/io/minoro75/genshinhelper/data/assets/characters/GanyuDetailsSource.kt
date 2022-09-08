package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object GanyuDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Ganyu",
          "rarity": 5,
          "element": "cryo",
          "weapon": "bow",
          "image_url": "https://paimon.moe/images/characters/ganyu.png",
          "talents_books": {
            "book_name": "Diligence",
            "book_url": "https://paimon.moe/images/items/philosophies_of_diligence.png",
            "book_days": "TUE/FRI/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Shadow of the Warrior",
            "boss_item_url": "https://paimon.moe/images/items/shadow_of_the_warrior.png"
          },
          "talents_priority": [
            "Attack",
            "Burst",
            "Skill"
          ],
          "artifacts": [
            {
              "artifact_name": "Blizzard Strayer",
              "artifact_url": "https://paimon.moe/images/artifacts/blizzard_strayer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Cryo DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "ATK%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Amos' Bow",
            "weapon_url": "https://paimon.moe/images/weapons/amos_bow.png",
            "weapon rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Aqua Simulacra",
              "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
              "weapon rarity": 5
            },
            {
              "weapon_name": "Prototype Crescent",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_crescent.png",
              "weapon rarity": 4
            },
            {
              "weapon_name": "Hamayumi",
              "weapon_url": "https://paimon.moe/images/weapons/hamayumi.png",
              "weapon rarity": 4
            }
          ]
        }
    """.trimIndent()
}
