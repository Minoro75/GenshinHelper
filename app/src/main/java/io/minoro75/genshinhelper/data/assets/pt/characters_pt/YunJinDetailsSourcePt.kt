package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object YunJinDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Yun Jin",
          "rarity": 4,
          "element": "geo",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9c/Yun_Jin_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Esforço",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
            "book_days": "Terça-feira/Sexta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Coração das Cinzas",
            "boss_item_url": "https://paimon.moe/images/items/ashen_heart.png"
          },
          "talents_priority": [
            "Supremo",
            "Habilidade",
            "Ataque"
          ],
          "artifacts": [
            {
              "artifact_name": "Casca de Sonhos Opulentos",
              "artifact_url": "https://paimon.moe/images/artifacts/husk_of_opulent_dreams_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "DEF%",
              "artifact_circlet": "DEF% / Taxa Crítica",
              "artifact_sands": "DEF% / Recarga de Energia"
            }
          ],
          "weapon_best": {
            "weapon_name": "Luz do Cortador de Grama",
            "weapon_url": "https://paimon.moe/images/weapons/engulfing_lightning.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Lança de Favonius",
            "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
            "weapon_rarity": 4
            },
            {
              "weapon_name": "A Fisgada",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Protótipo Estelar",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_starglitter.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "SCxNTYac1RU"
        }
    """.trimIndent()
}