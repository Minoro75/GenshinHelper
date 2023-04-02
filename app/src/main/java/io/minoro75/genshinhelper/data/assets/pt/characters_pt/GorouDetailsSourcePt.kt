package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object GorouDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Gorou",
          "rarity": 4,
          "element": "geo",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/fe/Gorou_Icon.png/revision/latest",
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
            "Habilidade",
            "Supremo",
            "Ataque"
          ],
          "artifacts": [
            {
              "artifact_name": "Casca de Sonhos Opulentos",
              "artifact_url": "https://paimon.moe/images/artifacts/husk_of_opulent_dreams_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "DEF%",
              "artifact_circlet": "DEF%",
              "artifact_sands": "DEF% / Recarga de Energia"
            }
          ],
          "weapon_best": {
            "weapon_name": "Elegia do Suspiro Final",
            "weapon_url": "https://paimon.moe/images/weapons/elegy_for_the_end.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Aqua Simulacra",
              "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Arco de Favonius",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_warbow.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Arco do Sacrifício",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_bow.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "jwlDV1ktFIo"
        }
    """.trimIndent()
}
