package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object TravelerElectroDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Viajante (Electro)",
          "rarity": 5,
          "element": "electro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/59/Traveler_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Mundo Mortal",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/27/Item_Philosophies_of_Transience.png",
            "book_days": "Segunda-feira/Quinta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Coroa do Senhor dos Dragões",
            "boss_item_url": "https://paimon.moe/images/items/dragon_lords_crown.png"
          },
          "talents_priority": [
            "Supremo",
            "Habilidade",
            "Ataque"
          ],
          "artifacts": [
            {
              "artifact_name": "Antigo Ritual Real",
              "artifact_url": "https://paimon.moe/images/artifacts/noblesse_oblige_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Electro",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ% / Recarga de Energia"
            }
          ],
          "weapon_best": {
            "weapon_name": "Espada Celestial",
            "weapon_url": "https://paimon.moe/images/weapons/skyward_blade.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Espada do Sacrifício",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Espada Pútrida",
              "weapon_url": "https://paimon.moe/images/weapons/festering_desire.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Lâmina Amenoma Kageuta",
              "weapon_url": "https://paimon.moe/images/weapons/amenoma_kageuchi.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "Ng0ObuAE_lM"
        }
    """.trimIndent()
}