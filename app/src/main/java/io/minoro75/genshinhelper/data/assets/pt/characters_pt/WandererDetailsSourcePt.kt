package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object WandererDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Andarilho",
          "rarity": 5,
          "element": "anemo",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f8/Wanderer_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Práxis",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/82/Item_Philosophies_of_Praxis.png",
            "book_days": "Quarta-feira/Sábado/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Sino do Vazio",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a2/Item_Daka%27s_Bell.png"
          },
          "talents_priority": [
            "Ataque",
            "Habilidade",
            "Supremo"
          ],
          "artifacts": [
            {
              "artifact_name": "Sombra Verde",
              "artifact_url": "https://paimon.moe/images/artifacts/viridescent_venerer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Anemo",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Reminescências de Tulaytullah",
            "weapon_url": "https://paimon.moe/images/weapons/tulaytullahs_remembrance.png",
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
          "video_guide": "v8DsKQ-2FA4"
        }
    """.trimIndent()
}