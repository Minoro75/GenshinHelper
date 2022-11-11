package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object VentiDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Венти",
          "rarity": 5,
          "element": "anemo",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8d/Character_Venti_Thumb.png",
          "talents_books": {
            "book_name": "о Балладах",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7e/Item_Philosophies_of_Ballad.png",
            "book_days": "Среда/Суббота/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Хвост Борея",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/66/Item_Tail_of_Boreas.png"
          },
          "talents_priority": [
            "Ульта",
            "Скилл",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Изумрудная тень",
              "artifact_url": "https://paimon.moe/images/artifacts/viridescent_venerer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Анемо ДПС",
              "artifact_circlet": "Крит шанс / Крит урон ",
              "artifact_sands": "Сила атаки"
            }
          ],
          "weapon_best": {
            "weapon_name": "Аква симулякрум",
            "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Элегия погибели",
              "weapon_url": "https://paimon.moe/images/weapons/elegy_for_the_end.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Бесструнный",
              "weapon_url": "https://paimon.moe/images/weapons/the_stringless.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Боевой лук Фавония",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_warbow.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}