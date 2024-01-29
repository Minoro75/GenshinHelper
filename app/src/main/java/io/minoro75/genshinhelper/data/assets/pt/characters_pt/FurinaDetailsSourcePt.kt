package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object FurinaDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Furina",
          "rarity": 5,
          "element": "hydro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e6/Furina_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Justiça",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/37/Item_Philosophies_of_Justice.png",
            "book_days": "Terça-feira/Sexta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Massa Sem Luz",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/ae/Item_Lightless_Mass.png/revision/latest"
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
              "artifact_gobelet": "Vida%",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "Vida%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Esplendor das Águas Silenciosas",
            "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/4f/Weapon_Splendor_of_Tranquil_Waters.png/revision/latest",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Chave de Hierofania",
              "weapon_url": "https://paimon.moe/images/weapons/key_of_khaj-nisut.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Farpa",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e3/Weapon_Wolf-Fang.png/revision/latest",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Cruzamento de Fleuve Cendre",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7e/Weapon_Fleuve_Cendre_Ferryman.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "Gk_P5xGGH4M"
        }
    """.trimIndent()
}