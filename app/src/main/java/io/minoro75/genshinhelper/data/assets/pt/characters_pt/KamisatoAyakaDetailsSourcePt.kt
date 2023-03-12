package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object KamisatoAyakaDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Kamisato Ayaka",
          "rarity": 5,
          "element": "cryo",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/51/Kamisato_Ayaka_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Elegance",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/6f/Item_Philosophies_of_Elegance.png",
            "book_days": "Tuesday/Friday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Bloodjade Branch",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b1/Item_Bloodjade_Branch.png"
          },
          "talents_priority": [
            "Burst",
            "Attack",
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
            "weapon_name": "Mistsplitter Reforged",
            "weapon_url": "https://paimon.moe/images/weapons/mistsplitter_reforged.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Haran Geppaku Futsu",
              "weapon_url": "https://paimon.moe/images/weapons/haran_geppaku_futsu.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "The Black Sword",
              "weapon_url": "https://paimon.moe/images/weapons/the_black_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Amenoma Kageuchi",
              "weapon_url": "https://paimon.moe/images/weapons/amenoma_kageuchi.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "Z6OC1gMgRVQ"
        }
    """.trimIndent()
}