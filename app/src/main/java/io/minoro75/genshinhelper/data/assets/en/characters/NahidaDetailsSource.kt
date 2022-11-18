package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object NahidaDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Nahida",
          "rarity": 5,
          "element": "dendro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/cf/Character_Nahida_Thumb.png",
          "talents_books": {
            "book_name": "Ingenuity",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Item_Philosophies_of_Ingenuity.png",
            "book_days": "TUE/FRI/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Puppet Strings",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f2/Item_Puppet_Strings.png"
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
              "artifact_gobelet": "Elemental Mastery",
              "artifact_circlet": "Elemental Mastery",
              "artifact_sands": "Elemental Mastery"
            }
          ],
         "weapon_best": {
                "weapon_name": "A Thousand Floating Dreams",
                "weapon_url": "https://paimon.moe/images/weapons/a_thousand_floating_dreams.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Wandering Evenstar",
                  "weapon_url": "https://paimon.moe/images/weapons/wandering_evenstar.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Sacrificial Fragments",
                  "weapon_url": "https://paimon.moe/images/weapons/sacrificial_fragments.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Magic Guide",
                  "weapon_url": "https://paimon.moe/images/weapons/magic_guide.png",
                  "weapon_rarity": 3
                }
              ]
        }
    """.trimIndent()
}