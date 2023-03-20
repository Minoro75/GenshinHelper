package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object KukiShinobuDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Kuki Shinobu",
          "rarity": 4,
          "element": "electro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b3/Kuki_Shinobu_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Cultura",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/6f/Item_Philosophies_of_Elegance.png",
            "book_days": "Terça-feira/Sexta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Lágrima da Deusa do Desastre",
            "boss_item_url": "https://paimon.moe/images/items/tears_of_the_calamitous_god.png"
          },
          "talents_priority": [
            "Habilidade",
            "Supremo",
            "Ataque"
          ],
          "artifacts": [
            {
              "artifact_name": "Sonhos Dourados",
              "artifact_url": "https://paimon.moe/images/artifacts/gilded_dreams_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Proficiência Elemental",
              "artifact_circlet": "Proficiência Elemental",
              "artifact_sands": "Proficiência Elemental"
            }
          ],
          "weapon_best": {
             "weapon_name": "Juramento pela Liberdade",
              "weapon_url": "https://paimon.moe/images/weapons/freedom-sworn.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
            "weapon_name": "Cortadora de Jade Primordial",
            "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_cutter.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Espinho de Ferro",
              "weapon_url": "https://paimon.moe/images/weapons/iron_sting.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Espinho de Ferro",
              "weapon_url": "https://paimon.moe/images/weapons/iron_sting.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "30sXZ7e_MOc"
        }
    """.trimIndent()
}