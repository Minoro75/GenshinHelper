package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object KamisatoAyakaDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Kamisato Ayaka",
          "rarity": 5,
          "element": "cryo",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/51/Kamisato_Ayaka_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Cultura",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/6f/Item_Philosophies_of_Elegance.png",
            "book_days": "Terça-feira/Sexta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Galho de Jade de Sangue",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b1/Item_Bloodjade_Branch.png"
          },
          "talents_priority": [
            "Supremo",
            "Ataque",
            "Habilidade"
          ],
          "artifacts": [
            {
              "artifact_name": "Herói Invernal",
              "artifact_url": "https://paimon.moe/images/artifacts/blizzard_strayer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Cryo",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Cortadora da Neblina Reforjada",
            "weapon_url": "https://paimon.moe/images/weapons/mistsplitter_reforged.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Haran Geppaku Futsu",
              "weapon_url": "https://paimon.moe/images/weapons/haran_geppaku_futsu.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Espada Negra",
              "weapon_url": "https://paimon.moe/images/weapons/the_black_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Lâmina Amenoma Kageuta",
              "weapon_url": "https://paimon.moe/images/weapons/amenoma_kageuchi.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "Z6OC1gMgRVQ"
        }
    """.trimIndent()
}