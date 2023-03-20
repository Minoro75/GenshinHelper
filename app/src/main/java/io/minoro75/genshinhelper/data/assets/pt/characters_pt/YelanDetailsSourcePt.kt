package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object YelanDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Yelan",
          "rarity": 5,
          "element": "hydro",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d3/Yelan_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Prosperidade",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bd/Item_Philosophies_of_Prosperity.png",
            "book_days": "Segunda-feira/Quinta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Escama Dourada",
            "boss_item_url": "https://paimon.moe/images/items/gilded_scale.png"
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
              "artifact_gobelet": "Dano Hydro",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "Vida%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Aqua Simulacra",
            "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Estrela Invernal",
              "weapon_url": "https://paimon.moe/images/weapons/polar_star.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Crepúsculo Desvanecido",
              "weapon_url": "https://paimon.moe/images/weapons/fading_twilight.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Arck de Favonius",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_warbow.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "gnm47TtjmQE"
        }
    """.trimIndent()
}