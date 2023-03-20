package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object RaidenShogunDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Raiden Shogun",
          "rarity": 5,
          "element": "electro",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/24/Raiden_Shogun_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Luz Celeste",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/95/Item_Philosophies_of_Light.png",
            "book_days": "Quarta-feira/Sábado/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Momento Derretido",
            "boss_item_url": "https://paimon.moe/images/items/molten_moment.png"
          },
          "talents_priority": [
            "Supremo",
            "Habilidade",
            "Ataque"
          ],
          "artifacts": [
            {
              "artifact_name": "Selo da Insulação",
              "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "ATQ% / Dano Electro",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "Recarga  de Energia / ATQ%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Luz do Cortador de Grama",
            "weapon_url": "https://paimon.moe/images/weapons/engulfing_lightning.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Báculo de Homa",
              "weapon_url": "https://paimon.moe/images/weapons/staff_of_homa.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Barbatana do Quebra Ondas",
              "weapon_url": "https://paimon.moe/images/weapons/wavebreakers_fin.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "A Fisgada",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "BYBKAZ-VjDI"
        }
    """.trimIndent()
}