package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object AlhaithamDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Alhaitham",
          "rarity": 5,
          "element": "dendro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/2c/Alhaitham_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Engenhosidade",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Item_Philosophies_of_Ingenuity.png",
            "book_days": "Terça-feira/Sexta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Lentes Desalmadas",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/ee/Item_Mirror_of_Mushin.png"
          },
          "talents_priority": [
            "Habilidade",
            "Supremo",
            "Ataque"
          ],
          "artifacts": [
            {
              "artifact_name": "Memórias da Floresta",
              "artifact_url": "https://paimon.moe/images/artifacts/deepwood_memories_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Dendro",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "Proficiência Elemental"
            }
          ],
          "weapon_best": {
             "weapon_name": "Luz das Folhas Cortadas",
              "weapon_url": "https://paimon.moe/images/weapons/light_of_foliar_incision.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
            "weapon_name": "Haran Geppaku Futsu",
            "weapon_url": "https://paimon.moe/images/weapons/haran_geppaku_futsu.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Cortadora da Neblina Reforjada",
              "weapon_url": "https://paimon.moe/images/weapons/mistsplitter_reforged.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Prenúncio do Alvorecer",
              "weapon_url": "https://paimon.moe/images/weapons/harbinger_of_dawn.png",
              "weapon_rarity": 3
            }
          ],
         "video_guide": "5zbgCrxiE8Q"
        }
    """.trimIndent()
}