package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object ShenheDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Shenhe",
          "rarity": 5,
          "element": "cryo",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/af/Shenhe_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Prosperidade",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bd/Item_Philosophies_of_Prosperity.png",
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
              "artifact_name": "Último Juramento do Gladiador",
              "artifact_url": "https://paimon.moe/images/artifacts/gladiators_finale_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "ATQ%",
              "artifact_circlet": "ATQ%",
              "artifact_sands": "ATQ% / Recarga de Energia"
            },
            {
              "artifact_name": "Reminescência Nostálgica",
              "artifact_url": "https://paimon.moe/images/artifacts/shimenawas_reminiscence_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "ATQ%",
              "artifact_circlet": "ATQ%",
              "artifact_sands": "ATQ% / Recarga de Energia"
            }
          ],
          "weapon_best": {
            "weapon_name": "Subjugadora de Calamidades",
            "weapon_url": "https://paimon.moe/images/weapons/calamity_queller.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Luz do Cortador de Grama",
              "weapon_url": "https://paimon.moe/images/weapons/engulfing_lightning.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Lança de Favonius",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "A Fisgada",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "DquTtz-XkZo"
        }
    """.trimIndent()
}