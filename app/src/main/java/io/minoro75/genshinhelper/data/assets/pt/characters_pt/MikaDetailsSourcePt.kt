package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object MikaDetailsSourcePt {
    @Language("JSON")
    val details = """
            {
              "name": "Mika",
              "rarity": 4,
              "element": "cryo",
              "weapon": "polearm",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/dd/Mika_Icon.png/revision/latest",
              "talents_books": {
                 "book_name": "Poemas",
                 "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7e/Item_Philosophies_of_Ballad.png",
                 "book_days": "Quarta-feira/Sábado/Domingo"
              },
              "weekly_boss_item": {
              "boss_item_name": "Lentes Desalmadas",
              "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/ee/Item_Mirror_of_Mushin.png"
              },
              "talents_priority": [
                "Habilidade",
                "Supremo",
                "Ataque"
              ],
              "artifacts": [
                {
                  "artifact_name": "Antigo Ritual Real",
                  "artifact_url": "https://paimon.moe/images/artifacts/noblesse_oblige_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Vida%",
                  "artifact_circlet": "Vida%",
                  "artifact_sands": "Recarga de Energia / Vida%"
                }
              ],
              "weapon_best": {
                  "weapon_name": "Lança de Favonius",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
                  "weapon_rarity": 4
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Luz do Cortador de Grama",
                  "weapon_url": "https://paimon.moe/images/weapons/engulfing_lightning.png",
                  "weapon_rarity": 5
                },
                {
                 "weapon_name": "Borla Preta",
                 "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
                 "weapon_rarity": 3
                },
                {
                  "weapon_name": "Lança de Favonius",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "SmB_WzlRNdo"
            }
        """.trimIndent()
}