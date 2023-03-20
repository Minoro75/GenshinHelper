package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object FischlDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Fischl",
          "rarity": 4,
          "element": "electro",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9a/Fischl_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Poemas",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7e/Item_Philosophies_of_Ballad.png",
            "book_days": "Quarta-feira/Sábado/Domingo"
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
              "artifact_name": "Último Juramento do Gladiador",
              "artifact_url": "https://paimon.moe/images/artifacts/gladiators_finale_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Dano Electro",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ% / Proficiência Elemental"
            },
            {
              "artifact_name": "Trovão Furioso",
              "artifact_url": "https://paimon.moe/images/artifacts/thundering_fury_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Dano Electro",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ% / Proficiência Elemental"
            }
          ],
          "weapon_best": {
            "weapon_name": "Harpa Celestial",
            "weapon_url": "https://paimon.moe/images/weapons/skyward_harp.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Último Acorde",
              "weapon_url": "https://paimon.moe/images/weapons/the_stringless.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Crepúsculo Desvanecido",
              "weapon_url": "https://paimon.moe/images/weapons/fading_twilight.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Arco Quebra-Demônios",
              "weapon_url": "https://paimon.moe/images/weapons/hamayumi.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "P8U5S3CwWLI"
        }
    """.trimIndent()
}
