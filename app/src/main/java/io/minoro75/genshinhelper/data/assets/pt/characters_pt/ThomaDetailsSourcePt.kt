package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object ThomaDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Thoma",
          "rarity": 4,
          "element": "pyro",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/5b/Thoma_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Mundo Mortal",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/27/Item_Philosophies_of_Transience.png",
            "book_days": "Segunda-feira/Quinta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Borboleta das Chamas Infernais",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/16/Item_Hellfire_Butterfly.png"
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
              "artifact_gobelet": "Vida% / Dano Pyro",
              "artifact_circlet": "Taxa Crítica / Dano Crítico / Vida%",
              "artifact_sands": "Recarga de Energia"
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
              "weapon_name": "Lança de Favonius",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "A Fisgada",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "yJEewYuhppc"
        }
    """.trimIndent()
}