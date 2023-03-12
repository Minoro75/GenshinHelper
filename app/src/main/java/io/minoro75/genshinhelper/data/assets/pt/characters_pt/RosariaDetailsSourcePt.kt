package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object RosariaDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Rosaria",
          "rarity": 4,
          "element": "cryo",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/35/Rosaria_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Ballad",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7e/Item_Philosophies_of_Ballad.png",
            "book_days": "Wednesday/Saturday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Shadow of the Warrior",
            "boss_item_url": "https://paimon.moe/images/items/shadow_of_the_warrior.png"
          },
          "talents_priority": [
            "Burst",
            "Skill",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Noblesse Oblige",
              "artifact_url": "https://paimon.moe/images/artifacts/noblesse_oblige_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Cryo DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "ATK%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Primordial Jade Winged-Spear",
            "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_winged-spear.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Skyward Spine",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_spine.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Favonius Lance",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Favonius Lance",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "piArNdgUuV4"
        }
    """.trimIndent()
}