package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object XianyunDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Xianyun",
          "rarity": 5,
          "element": "anemo",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d3/Xianyun_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Ouro",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_Philosophies_of_Gold.png",
            "book_days": "Quarta-feira/Sábado/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Fio de Seda Sem Luz",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Lightless_Silk_String.png/revision/latest"
          },
          "talents_priority": [
            "Supremo",
            "Habilidade",
            "Ataque"
          ],
          "artifacts": [
            {
              "artifact_name": "Sombra Verde",
              "artifact_url": "https://paimon.moe/images/artifacts/viridescent_venerer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Recarga de Energia / ATQ%",
              "artifact_circlet": "ATQ%",
              "artifact_sands": "ATQ%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Chamado Ecoante da Garça",
            "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/61/Weapon_Crane%27s_Echoing_Call.png/revision/latest",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Atlas Celestial",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Olho do Juramento",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/af/Weapon_Oathsworn_Eye.png/revision/latest",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Histórias Extraordinárias de Caçadores de Dragões",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/19/Weapon_Thrilling_Tales_of_Dragon_Slayers.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "2mph3qwuN1E"
        }
    """.trimIndent()
}