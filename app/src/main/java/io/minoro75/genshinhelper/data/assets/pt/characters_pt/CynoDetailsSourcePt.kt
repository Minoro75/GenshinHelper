package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object CynoDetailsSourcePt {
    @Language("JSON")
    val details = """
            {
              "name": "Cyno",
              "rarity": 5,
              "element": "electro",
              "weapon": "polearm",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/31/Cyno_Icon.png/revision/latest",
              "talents_books": {
                "book_name": "Admoestação",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9b/Item_Philosophies_of_Admonition.png",
                "book_days": "Segunda-feira/Quinta-feira/Domingo"
              },
              "weekly_boss_item": {
                "boss_item_name": "Mudra da Shogun Maléfica",
                "boss_item_url": "https://paimon.moe/images/items/mudra_of_the_malefic_general.png"
              },
              "talents_priority": [
                "Supremo",
                "Habilidade",
                "Ataque"
              ],
              "artifacts": [
                {
                  "artifact_name": "Trovão Furioso",
                  "artifact_url": "https://paimon.moe/images/artifacts/thundering_fury_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Dano Electro",
                  "artifact_circlet": "Taxa Crítica / Dano Crítico",
                  "artifact_sands": "Proficiência  Elemental / ATQ%"
                }
              ],
              "weapon_best": {
                "weapon_name": "Báculo das Areias Escarlates",
                "weapon_url": "https://paimon.moe/images/weapons/staff_of_the_scarlet_sands.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Lança de Jade Primordial",
                  "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_winged-spear.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Lança do Duelo",
                  "weapon_url": "https://paimon.moe/images/weapons/deathmatch.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Borla Branca",
                  "weapon_url": "https://paimon.moe/images/weapons/white_tassel.png",
                  "weapon_rarity": 3
                }
              ],
             "video_guide": "mxY0Vm7zuCM"
            }
        """.trimIndent()
}