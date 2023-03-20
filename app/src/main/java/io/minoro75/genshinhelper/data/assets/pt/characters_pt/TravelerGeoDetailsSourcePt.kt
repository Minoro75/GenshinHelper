package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object TravelerGeoDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Viajante (Geo)",
          "rarity": 5,
          "element": "geo",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/59/Traveler_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Prosperidade",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bd/Item_Philosophies_of_Prosperity.png",
            "book_days": "Segunda-feira/Quinta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Cauda do Vento do Norte",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/66/Item_Tail_of_Boreas.png"
          },
          "talents_priority": [
            "Habilidade",
            "Supremo",
            "Ataque"
          ],
          "artifacts": [
            {
              "artifact_name": "Selo da Insulação",
              "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Geo",
              "artifact_circlet": "Taxa  Crítica / Dano Crítico",
              "artifact_sands": "ATQ% / Recarga de Energia"
            }
          ],
          "weapon_best": {
            "weapon_name": "Cortador de Jade Primordial",
            "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_cutter.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Cortador de Montanhas",
              "weapon_url": "https://paimon.moe/images/weapons/summit_shaper.png",
              "weapon_rarity": 5
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
          "video_guide": "w13Gk8ITDcU"
        }
    """.trimIndent()
}