package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object KiraraDetailSource {
    @Language("JSON")
    val details = """
        {
          "name": "Kirara",
          "rarity": 4,
          "element": "dendro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b6/Kirara_Icon.png/revision/latest?cb=20230524073946",
          "talents_books": {
            "book_name": "Transience",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Item_Philosophies_of_Ingenuity.png",
            "book_days": "Monday/Thursday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Everamber",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/26/Item_Everamber.png/revision/latest"
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
              "artifact_gobelet": "HP% / Dendro DPS",
              "artifact_circlet": "HP% / CRIT Rate / CRIT DMG",
              "artifact_sands": "HP% / Elemental Mastery"
            }
          ],
          "weapon_best": {
                "weapon_name": "Key of Khaj-Nisut",
              "weapon_url": "https://paimon.moe/images/weapons/key_of_khaj-nisut.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
             "weapon_name": "Favonius Sword",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Sacrificial Sword",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Favonius Sword",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_sword.png",
              "weapon_rarity": 4
            }
          ],
         "video_guide": "SxvtTh3-BeY"
        }
    """.trimIndent()
}