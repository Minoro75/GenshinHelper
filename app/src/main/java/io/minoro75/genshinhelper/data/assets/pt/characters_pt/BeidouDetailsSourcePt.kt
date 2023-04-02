package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object BeidouDetailsSourcePt {
    @Language("JSON")
    val details = """
            {
              "name": "Beidou",
              "rarity": 4,
              "element": "electro",
              "weapon": "claymore",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e1/Beidou_Icon.png/revision/latest",
              "talents_books": {
                "book_name": "Ouro",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_Philosophies_of_Gold.png",
                "book_days": "Quarta-feira/Sábado/Domingo"
              },
              "weekly_boss_item": {
                "boss_item_name": "Suspiro do Vento Oriental",
                "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/07/Item_Dvalin%27s_Sigh.png"
              },
              "talents_priority": [
                "Habilidade",
                "Supremo",
                "Ataque"
              ],
              "artifacts": [
                {
                  "artifact_name": "Selo da Insulação",
                  "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Dano Electro",
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
                  "weapon_name": "Akuoumaru",
                  "weapon_url": "https://paimon.moe/images/weapons/akuoumaru.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Espinha Dorsal da Serpente",
                  "weapon_url": "https://paimon.moe/images/weapons/serpent_spine.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Espada Grande de Katsuragi",
                  "weapon_url": "https://paimon.moe/images/weapons/katsuragikiri_nagamasa.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "zSkqP4ooN-g"
            }
        """.trimIndent()
}
