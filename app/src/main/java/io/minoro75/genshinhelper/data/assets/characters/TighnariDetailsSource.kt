package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object TighnariDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Tighnari",
          "rarity": 5,
          "element": "dendro",
          "weapon": "bow",
          "image_url": "https://paimon.moe/images/characters/tighnari.png",
          "talents_books": {
            "book_name": "Admonition",
            "book_url": "https://paimon.moe/images/items/philosophies_of_admonition.png",
            "book_days": "MON/THU/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "The Meaning of Aeons",
            "boss_item_url": "https://paimon.moe/images/items/the_meaning_of_aeons.png"
          },
          "talents_priority": [
            "Attack",
            "Burst",
            "Skill"
          ],
          "artifacts": [
            {
              "artifact_name": "Deepwood Memories",
              "artifact_url": "https://paimon.moe/images/artifacts/deepwood_memories_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dendro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG ",
              "artifact_sands": "ATK% / Elemental Mastery"
            }
          ],
          "weapon_best": {
            "weapon_name": "Hunter's Path",
            "weapon_url": "https://paimon.moe/images/weapons/hunters_path.png",
            "weapon rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Aqua Simulacra",
              "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
              "weapon rarity": 5
            },
            {
              "weapon_name": "The Viridescent Hunt",
              "weapon_url": "https://paimon.moe/images/weapons/the_viridescent_hunt.png",
              "weapon rarity": 4
            },
            {
              "weapon_name": "Prototype Crescent",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_crescent.png",
              "weapon rarity": 4
            }
          ]
        }
    """.trimIndent()
}