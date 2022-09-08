package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object TravelerDendroDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Traveler (Dendro)",
          "rarity": 5,
          "element": "dendro",
          "weapon": "sword",
          "image_url": "https://paimon.moe/images/characters/traveler_anemo.png",
          "talents_books": {
            "book_name": "Admonition",
            "book_url": "https://paimon.moe/images/items/philosophies_of_admonition.png",
            "book_days": "MON/THU/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Mudra of the Malefic General",
            "boss_item_url": "https://paimon.moe/images/items/mudra_of_the_malefic_general.png"
          },
          "talents_priority": [
            "Burst",
            "Skill",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Deepwood Memories",
              "artifact_url": "https://paimon.moe/images/artifacts/deepwood_memories_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dendro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
              "artifact_sands": "Energy Recharge / Elemental Mastery"
            }
          ],
          "weapon_best": {
            "weapon_name": "Freedom-Sworn",
            "weapon_url": "https://paimon.moe/images/weapons/freedom-sworn.png",
            "weapon rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Sacrificial Sword",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
              "weapon rarity": 4
            },
            {
              "weapon_name": "Favonius Sword",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_sword.png",
              "weapon rarity": 4
            },
            {
              "weapon_name": "Iron Sting",
              "weapon_url": "https://paimon.moe/images/weapons/iron_sting.png",
              "weapon rarity": 4
            }
          ]
        }
    """.trimIndent()
}