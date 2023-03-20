package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object YaeMikoDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Yae Miko",
          "rarity": 5,
          "element": "electro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/ba/Yae_Miko_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Luz Celeste",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/95/Item_Philosophies_of_Light.png",
            "book_days": "Quarta-feira/Sábado/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Significado de Éons",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c9/Item_The_Meaning_of_Aeons.png"
          },
          "talents_priority": [
            "Habilidade",
            "Supremo",
            "Ataque"
          ],
          "artifacts": [
            {
              "artifact_name": "Trovão Furioso",
              "artifact_url": "https://paimon.moe/images/artifacts/thundering_fury_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Dano Electro",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ% / Recarga de Energia"
            },
             {
              "artifact_name": "Último Juramento do Gladiador",
              "artifact_url": "https://paimon.moe/images/artifacts/gladiators_finale_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Dano Electro",
              "artifact_circlet": "Taxa  Crítica / Dano Crítico",
              "artifact_sands": "ATQ% / Recarga de Energia"
            }
          ],
          "weapon_best": {
            "weapon_name": "Prova de Kagura",
            "weapon_url": "https://paimon.moe/images/weapons/kaguras_verity.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Atlas Celestial",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Sinfonia dos Indolentes",
              "weapon_url": "https://paimon.moe/images/weapons/the_widsith.png",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Anel de Hakushin",
              "weapon_url": "https://paimon.moe/images/weapons/hakushin_ring.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "UV5m1tmMU_0"
        }
    """.trimIndent()
}