package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object NoelleDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Noelle",
          "rarity": 4,
          "element": "geo",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8e/Noelle_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Resistência",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0b/Item_Philosophies_of_Resistance.png",
            "book_days": "Terça-feira/Sexta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Garra do Vento Oriental",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a8/Item_Dvalin%27s_Claw.png"
          },
          "talents_priority": [
            "Ataque",
            "Supremo",
            "Habilidade"
          ],
          "artifacts": [
            {
              "artifact_name": "Casca de Sonhos Opulentos",
              "artifact_url": "https://paimon.moe/images/artifacts/husk_of_opulent_dreams_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Geo",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "DEF% / ATQ%"
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
              "weapon_name": "Espinha Dorsal da Serpente",
              "weapon_url": "https://paimon.moe/images/weapons/serpent_spine.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Sombra Branca",
              "weapon_url": "https://paimon.moe/images/weapons/whiteblind.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "1grF-dj4Dcs"
        }
    """.trimIndent()
}