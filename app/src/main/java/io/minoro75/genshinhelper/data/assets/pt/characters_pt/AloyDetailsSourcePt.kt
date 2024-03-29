package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object AloyDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Aloy",
          "rarity": 5,
          "element": "cryo",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e5/Aloy_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Liberdade",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
            "book_days": "Segunda-feira/Quinta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Momento Derretido",
            "boss_item_url": "https://paimon.moe/images/items/molten_moment.png"
          },
          "talents_priority": [
            "Supremo",
            "Habilidade",
            "Ataque"
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
            "weapon_name": "Agitação Trovejante",
            "weapon_url": "https://paimon.moe/images/weapons/thundering_pulse.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Harpa Celestial",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_harp.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Último Acorde",
              "weapon_url": "https://paimon.moe/images/weapons/the_stringless.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Protótipo",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_crescent.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "BE_Vp__fKPY"
        }
    """.trimIndent()
}
