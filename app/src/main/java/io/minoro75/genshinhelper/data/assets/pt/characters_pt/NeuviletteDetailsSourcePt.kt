package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object NeuviletteDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Neuvilette",
          "rarity": 5,
          "element": "hydro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/21/Neuvillette_Icon.png/revision/latest",
          "talents_books": {
          "book_name": "Igualdade",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a0/Item_Philosophies_of_Equity.png",
            "book_days": "Segunda-feira/Quinta-feira/Domingo"
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
              "artifact_gobelet": "Dano Hydro / Vida %",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "Vida %"
            }
          ],
          "weapon_best": {
            "weapon_name": "Rito do Fluxo Eterno",
            "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/91/Weapon_Tome_of_the_Eternal_Flow.png/revision/latest",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
            "weapon_name": "Oração Perdida aos Ventos Sagrados",
            "weapon_url": "https://paimon.moe/images/weapons/lost_prayer_to_the_sacred_winds.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Sinfonia dos Indolentes",
              "weapon_url": "https://paimon.moe/images/weapons/the_widsith.png",
              "weapon_rarity": 4
            },
            {
                  "weapon_name": "Chapeamento de Ouro",
                  "weapon_url": "https://paimon.moe/images/weapons/prototype_amber.png",
                  "weapon_rarity": 4
            }
          ],
          "video_guide": "e2t92BkeSKU"
        }
    """.trimIndent()
}