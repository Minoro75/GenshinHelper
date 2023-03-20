package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object GanyuDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Ganyu",
          "rarity": 5,
          "element": "cryo",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/79/Ganyu_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Esforço",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
            "book_days": "Terça-feira/Sexta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Sombra do Guerreiro",
            "boss_item_url": "https://paimon.moe/images/items/shadow_of_the_warrior.png"
          },
          "talents_priority": [
            "Ataque",
            "Supremo",
            "Habilidade"
          ],
          "artifacts": [
            {
              "artifact_name": "Trupe Itinerante",
              "artifact_url": "https://paimon.moe/images/artifacts/wanderers_troupe_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Cryo",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Arco de Amos",
            "weapon_url": "https://paimon.moe/images/weapons/amos_bow.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Aqua Simulacra",
              "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Protótipo",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_crescent.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Arco Quebra-Demônios",
              "weapon_url": "https://paimon.moe/images/weapons/hamayumi.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "dzapswkQI6U"
        }
    """.trimIndent()
}
