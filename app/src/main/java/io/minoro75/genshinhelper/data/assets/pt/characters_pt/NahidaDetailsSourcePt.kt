package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object NahidaDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Nahida",
          "rarity": 5,
          "element": "dendro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f9/Nahida_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Engenhosidade",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Item_Philosophies_of_Ingenuity.png",
            "book_days": "Terça-feira/Sexta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Fios da Marionete",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f2/Item_Puppet_Strings.png"
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
              "artifact_gobelet": "Proficiência Elemental",
              "artifact_circlet": "Proficiência Elemental",
              "artifact_sands": "Proficiência Elemental"
            }
          ],
         "weapon_best": {
                "weapon_name": "Sonhos Flutuantes das Mil Noites",
                "weapon_url": "https://paimon.moe/images/weapons/a_thousand_floating_dreams.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Estrela Itinerante",
                  "weapon_url": "https://paimon.moe/images/weapons/wandering_evenstar.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Memórias de Sacrifício",
                  "weapon_url": "https://paimon.moe/images/weapons/sacrificial_fragments.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Guia de Magia",
                  "weapon_url": "https://paimon.moe/images/weapons/magic_guide.png",
                  "weapon_rarity": 3
                }
              ],
              "video_guide": "EOsPBRqWldc"
        }
    """.trimIndent()
}