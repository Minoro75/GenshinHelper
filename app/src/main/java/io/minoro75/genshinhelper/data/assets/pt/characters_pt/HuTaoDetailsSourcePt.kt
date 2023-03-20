package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object HuTaoDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Hu Tao",
          "rarity": 5,
          "element": "pyro",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e9/Hu_Tao_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Esforço",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
            "book_days": "Terça-feira/Sexta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Fragmento de Espada do Rei Demônio",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/48/Item_Shard_of_a_Foul_Legacy.png"
          },
          "talents_priority": [
            "Ataque",
            "Habilidade",
            "Supremo"
          ],
          "artifacts": [
            {
              "artifact_name": "A Bruxa das Chamas Carmesim",
              "artifact_url": "https://paimon.moe/images/artifacts/crimson_witch_of_flames_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Pyro",
              "artifact_circlet": "Dano Crítico / Taxa Crítica",
              "artifact_sands": "Vida%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Báculo de Homa",
            "weapon_url": "https://paimon.moe/images/weapons/staff_of_homa.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Lança de Jade Primitiva",
              "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_winged-spear.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Lança do Duelo",
              "weapon_url": "https://paimon.moe/images/weapons/deathmatch.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Perdição do Dragão",
              "weapon_url": "https://paimon.moe/images/weapons/dragons_bane.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "kRng9LFKRwI"
        }
    """.trimIndent()
}