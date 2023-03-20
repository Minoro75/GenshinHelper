package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object TravelerAnemoDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Viajante (Anemo)",
          "rarity": 5,
          "element": "anemo",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/59/Traveler_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Liberdade",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
            "book_days": "Segunda-feira/Quinta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Suspiro do Vento Oriental",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/07/Item_Dvalin%27s_Sigh.png"
          },
          "talents_priority": [
            "Habilidade",
            "Supremo",
            "Ataque"
          ],
          "artifacts": [
            {
              "artifact_name": "Sombra Verde",
              "artifact_url": "https://paimon.moe/images/artifacts/viridescent_venerer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Anemo",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "Recarga de Energia"
            }
          ],
          "weapon_best": {
            "weapon_name": "Cortador de Jade Primordial",
            "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_cutter.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Espada Celestial",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_blade.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Espada do Sacrifício",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Espinho de Ferro",
              "weapon_url": "https://paimon.moe/images/weapons/iron_sting.png",
              "weapon_rarity": 4
            }
          ],
         "video_guide": "SLw9rFjgH0k"
        }
    """.trimIndent()
}