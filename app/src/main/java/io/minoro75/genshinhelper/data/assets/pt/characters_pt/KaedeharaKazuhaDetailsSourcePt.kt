package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object KaedeharaKazuhaDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Kaedehara Kazuha",
          "rarity": 5,
          "element": "anemo",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e3/Kaedehara_Kazuha_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Esforço",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
            "book_days": "Terça-feira/Sexta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Escama Dourada",
            "boss_item_url": "https://paimon.moe/images/items/gilded_scale.png"
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
              "artifact_gobelet": "Proficiência  Elemental / Dano Anemo",
              "artifact_circlet": "Proficiência  Elemental / Taxa Crítica / Dano Crítico",
              "artifact_sands": "Proficiência Elemental / ATQ%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Juramento pela Liberdade",
            "weapon_url": "https://paimon.moe/images/weapons/freedom-sworn.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Haran Geppaku Futsu",
              "weapon_url": "https://paimon.moe/images/weapons/haran_geppaku_futsu.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Espada de Favonius",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Espada do Sacrifício",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "xD6NkyBsNmQ"
        }
    """.trimIndent()
}