package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object MonaDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Mona",
          "rarity": 5,
          "element": "hydro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/41/Mona_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Resistência",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0b/Item_Philosophies_of_Resistance.png",
            "book_days": "Terça-feira/Sexta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Cálice do Vento Norte",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d6/Item_Ring_of_Boreas.png"
          },
          "talents_priority": [
            "Supremo",
            "Habilidade",
            "Ataque"
          ],
          "artifacts": [
            {
              "artifact_name": "Selo da Insulação",
              "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Hydro",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ%"
            }
          ],
          "weapon_best": {
             "weapon_name": "Atlas Celestial",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Memória da Poeira",
            "weapon_url": "https://paimon.moe/images/weapons/memory_of_dust.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Sinfonia dos Indolentes",
              "weapon_url": "https://paimon.moe/images/weapons/the_widsith.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Mappa Mare",
              "weapon_url": "https://paimon.moe/images/weapons/mappa_mare.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "jsySfuZQhEM"
        }
    """.trimIndent()
}