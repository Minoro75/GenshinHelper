package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object ChevreuseDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Chevreuse",
          "rarity": 4,
          "element": "pyro",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8a/Chevreuse_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Ordem",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/32/Item_Philosophies_of_Order.png",
            "book_days": "Quarta-feira/Sábado/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Fio de Seda Sem Luz",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Lightless_Silk_String.png/revision/latest"
          },
          "talents_priority": [
            "Habilidade",
            "Supremo",
            "Ataque"
          ],
          "artifacts": [
            {
              "artifact_name": "Antigo Ritual Real",
              "artifact_url": "https://paimon.moe/images/artifacts/noblesse_oblige_flower.png ",
              "artifact_amount": 4,
              "artifact_gobelet": "Vida%",
              "artifact_circlet": "Vida%",
              "artifact_sands": "Vida%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Borla Preta",
            "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
            "weapon_rarity": 3
          },
          "weapons_replacements": [
            {
              "weapon_name": "Justa Recompensa",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8d/Weapon_Rightful_Reward.png/revision/latest",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Lança de Favonius",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
              "weapon_rarity": 4
            },
            {
            "weapon_name": "Borla Preta",
            "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
            "weapon_rarity": 3
            }
          ],
         "video_guide": "uBJoBXRo_z0"
        }
    """.trimIndent()
}