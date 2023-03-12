package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object YoimiyaDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Yoimiya",
          "rarity": 5,
          "element": "pyro",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/88/Yoimiya_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Transience",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/27/Item_Philosophies_of_Transience.png",
            "book_days": "Monday/Thursday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Dragon Lord's Crown",
            "boss_item_url": "https://paimon.moe/images/items/dragon_lords_crown.png"
          },
          "talents_priority": [
            "Attack",
            "Skill",
            "Burst"
          ],
          "artifacts": [
            {
              "artifact_name": "Shimenawa's Reminiscence",
              "artifact_url": "https://paimon.moe/images/artifacts/shimenawas_reminiscence_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Pyro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
              "artifact_sands": "ATK%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Thundering Pulse",
            "weapon_url": "https://paimon.moe/images/weapons/thundering_pulse.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Aqua Simulacra",
            "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Rust",
              "weapon_url": "https://paimon.moe/images/weapons/rust.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Prototype Crescent",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_crescent.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "6CKnyJC4UWQ"
        }
    """.trimIndent()
}