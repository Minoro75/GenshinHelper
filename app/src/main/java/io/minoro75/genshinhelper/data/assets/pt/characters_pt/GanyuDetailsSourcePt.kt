package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object GanyuDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Ganyu",
          "rarity": 5,
          "element": "cryo",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/79/Ganyu_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Diligence",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
            "book_days": "Tuesday/Friday/Sunday"
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
              "artifact_name": "Wanderer's Troupe",
              "artifact_url": "https://paimon.moe/images/artifacts/wanderers_troupe_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Cryo DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "ATK%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Amos' Bow",
            "weapon_url": "https://paimon.moe/images/weapons/amos_bow.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Aqua Simulacra",
              "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Prototype Crescent",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_crescent.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Hamayumi",
              "weapon_url": "https://paimon.moe/images/weapons/hamayumi.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "dzapswkQI6U"
        }
    """.trimIndent()
}
