package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object XiaoDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Xiao",
          "rarity": 5,
          "element": "anemo",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/fd/Xiao_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Prosperidade",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bd/Item_Philosophies_of_Prosperity.png",
            "book_days": "Segunda-feira/Quinta-feira/Domingo"
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
              "artifact_name": "Além-Vida Cinábrio",
              "artifact_url": "https://paimon.moe/images/artifacts/vermillion_hereafter_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Anemo",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Lança de Jade Primitiva",
            "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_winged-spear.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Báculo de Homa",
              "weapon_url": "https://paimon.moe/images/weapons/staff_of_homa.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Lança do Duelo",
              "weapon_url": "https://paimon.moe/images/weapons/deathmatch.png",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Lança de Favonius",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "pXkaHPRmysw"
        }
    """.trimIndent()
}