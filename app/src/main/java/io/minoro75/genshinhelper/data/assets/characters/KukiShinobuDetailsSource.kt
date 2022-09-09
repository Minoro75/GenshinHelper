package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object KukiShinobuDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Kuki Shinobu",
          "rarity": 4,
          "element": "electro",
          "weapon": "sword",
          "image_url": "https://paimon.moe/images/characters/kuki_shinobu.png",
          "talents_books": {
            "book_name": "Elegance",
            "book_url": "https://paimon.moe/images/items/philosophies_of_elegance.png",
            "book_days": "TUE/FRI/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Tears of the Calamitous God",
            "boss_item_url": "https://paimon.moe/images/items/tears_of_the_calamitous_god.png"
          },
          "talents_priority": [
            "Skill",
            "Burst",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Gilded Dreams",
              "artifact_url": "https://paimon.moe/images/artifacts/gilded_dreams_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Elemental Mastery",
              "artifact_circlet": "Elemental Mastery",
              "artifact_sands": "Elemental Mastery"
            }
          ],
          "weapon_best": {
             "weapon_name": "Freedom-Sworn",
              "weapon_url": "https://paimon.moe/images/weapons/freedom-sworn.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
            "weapon_name": "Primordial Jade Cutter",
            "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_cutter.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Iron Sting",
              "weapon_url": "https://paimon.moe/images/weapons/iron_sting.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Festering Desire",
              "weapon_url": "https://paimon.moe/images/weapons/festering_desire.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}