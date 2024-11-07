package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object ChioriDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Chiori",
          "rarity": 5,
          "element": "geo",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/88/Chiori_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Luz Celeste",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/95/Item_Philosophies_of_Light.png",
            "book_days": "Quarta-feira/Sábado/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Fio de Seda Sem Luz",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Lightless_Silk_String.png/revision/latest"
          },
          "talents_priority": [
            "Habilidade",
            "Supremo",
            "Ataque"
          ],
          "artifacts": [
            {
              "artifact_name": "Trupe Dourada",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/4d/Item_Golden_Song%27s_Variation.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Geo",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "DEF% / ATQ%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Urakugo Rensai",
            "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/44/Weapon_Uraku_Misugiri.png/revision/latest",
            "weapon_rarity": 5
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
              "weapon_name": "Flauta de Ezpitzal",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/31/Weapon_Flute_of_Ezpitzal.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "QeCsTWMFrmg"
        }
    """.trimIndent()
}