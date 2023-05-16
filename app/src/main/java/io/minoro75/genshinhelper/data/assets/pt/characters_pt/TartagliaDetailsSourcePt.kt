package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object TartagliaDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Tartaglia",
          "rarity": 5,
          "element": "hydro",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/85/Tartaglia_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Liberdade",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
            "book_days": "Segunda-feira/Quinta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Fragmento de Espada do Rei Demônio",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/48/Item_Shard_of_a_Foul_Legacy.png"
          },
          "talents_priority": [
            "Habilidade",
            "Supremo",
            "Ataque"
          ],
          "artifacts": [
            {
              "artifact_name": "Profundezas do Coração",
              "artifact_url": "https://paimon.moe/images/artifacts/heart_of_depth_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Hydro",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Estrela Invernal",
            "weapon_url": "https://paimon.moe/images/weapons/polar_star.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Agitação Trovejante",
              "weapon_url": "https://paimon.moe/images/weapons/thundering_pulse.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Arco Esmeralda do Caçador",
              "weapon_url": "https://paimon.moe/images/weapons/the_viridescent_hunt.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Arco Quebra-Demônios",
              "weapon_url": "https://paimon.moe/images/weapons/hamayumi.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "XGqIUtxIAgg"
        }
    """.trimIndent()
}