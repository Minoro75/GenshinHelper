package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object ShikanoinHeizouDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Shikanoin Heizou",
          "rarity": 4,
          "element": "anemo",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/20/Shikanoin_Heizou_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Mundo Mortal",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/27/Item_Philosophies_of_Transience.png",
            "book_days": "Segunda-feira/Quinta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Significado de Éons",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c9/Item_The_Meaning_of_Aeons.png"
          },
          "talents_priority": [
            "Habilidade",
            "Ataque",
            "Supremo"
            
          ],
          "artifacts": [
            {
              "artifact_name": "Sombra Verde",
              "artifact_url": "https://paimon.moe/images/artifacts/viridescent_venerer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Anemo",
              "artifact_circlet": "Taxa Crítica / Dano Crítico / Proficiência Elemental",
              "artifact_sands": "ATQ% / Proficiência Elemental"
            }
          ],
          "weapon_best": {
            "weapon_name": "Atlas Celestial",
            "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Prova de Kagura",
              "weapon_url": "https://paimon.moe/images/weapons/kaguras_verity.png",
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
          "video_guide": "og9tMCXAob8"
        }
    """.trimIndent()
}