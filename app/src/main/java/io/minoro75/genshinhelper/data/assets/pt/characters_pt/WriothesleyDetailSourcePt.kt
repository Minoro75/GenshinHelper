package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object WriothesleyDetailSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Wriothesley",
          "rarity": 5,
          "element": "cryo",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bb/Wriothesley_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Ordem",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/32/Item_Philosophies_of_Order.png",
            "book_days": "Quarta-feira/Sábado/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Âmbar Eterno",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/26/Item_Everamber.png/revision/latest"
          },
          "talents_priority": [
            "Ataque",
            "Habilidade",
            "Supremo"
          ],
          "artifacts": [
            {
              "artifact_name": "Caçador das Sombras",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8d/Item_Hunter%27s_Brooch.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Cryo",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ%"
            }
          ],
          "weapon_best": {
              "weapon_name": "Supervisão de Caixa",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f2/Weapon_Cashflow_Supervision.png/revision/latest",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
             "weapon_name": "Reminiscências de Tulaytullah",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/fc/Weapon_Tulaytullah%27s_Remembrance.png/revision/latest",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Sinfonia dos Indolentes",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f0/Weapon_The_Widsith.png/revision/latest",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Fluxo da Pureza",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Weapon_Flowing_Purity.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
         "video_guide": "nrEE-MaZTxY"
        }
    """.trimIndent()
}