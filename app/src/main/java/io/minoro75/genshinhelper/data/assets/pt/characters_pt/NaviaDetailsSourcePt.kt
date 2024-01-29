package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object NaviaDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Navia",
          "rarity": 5,
          "element": "geo",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c0/Navia_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Igualdade",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a0/Item_Philosophies_of_Equity.png",
            "book_days": "Segunda-feira/Quinta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Fio de Seda Sem Luz",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Lightless_Silk_String.png/revision/latest"
          },
          "talents_priority": [
            "Habilidade",
            "Ataque",
            "Supremo"
          ],
          "artifacts": [
            {
               "artifact_name": "Ecos da Floresta Noturna",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9f/Item_Selfless_Floral_Accessory.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Geo",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Veredito",
            "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1d/Weapon_Verdict.png/revision/latest",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Espada Áspera",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Weapon_The_Unforged.png/revision/latest",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Espinha Dorsal da Serpente",
              "weapon_url": "https://paimon.moe/images/weapons/serpent_spine.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Lâmina das Ondas",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/69/Weapon_Tidal_Shadow.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "dPAFJ_pdi9o"
        }
    """.trimIndent()
}