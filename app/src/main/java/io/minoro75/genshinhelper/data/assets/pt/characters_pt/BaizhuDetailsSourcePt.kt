package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object BaizhuDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Baizhu",
          "rarity": 5,
          "element": "dendro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/cb/Baizhu_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Ouro",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_Philosophies_of_Gold.png",
            "book_days": "Quarta-feira/Sábado/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Samambaia do Paraíso Exuberante",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f8/Item_Worldspan_Fern.png/revision/latest"
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
              "artifact_gobelet": "Vida%",
              "artifact_circlet": "Vida%",
              "artifact_sands": "Vida%"
            }
          ],
         "weapon_best": {
                "weapon_name": "Esplendor Índigo",
                "weapon_url": "https://paimon.moe/images/weapons/jadefalls_splendor.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Codex de Favonius",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_codex.png",
                  "weapon_rarity": 4
                },
                {
                 "weapon_name": "Memórias de Sacrifício",
                 "weapon_url": "https://paimon.moe/images/weapons/sacrificial_fragments.png",
                 "weapon_rarity": 4
                },
                {
                 "weapon_name": "Protótipo Âmbar",
                  "weapon_url": "https://paimon.moe/images/weapons/prototype_amber.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "ngqcljyvPzo"
        }
    """.trimIndent()
}