package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object TighnariDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Tighnari",
          "rarity": 5,
          "element": "dendro",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/87/Tighnari_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Admonition",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9b/Item_Philosophies_of_Admonition.png",
            "book_days": "Monday/Thursday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "The Meaning of Aeons",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c9/Item_The_Meaning_of_Aeons.png"
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
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Aqua Simulacra",
              "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "The Viridescent Hunt",
              "weapon_url": "https://paimon.moe/images/weapons/the_viridescent_hunt.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Prototype Crescent",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_crescent.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "iOa62xFfVx0"
        }
    """.trimIndent()
}