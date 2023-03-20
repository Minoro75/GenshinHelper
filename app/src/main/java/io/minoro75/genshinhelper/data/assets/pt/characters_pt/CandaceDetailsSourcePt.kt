package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object CandaceDetailsSourcePt {
    @Language("JSON")
    val details = """
            {
              "name": "Candace",
              "rarity": 4,
              "element": "hydro",
              "weapon": "polearm",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/dd/Candace_Icon.png/revision/latest",
              "talents_books": {
                "book_name": "Admoestação",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9b/Item_Philosophies_of_Admonition.png",
                "book_days": "Segunda-feira/Quinta-feira/Domingo"
              },
              "weekly_boss_item": {
                "boss_item_name": "Lágrima da Deusa do Desastre",
                "boss_item_url": "https://paimon.moe/images/items/tears_of_the_calamitous_god.png"
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
                  "artifact_sands": "Vida%"
                }
              ],
              "weapon_best": {
                "weapon_name": "Espinha Celestial",
                "weapon_url": "https://paimon.moe/images/weapons/skyward_spine.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Lança de Favonius",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "A Fisgada",
                  "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Borla Preta",
                  "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
                  "weapon_rarity": 3
                }
              ],
              "video_guide": "YZIU_sHauqM"
            }
        """.trimIndent()
}
