package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object NingguangDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Ningguang",
          "rarity": 4,
          "element": "geo",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e0/Ningguang_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Prosperidade",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bd/Item_Philosophies_of_Prosperity.png",
            "book_days": "Segunda-feira/Quinta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Alma do Vento do Norte",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/81/Item_Spirit_Locket_of_Boreas.png"
          },
          "talents_priority": [
            "Ataque",
            "Supremo",
            "Habilidade"
          ],
          "artifacts": [
            {
              "artifact_name": "Pedra Arcaica",
              "artifact_url": "https://paimon.moe/images/artifacts/archaic_petra_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Dano Geo",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ%"
            },
            {
              "artifact_name": "Último Juramento do Gladiador",
              "artifact_url": "https://paimon.moe/images/artifacts/gladiators_finale_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Dano Geo",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Oração Perdida aos Ventos Sagrados",
            "weapon_url": "https://paimon.moe/images/weapons/lost_prayer_to_the_sacred_winds.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Atlas Celestial",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Pérola Solar",
              "weapon_url": "https://paimon.moe/images/weapons/solar_pearl.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Mappa Mare",
              "weapon_url": "https://paimon.moe/images/weapons/mappa_mare.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "7Nh_4L9lvhw"
        }
    """.trimIndent()
}