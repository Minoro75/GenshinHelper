package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object LisaDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Lisa",
          "rarity": 4,
          "element": "electro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/65/Lisa_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Poemas",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7e/Item_Philosophies_of_Ballad.png",
            "book_days": "Quarta-feira/Sábado/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Garra do Vento Oriental",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a8/Item_Dvalin%27s_Claw.png"
          },
          "talents_priority": [
            "Supremo",
            "Habilidade",
            "Ataque"
          ],
          "artifacts": [
            {
              "artifact_name": "Trovão Furioso",
              "artifact_url": "https://paimon.moe/images/artifacts/thundering_fury_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Dano Electro",
              "artifact_circlet": "Taxa  Crítica / Dano Crítico",
              "artifact_sands": "ATQ%"
            },
            {
              "artifact_name": "Antigo Ritual Real",
              "artifact_url": "https://paimon.moe/images/artifacts/noblesse_oblige_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Dano Electro",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ%"
            }
          ],
          "weapon_best": {
             "weapon_name": "Prova de Kagura",
              "weapon_url": "https://paimon.moe/images/weapons/kaguras_verity.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Atlas Celestial",
            "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Sinfonia dos Indolentes",
              "weapon_url": "https://paimon.moe/images/weapons/the_widsith.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Anel de Hakushin",
              "weapon_url": "https://paimon.moe/images/weapons/hakushin_ring.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "3U3djxTKqAg"
        }
    """.trimIndent()
}