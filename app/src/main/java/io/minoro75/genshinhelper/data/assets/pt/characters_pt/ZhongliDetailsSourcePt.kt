package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object ZhongliDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Zhongli",
          "rarity": 5,
          "element": "geo",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a6/Zhongli_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Ouro",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_Philosophies_of_Gold.png",
            "book_days": "Quarta-feira/Sábado/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Chifre de Baleia Come-Céu",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1c/Item_Tusk_of_Monoceros_Caeli.png"
          },
          "talents_priority": [
            "Habilidade",
            "Supremo",
            "Ataque"
          ],
          "artifacts": [
            {
              "artifact_name": "Millelith Firmes",
              "artifact_url": "https://paimon.moe/images/artifacts/tenacity_of_the_millelith_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Vida%",
              "artifact_circlet": "Vida%",
              "artifact_sands": "Vida%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Borla Preta",
            "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
            "weapon_rarity": 3
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
              "weapon_name": "Borla Preta",
              "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
              "weapon_rarity": 3
            }
          ],
          "video_guide": "7JQQ9BUAzYA"
        }
    """.trimIndent()
}
