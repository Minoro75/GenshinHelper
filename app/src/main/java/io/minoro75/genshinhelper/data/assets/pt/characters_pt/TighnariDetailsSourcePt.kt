package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object TighnariDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Tighnari",
          "rarity": 5,
          "element": "dendro",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/87/Tighnari_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Admoestação",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9b/Item_Philosophies_of_Admonition.png",
            "book_days": "Segunda-feira/Quinta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Significado de Éons",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c9/Item_The_Meaning_of_Aeons.png"
          },
          "talents_priority": [
            "Ataque",
            "Supremo",
            "Habilidade"
          ],
          "artifacts": [
            {
              "artifact_name": "Memórias da Floresta",
              "artifact_url": "https://paimon.moe/images/artifacts/deepwood_memories_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Dendro",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ% / Proficiência Elemental"
            }
          ],
          "weapon_best": {
            "weapon_name": "Caminho do Caçador",
            "weapon_url": "https://paimon.moe/images/weapons/hunters_path.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Aqua Simulacra",
              "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Arco Esmeralda do Caçador",
              "weapon_url": "https://paimon.moe/images/weapons/the_viridescent_hunt.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Protótipo",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_crescent.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "iOa62xFfVx0"
        }
    """.trimIndent()
}