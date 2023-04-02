package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object SangonomiyaKokomiDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Sangonomiya Kokomi",
          "rarity": 5,
          "element": "hydro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/ff/Sangonomiya_Kokomi_Icon.png/revision/latest",
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
              "artifact_name": "Millelith Firmes",
              "artifact_url": "https://paimon.moe/images/artifacts/tenacity_of_the_millelith_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Vida%",
              "artifact_circlet": "Bônus de Cura",
              "artifact_sands": "Recarga  de Energia / Vida%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Histórias Extraordinárias de Caçadores de Dragões",
            "weapon_url": "https://paimon.moe/images/weapons/thrilling_tales_of_dragon_slayers.png",
            "weapon_rarity": 3
          },
          "weapons_replacements": [
            {
              "weapon_name": "Protótipo Âmbar",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_amber.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Fumetsu Gekka",
              "weapon_url": "https://paimon.moe/images/weapons/everlasting_moonglow.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Anel de Hakushin",
              "weapon_url": "https://paimon.moe/images/weapons/hakushin_ring.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "CUzAyZ2wMAI"
        }
    """.trimIndent()
}