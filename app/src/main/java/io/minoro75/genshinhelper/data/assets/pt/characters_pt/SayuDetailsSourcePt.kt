package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object SayuDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Sayu",
          "rarity": 5,
          "element": "anemo",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/22/Sayu_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Luz Celeste",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/95/Item_Philosophies_of_Light.png",
            "book_days": "Quarta-feira/Sábado/Domingo"
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
              "artifact_gobelet": "Proficiência Elemental",
              "artifact_circlet": "Proficiência Elemental / Bônus de Cura",
              "artifact_sands": "Recarga  de Energia / Proficiência Elemental"
            }
          ],
          "weapon_best": {
            "weapon_name": "Túmulo do Lobo",
            "weapon_url": "https://paimon.moe/images/weapons/wolfs_gravestone.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Orgulho Celestial",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_pride.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Espadão de Favonius",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_greatsword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Espada Grande de Katsuragi",
              "weapon_url": "https://paimon.moe/images/weapons/katsuragikiri_nagamasa.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "UzY6CEow4e4"
        }
    """.trimIndent()
}