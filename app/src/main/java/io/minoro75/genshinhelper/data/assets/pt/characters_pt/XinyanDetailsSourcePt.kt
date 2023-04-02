package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object XinyanDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Xinyan",
          "rarity": 4,
          "element": "pyro",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/24/Xinyan_Icon.png/revision/latest",
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
            "Ataque",
            "Supremo",
            "Habilidade"
          ],
          "artifacts": [
            {
              "artifact_name": "Chama Pálida",
              "artifact_url": "https://paimon.moe/images/artifacts/pale_flame_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Dano Físico",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ% / Recarga de Energia"
            },
             {
              "artifact_name": "Cavaleiro Manchado de Sangue",
              "artifact_url": "https://paimon.moe/images/artifacts/bloodstained_chivalry_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Dano Físico",
              "artifact_circlet": "Taxa  Crítica / Dano Crítico",
              "artifact_sands": "ATQ% / Recarga de Energia"
            }
          ],
          "weapon_best": {
            "weapon_name": "Chifres Vermelhos Destruidores de Pedras",
            "weapon_url": "https://paimon.moe/images/weapons/redhorn_stonethresher.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Orgulho Celestial",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_pride.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Estrela de Prata Enterrada na Neve",
              "weapon_url": "https://paimon.moe/images/weapons/snow-tombed_starsilver.png",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Protótipo Arcaico",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_archaic.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "r_VnQdcUg6M"
        }
    """.trimIndent()
}