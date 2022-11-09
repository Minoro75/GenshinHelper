package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object GorouDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Gorou",
          "rarity": 4,
          "element": "geo",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/56/Character_Gorou_Thumb.png",
          "talents_books": {
            "book_name": "Light",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/95/Item_Philosophies_of_Light.png",
            "book_days": "WED/SAT/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Molten Moment",
            "boss_item_url": "https://paimon.moe/images/items/molten_moment.png"
          },
          "talents_priority": [
            "Skill",
            "Burst",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Husk of Opulent Dreams",
              "artifact_url": "https://paimon.moe/images/artifacts/husk_of_opulent_dreams_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "DEF%",
              "artifact_circlet": "DEF%",
              "artifact_sands": "DEF% / Energy Recharge"
            }
          ],
          "weapon_best": {
            "weapon_name": "Elegy for the End",
            "weapon_url": "https://paimon.moe/images/weapons/elegy_for_the_end.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Aqua Simulacra",
              "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Favonius Warbow",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_warbow.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Sacrificial Bow",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_bow.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Горо",
          "rarity": 4,
          "element": "geo",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/56/Character_Gorou_Thumb.png",
          "talents_books": {
            "book_name": "об Свете",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/95/Item_Philosophies_of_Light.png",
            "book_days": "Среда/Суббота/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Расплавленный миг",
            "boss_item_url": "https://paimon.moe/images/items/molten_moment.png"
          },
          "talents_priority": [
            "Скилл",
            "Ульта",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Кокон сладких грёз",
              "artifact_url": "https://paimon.moe/images/artifacts/husk_of_opulent_dreams_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Защита",
              "artifact_circlet": "Защита",
              "artifact_sands": "Защита / Восстановление энергии"
            }
          ],
          "weapon_best": {
            "weapon_name": "Элегия погибели",
            "weapon_url": "https://paimon.moe/images/weapons/elegy_for_the_end.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Аква симулякрум",
              "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Боевой лук Фавония",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_warbow.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Церемониальный лук",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_bow.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}
