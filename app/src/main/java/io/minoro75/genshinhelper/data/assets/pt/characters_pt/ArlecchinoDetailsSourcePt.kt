package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object ArlecchinoDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Arlecchino",
          "rarity": 5,
          "element": "pyro",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9a/Arlecchino_Icon.png/revision/latest",
          "talents_books": {
           "book_name": "Ordem",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/32/Item_Philosophies_of_Order.png",
            "book_days": "Quarta-feira/Sábado/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Vela Desvanecendo",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e4/Item_Fading_Candle.png/revision/latest"
          },
          "talents_priority": [
            "Ataque",
            "Habilidade",
            "Supremo"
          ],
          "artifacts": [
            {
              "artifact_name": "Fragmento da Harmonia Fantástica",
             "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/ff/Item_Harmonious_Symphony_Prelude.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Pyro",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Semblante da Lua Carmesim",
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
              "weapon_name": "Lança do Duelo",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Lança do Penhasco Obscuro",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "VAr-YtT1OZw"
        }
    """.trimIndent()
}