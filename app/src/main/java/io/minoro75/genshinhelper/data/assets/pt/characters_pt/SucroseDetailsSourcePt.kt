package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object SucroseDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Sucrose",
          "rarity": 4,
          "element": "anemo",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0e/Sucrose_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Liberdade",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
            "book_days": "Segunda-feira/Quinta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Alma do Vento do Norte",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/81/Item_Spirit_Locket_of_Boreas.png"
          },
          "talents_priority": [
            "Habilidade",
            "Supremo",
            "Ataque"
          ],
          "artifacts": [
            {
              "artifact_name": "Sombra Verde",
              "artifact_url": "https://paimon.moe/images/artifacts/viridescent_venerer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Anemo / Proficiência Elemental",
              "artifact_circlet": "Taxa Crítica / Proficiência Elemental",
              "artifact_sands": "ATQ% / Proficiência Elemental"
            }
          ],
          "weapon_best": {
            "weapon_name": "Memórias de Sacrifício",
            "weapon_url": "https://paimon.moe/images/weapons/sacrificial_fragments.png",
            "weapon_rarity": 4
          },
          "weapons_replacements": [
            {
              "weapon_name": "Histórias Extraordinárias de Caçadores de Dragões",
              "weapon_url": "https://paimon.moe/images/weapons/thrilling_tales_of_dragon_slayers.png",
              "weapon_rarity": 3
            },
            {
              "weapon_name": "Anel de Hakushin",
              "weapon_url": "https://paimon.moe/images/weapons/hakushin_ring.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Mappa Mare",
              "weapon_url": "https://paimon.moe/images/weapons/mappa_mare.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "1_3DOEw_Xno"
        }
    """.trimIndent()
}