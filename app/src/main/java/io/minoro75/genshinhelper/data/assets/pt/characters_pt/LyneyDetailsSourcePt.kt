package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object LyneyDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Lyney",
          "rarity": 5,
          "element": "pyro",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b2/Lyney_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Igualdade",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a0/Item_Philosophies_of_Equity.png",
            "book_days": "Segunda-feira/Quinta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Florescência Primogênita do Oásis",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e7/Item_Primordial_Greenbloom.png/revision/latest"
          },
          "talents_priority": [
        "Ataque",
        "Habilidade",
         "Supremo"
          ],
          "artifacts": [
            {
              "artifact_name": "Caçador das Sombras",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8d/Item_Hunter%27s_Brooch.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Pyro",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Arcana Original",
            "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/03/Weapon_The_First_Great_Magic.png/revision/latest",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Aqua Simulacra",
            "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Herdeiro do Sol",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/83/Weapon_Scion_of_the_Blazing_Sun.png/revision/latest",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Protótipo",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_crescent.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "GrAz--vhGTI"
        }
    """.trimIndent()
}