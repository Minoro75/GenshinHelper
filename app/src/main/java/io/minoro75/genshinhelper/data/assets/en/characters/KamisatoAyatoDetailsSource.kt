package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object KamisatoAyatoDetailsSource {
    @Language("JSON")
    val details = """
    {
      "name": "Kamisato Ayato",
      "rarity": 5,
      "element": "hydro",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a2/Character_Kamisato_Ayato_Thumb.png",
      "talents_books": {
        "book_name": "Elegance",
        "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/6f/Item_Philosophies_of_Elegance.png",
        "book_days": "TUE/FRI/SUN"
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
          "artifact_name": "Heart of Depth",
          "artifact_url": "https://paimon.moe/images/artifacts/heart_of_depth_flower.png",
          "artifact_amount": 4,
          "artifact_gobelet": "Hydro DPS",
          "artifact_circlet": "CRIT Rate / CRIT DMG",
          "artifact_sands": "ATK%"
        }
      ],
      "weapon_best": {
        "weapon_name": "Haran Geppaku Futsu",
        "weapon_url": "https://paimon.moe/images/weapons/haran_geppaku_futsu.png",
        "weapon_rarity": 5
      },
      "weapons_replacements": [
        {
          "weapon_name": "Mistsplitter Reforged",
          "weapon_url": "https://paimon.moe/images/weapons/mistsplitter_reforged.png",
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
      ]
    }
""".trimIndent()
}