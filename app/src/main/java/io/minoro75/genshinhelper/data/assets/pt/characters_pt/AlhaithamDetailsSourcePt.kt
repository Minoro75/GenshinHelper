package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object AlhaithamDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Alhaitham",
          "rarity": 5,
          "element": "dendro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/2c/Alhaitham_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Ingenuity",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Item_Philosophies_of_Ingenuity.png",
            "book_days": "Tuesday/Friday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Mirror of Mushin",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/ee/Item_Mirror_of_Mushin.png"
          },
          "talents_priority": [
            "Skill",
            "Burst",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Deepwood Memories",
              "artifact_url": "https://paimon.moe/images/artifacts/deepwood_memories_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dendro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "Elemental Mastery"
            }
          ],
          "weapon_best": {
             "weapon_name": "Light of Foliar Incision",
              "weapon_url": "https://paimon.moe/images/weapons/light_of_foliar_incision.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
            "weapon_name": "Haran Geppaku Futsu",
            "weapon_url": "https://paimon.moe/images/weapons/haran_geppaku_futsu.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Mistsplitter Reforged",
              "weapon_url": "https://paimon.moe/images/weapons/mistsplitter_reforged.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Harbinger of Dawn",
              "weapon_url": "https://paimon.moe/images/weapons/harbinger_of_dawn.png",
              "weapon_rarity": 3
            }
          ],
         "video_guide": "5zbgCrxiE8Q"
        }
    """.trimIndent()
}