package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object ColleiDetailsSourcePt {
    @Language("JSON")
    val details = """
            {
              "name": "Collei",
              "rarity": 4,
              "element": "dendro",
              "weapon": "bow",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a2/Collei_Icon.png/revision/latest",
              "talents_books": {
                "book_name": "Práxis",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/82/Item_Philosophies_of_Praxis.png",
                "book_days": "Quarta-feira/Sábado/Domingo"
              },
              "weekly_boss_item": {
                "boss_item_name": "Lágrima da Deusa do Desastre",
                "boss_item_url": "https://paimon.moe/images/items/tears_of_the_calamitous_god.png"
              },
              "talents_priority": [
                "Supremo",
                "Habilidade",
                "Ataque"
              ],
              "artifacts": [
                {
                  "artifact_name": "Memórias da Floresta",
                  "artifact_url": "https://paimon.moe/images/artifacts/deepwood_memories_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Dano Dendro",
                  "artifact_circlet": "Taxa Crítica / Dano Crítico",
                  "artifact_sands": "Recarga  de Energia / ATQ%"
                }
              ],
              "weapon_best": {
                "weapon_name": "Estrela Invernal",
                "weapon_url": "https://paimon.moe/images/weapons/polar_star.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Elegia do Suspiro Final",
                  "weapon_url": "https://paimon.moe/images/weapons/elegy_for_the_end.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Aqua Simulacra",
                  "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Arco Favonius",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_warbow.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "LtTP_ggf1QY"
            }
        """.trimIndent()
}
