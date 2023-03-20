package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object XingqiuDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Xingqiu",
          "rarity": 4,
          "element": "hydro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d4/Xingqiu_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Ouro",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_Philosophies_of_Gold.png",
            "book_days": "Quarta-feira/Sábado/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Cauda do Vento do Norte",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/66/Item_Tail_of_Boreas.png"
          },
          "talents_priority": [
            "Supremo",
            "Ataque",
            "Habilidade"
          ],
          "artifacts": [
            {
              "artifact_name": "Selo da Insulação",
              "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Hydro",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ% / Recarga de Energia"
            }
          ],
          "weapon_best": {
            "weapon_name": "Espada do Sacrifício",
            "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
            "weapon_rarity": 4
          },
          "weapons_replacements": [
            {
              "weapon_name": "Cortador de Jade Primordial",
              "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_cutter.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Cortadora da Neblina Reforjada",
              "weapon_url": "https://paimon.moe/images/weapons/mistsplitter_reforged.png",
              "weapon_rarity": 5
            },
            {
             "weapon_name": "Lâmina Amenoma Kageuta",
              "weapon_url": "https://paimon.moe/images/weapons/amenoma_kageuchi.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "tHqFAZDMqSQ"
        }
    """.trimIndent()
}