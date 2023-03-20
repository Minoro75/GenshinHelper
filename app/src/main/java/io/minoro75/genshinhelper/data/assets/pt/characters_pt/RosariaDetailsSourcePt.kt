package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object RosariaDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Rosaria",
          "rarity": 4,
          "element": "cryo",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/35/Rosaria_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Poemas",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7e/Item_Philosophies_of_Ballad.png",
            "book_days": "Quarta-feira/Sábado/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Sombra do Guerreiro",
            "boss_item_url": "https://paimon.moe/images/items/shadow_of_the_warrior.png"
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
              "artifact_gobelet": "Dano Cryo",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Lança de Jade Primitiva",
            "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_winged-spear.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Espinha Celestial",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_spine.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Lança de Favonius",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Lança de Favonius",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "piArNdgUuV4"
        }
    """.trimIndent()
}