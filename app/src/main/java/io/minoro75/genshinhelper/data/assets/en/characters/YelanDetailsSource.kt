package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object YelanDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Yelan",
          "rarity": 5,
          "element": "hydro",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d3/Yelan_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Prosperity",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bd/Item_Philosophies_of_Prosperity.png",
            "book_days": "Monday/Thursday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Gilded Scale",
            "boss_item_url": "https://paimon.moe/images/items/gilded_scale.png"
          },
          "talents_priority": [
            "Burst",
            "Skill",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Emblem of Severed Fate",
              "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Hydro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
              "artifact_sands": "HP%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Aqua Simulacra",
            "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Polar Star",
              "weapon_url": "https://paimon.moe/images/weapons/polar_star.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Fading Twilight",
              "weapon_url": "https://paimon.moe/images/weapons/fading_twilight.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Favonius Warbow",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_warbow.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "gnm47TtjmQE"
        }
    """.trimIndent()
}