package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object RazorDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Razor",
          "rarity": 4,
          "element": "electro",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b8/Razor_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Resistência",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0b/Item_Philosophies_of_Resistance.png",
            "book_days": "Terça-feira/Sexta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Garra do Vento Oriental",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a8/Item_Dvalin%27s_Claw.png"
          },
          "talents_priority": [
            "Ataque",
            "Supremo",
            "Habilidade"
          ],
          "artifacts": [
            {
              "artifact_name": "Chama Pálida",
              "artifact_url": "https://paimon.moe/images/artifacts/pale_flame_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Físico",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Canção dos Pinhos",
            "weapon_url": "https://paimon.moe/images/weapons/song_of_broken_pines.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Túmulo do Lobo",
              "weapon_url": "https://paimon.moe/images/weapons/wolfs_gravestone.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Espinha Dorsal da Serpente",
              "weapon_url": "https://paimon.moe/images/weapons/serpent_spine.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Protótipo Arcaico",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_archaic.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "6eL2TQ-Kxy0"
        }
    """.trimIndent()
}