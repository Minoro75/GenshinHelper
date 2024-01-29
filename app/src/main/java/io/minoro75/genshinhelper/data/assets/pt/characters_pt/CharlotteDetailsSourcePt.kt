package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object CharlotteDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Charlotte",
          "rarity": 4,
          "element": "cryo",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d2/Charlotte_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Justiça",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/37/Item_Philosophies_of_Justice.png",
            "book_days": "Terça-feira/Sexta-feira/Domingo"
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
              "artifact_name": "Trupe Dourada",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/4d/Item_Golden_Song%27s_Variation.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "ATQ% / Dano Cryo",
              "artifact_circlet": "Dano Crítico",
              "artifact_sands": "ATQ%"
            }
          ],
          "weapon_best": {
              "weapon_name": "Prova de Kagura",
            "weapon_url": "https://paimon.moe/images/weapons/kaguras_verity.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Atlas Celestial",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Fluxo da Pureza",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Weapon_Flowing_Purity.png/revision/latest",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Fluxo da Pureza",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Weapon_Flowing_Purity.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
         "video_guide": "LtFoq0m0AkU"
        }
    """.trimIndent()
}