package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object JeanDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Jean",
          "rarity": 5,
          "element": "anemo",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/64/Jean_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Resistência",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0b/Item_Philosophies_of_Resistance.png",
            "book_days": "Terça-feira/Sexta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Plumas do Vento Oriental",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bf/Item_Dvalin%27s_Plume.png"
          },
          "talents_priority": [
            "Supremo",
            "Habilidade",
            "Ataque"
          ],
          "artifacts": [
            {
              "artifact_name": "Sombra Verde",
              "artifact_url": "https://paimon.moe/images/artifacts/viridescent_venerer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Anemo",
              "artifact_circlet": "Dano Crítico / Taxa Crítica / Bônus de Cura",
              "artifact_sands": "ATQ% / Recarga de Energia"
            }
          ],
          "weapon_best": {
            "weapon_name": "Juramento pela Liberdade",
            "weapon_url": "https://paimon.moe/images/weapons/freedom-sworn.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Espada Celestial",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_blade.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Espada de Favonius",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Lâmina Amenoma Kageuta",
              "weapon_url": "https://paimon.moe/images/weapons/amenoma_kageuchi.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "_f8S3_BKz9k"
        }
    """.trimIndent()
}