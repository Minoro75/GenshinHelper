package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object KleeDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Klee",
          "rarity": 5,
          "element": "pyro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9c/Klee_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Liberdade",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
            "book_days": "Segunda-feira/Quinta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Cálice do Vento Norte",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d6/Item_Ring_of_Boreas.png"
          },
          "talents_priority": [
            "Ataque",
            "Habilidade",
            "Supremo"
          ],
          "artifacts": [
            {
              "artifact_name": "A Bruxa das Chamas Carmesim",
              "artifact_url": "https://paimon.moe/images/artifacts/crimson_witch_of_flames_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Pyro",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ%"
            }
          ],
          "weapon_best": {
             "weapon_name": "Oração Perdida aos Ventos Sagrados",
              "weapon_url": "https://paimon.moe/images/weapons/lost_prayer_to_the_sacred_winds.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
            "weapon_name": "Atlas Celestial",
            "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Sinfonia dos Indolentes",
              "weapon_url": "https://paimon.moe/images/weapons/the_widsith.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Mappa Mare",
              "weapon_url": "https://paimon.moe/images/weapons/mappa_mare.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "sMbh40ikWGw"
        }
    """.trimIndent()
}