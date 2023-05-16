package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object KavehDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Kaveh",
          "rarity": 4,
          "element": "dendro",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1f/Kaveh_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Engenhosidade",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Item_Philosophies_of_Ingenuity.png",
            "book_days": "Terça-feira/Sexta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Florescência Primogênita do Oásis",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e7/Item_Primordial_Greenbloom.png/revision/latest"
          },
          "talents_priority": [
            "Supremo",
            "Ataque",
            "Habilidade"
          ],
          "artifacts": [
            {
              "artifact_name": "Memórias da Floresta",
              "artifact_url": "https://paimon.moe/images/artifacts/deepwood_memories_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Dendro",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "Recarga  de Energia"
            }
          ],
               "weapon_best": {
                "weapon_name": "Pavilhão do Deserto",
                "weapon_url": "https://paimon.moe/images/weapons/makhaira_aquamarine.png",
                "weapon_rarity": 4
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Código do Vento e das Flores",
                  "weapon_url": "https://paimon.moe/images/weapons/mailed_flower.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Segadeira da Chuva",
                  "weapon_url": "https://paimon.moe/images/weapons/rainslasher.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Espada Real da Floresta",
                  "weapon_url": "https://paimon.moe/images/weapons/forest_regalia.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "J1x7RM_ziSY"
        }
    """.trimIndent()
}