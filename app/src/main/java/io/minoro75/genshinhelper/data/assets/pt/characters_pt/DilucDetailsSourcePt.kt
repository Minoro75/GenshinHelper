package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object DilucDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Diluc",
          "rarity": 5,
          "element": "pyro",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/3d/Diluc_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Resistência",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0b/Item_Philosophies_of_Resistance.png",
            "book_days": "Terça-feira/Sexta-feira/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Plumas do Vento Oriental",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bf/Item_Dvalin%27s_Plume.png"
          },
          "talents_priority": [
            "Habilidade",
            "Ataque",
            "Supremo"
          ],
          "artifacts": [
            {
              "artifact_name": "A Bruxa das Chamas Carmesim",
              "artifact_url": "https://paimon.moe/images/artifacts/crimson_witch_of_flames_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dano Pyro",
              "artifact_circlet": "Taxa Crítica / Dano Crítico",
              "artifact_sands": "ATQ% / Proficiência Elemental"
            }
          ],
          "weapon_best": {
            "weapon_name": "Túmulo do Lobo",
            "weapon_url": "https://paimon.moe/images/weapons/wolfs_gravestone.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Orgulho Celestial",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_pride.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Espinha Dorsal da Serpente",
              "weapon_url": "https://paimon.moe/images/weapons/serpent_spine.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Protótipo Arcaico",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_archaic.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "vwjJqhaXKoc"
        }
    """.trimIndent()
}
