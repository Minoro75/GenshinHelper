package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object DoriDetailsSourcePt {
    @Language("JSON")
    val details = """
            {
              "name": "Dori",
              "rarity": 4,
              "element": "electro",
              "weapon": "claymore",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/54/Dori_Icon.png/revision/latest",
              "talents_books": {
                "book_name": "Engenhosidade",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Item_Philosophies_of_Ingenuity.png",
                "book_days": "Terça-feira/Sexta-feira/Domingo"
              },
              "weekly_boss_item": {
                "boss_item_name": "Galho de Jade de Sangue",
                "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b1/Item_Bloodjade_Branch.png"
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
                  "artifact_amount": 2,
                  "artifact_gobelet": "Dano Electro",
                  "artifact_circlet": "Vida% / Bônus de Cura",
                  "artifact_sands": "Recarga  de Energia / Vida%"
                },
                {
                  "artifact_name": "Millelith Firmes",
                  "artifact_url": "https://paimon.moe/images/artifacts/tenacity_of_the_millelith_flower.png",
                  "artifact_amount": 2,
                  "artifact_gobelet": "Dano Electro",
                  "artifact_circlet": "Vida% / Bônus de Cura",
                  "artifact_sands": "Recarga  de Energia / Vida%"
                }
              ],
              "weapon_best": {
                "weapon_name": "Espadão do Sacrifício",
                "weapon_url": "https://paimon.moe/images/weapons/sacrificial_greatsword.png",
                "weapon_rarity": 4
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Orgulho Celestial",
                  "weapon_url": "https://paimon.moe/images/weapons/skyward_pride.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Espadão de Favonius",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_greatsword.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Espada Grande de Katsuragi",
                  "weapon_url": "https://paimon.moe/images/weapons/katsuragikiri_nagamasa.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "z5wiq1nMvKw"
            }
        """.trimIndent()
}