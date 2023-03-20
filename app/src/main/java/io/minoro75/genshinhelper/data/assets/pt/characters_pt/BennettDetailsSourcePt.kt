package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object BennettDetailsSourcePt {
    @Language("JSON")
    val details = """
            {
              "name": "Bennett",
              "rarity": 4,
              "element": "pyro",
              "weapon": "sword",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/79/Bennett_Icon.png/revision/latest",
              "talents_books": {
                "book_name": "Resistência",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0b/Item_Philosophies_of_Resistance.png",
                "book_days": "Terça-feira/Sexta-feira/Domingo"
              },
              "weekly_boss_item": {
                "boss_item_name": "Plumas do Vento Oriental",
                "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bf/Item_Dvalin%27s_Plume.png"
              },
              "talents_priority": [
                "Supremo",
                "Habilidade",
                "Ataque"
              ],
              "artifacts": [
                {
                  "artifact_name": "Antigo Ritual Real",
                  "artifact_url": "https://paimon.moe/images/artifacts/noblesse_oblige_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Vida%",
                  "artifact_circlet": "Bônus de Cura / Vida%",
                  "artifact_sands": "Recarga de Energia / Vida%"
                }
              ],
              "weapon_best": {
                "weapon_name": "Espada Celestial",
                "weapon_url": "https://paimon.moe/images/weapons/skyward_blade.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Brilho do Beco",
                  "weapon_url": "https://paimon.moe/images/weapons/the_alley_flash.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Espada do Sacrifício",
                  "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Protótipo Rancor",
                  "weapon_url": "https://paimon.moe/images/weapons/prototype_rancour.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "H0tUlWYGYX8"
            }
        """.trimIndent()
}
