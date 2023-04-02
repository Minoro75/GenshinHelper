package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object QiqiDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Qiqi",
          "rarity": 5,
          "element": "cryo",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b3/Qiqi_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Prosperidade",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bd/Item_Philosophies_of_Prosperity.png",
            "book_days": "Segunda-feira/Quinta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Cauda do Vento do Norte",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/66/Item_Tail_of_Boreas.png"
          },
          "talents_priority": [
            "Supremo",
            "Habilidade",
            "Ataque"
          ],
          "artifacts": [
            {
              "artifact_name": "Millelith Firmes",
              "artifact_url": "https://paimon.moe/images/artifacts/tenacity_of_the_millelith_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "ATQ%",
              "artifact_circlet": "Bônus de Cura / ATQ%",
              "artifact_sands": "Recarga  de Energia / ATQ%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Espada Celestial",
            "weapon_url": "https://paimon.moe/images/weapons/skyward_blade.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Falcão",
              "weapon_url": "https://paimon.moe/images/weapons/aquila_favonia.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Espada do Sacrifício",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Espada de Favonius",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_sword.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "8kovcsFvg1o"
        }
    """.trimIndent()
}