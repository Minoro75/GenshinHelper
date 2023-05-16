package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object KavehDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Kaveh",
          "rarity": 4,
          "element": "dendro",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1f/Kaveh_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Ingenuity",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Item_Philosophies_of_Ingenuity.png",
            "book_days": "Tuesday/Friday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Primordial Greenbloom",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e7/Item_Primordial_Greenbloom.png/revision/latest"
          },
          "talents_priority": [
            "Burst",
            "Attack",
            "Skill"
          ],
          "artifacts": [
            {
              "artifact_name": "Deepwood Memories",
              "artifact_url": "https://paimon.moe/images/artifacts/deepwood_memories_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dendro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "Energy Recharge"
            }
          ],
          "weapon_best": {
              "weapon_name": "Makhaira Aquamarine",
              "weapon_url": "https://paimon.moe/images/weapons/makhaira_aquamarine.png",
              "weapon_rarity": 4
          },
          "weapons_replacements": [
            {
              "weapon_name": "Mailed Flower",
              "weapon_url": "https://paimon.moe/images/weapons/mailed_flower.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Rainslasher",
              "weapon_url": "https://paimon.moe/images/weapons/rainslasher.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Forest Regalia",
              "weapon_url": "https://paimon.moe/images/weapons/forest_regalia.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "bozxNtC8OhU"
        }
    """.trimIndent()
}