package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object ChongyunDetailsSourcePt {
    @Language("JSON")
    val details = """
            {
              "name": "Chongyun",
              "rarity": 4,
              "element": "cryo",
              "weapon": "claymore",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/35/Chongyun_Icon.png/revision/latest",
              "talents_books": {
                "book_name": "Esforço",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
                "book_days": "Terça-feira/Sexta-feira/Domingo"
              },
              "weekly_boss_item": {
                "boss_item_name": "Suspiro do Vento Oriental",
                "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/07/Item_Dvalin%27s_Sigh.png"
              },
              "talents_priority": [
                "Ataque",
                "Habilidade",
                "Supremo"
              ],
              "artifacts": [
                {
                  "artifact_name": "Selo da Insulação",
                  "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Dano Cryo",
                  "artifact_circlet": "Taxa Crítica / Dano Crítico",
                  "artifact_sands": "ATQ% / Recarga de Energia"
                }
              ],
              "weapon_best": {
                "weapon_name": "Túmulo do Lobo",
                "weapon_url": "https://paimon.moe/images/weapons/wolfs_gravestone.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Orgulho Celestial",
                  "weapon_url": "https://paimon.moe/images/weapons/skyward_pride.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Espadão do Sacrifício",
                  "weapon_url": "https://paimon.moe/images/weapons/sacrificial_greatsword.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Protótipo Arcaico",
                  "weapon_url": "https://paimon.moe/images/weapons/prototype_archaic.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "3gjAQ_VaBi0"
            }
        """.trimIndent()
}
