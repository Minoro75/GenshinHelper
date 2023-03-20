package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object TravelerDendroDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Viajante (Dendro)",
          "rarity": 5,
          "element": "dendro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/59/Traveler_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Admoestação",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9b/Item_Philosophies_of_Admonition.png",
            "book_days": "Segunda-feira/Quinta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Mudra da Shogun Maléfica",
            "boss_item_url": "https://paimon.moe/images/items/mudra_of_the_malefic_general.png"
          },
          "talents_priority": [
            "Supremo",
            "Habilidade",
            "Ataque"
          ],
          "artifacts": [
            {
              "artifact_name": "Memórias da Floresta",
              "artifact_url": "https://paimon.moe/images/artifacts/deepwood_memories_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Dendro",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "Recarga de Energia / Proficiência Elemental"
            }
          ],
          "weapon_best": {
            "weapon_name": "Juramento pela Liberdade",
            "weapon_url": "https://paimon.moe/images/weapons/freedom-sworn.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Espada do Sacrifício",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Espada de Favonius",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Espinho de Ferro",
              "weapon_url": "https://paimon.moe/images/weapons/iron_sting.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "wPZ5_axqjj0"
        }
    """.trimIndent()
}