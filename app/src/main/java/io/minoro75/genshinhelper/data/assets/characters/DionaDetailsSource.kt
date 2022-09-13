package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object DionaDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Diona",
          "rarity": 4,
          "element": "cryo",
          "weapon": "bow",
          "image_url": "https://paimon.moe/images/characters/diona.png",
          "talents_books": {
            "book_name": "Freedom",
            "book_url": "https://paimon.moe/images/items/philosophies_of_freedom.png",
            "book_days": "MON/THU/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Shard of a Foul Legacy",
            "boss_item_url": "https://paimon.moe/images/items/shard_of_a_foul_legacy.png"
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
              "artifact_gobelet": "HP%",
              "artifact_circlet": "Healing Bonus / HP%",
              "artifact_sands": "Energy Recharge / HP%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Elegy for the End",
            "weapon_url": "https://paimon.moe/images/weapons/elegy_for_the_end.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Sacrificial Bow",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_bow.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Favonius Warbow",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_warbow.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Recurve Bow",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_archaic.png",
              "weapon_rarity": 3
            }
          ]
        }
    """.trimIndent()
}