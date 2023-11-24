package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object WriothesleyDetailSourceRu {
    @Language("JSON")
    val details = """
        {
          "name": "Ризли",
          "rarity": 5,
          "element": "cryo",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bb/Wriothesley_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "о Порядке",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/32/Item_Philosophies_of_Order.png",
            "book_days": "Среда/Суббота/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Вечный янтарь",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/26/Item_Everamber.png/revision/latest"
          },
          "talents_priority": [
            "Атака",
            "Скилл",
            "Ульта"
          ],
          "artifacts": [
            {
              "artifact_name": "Охотник Сумеречного двора",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8d/Item_Hunter%27s_Brooch.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Крио ДПС",
              "artifact_circlet": "Крит шанс / Крит урон",
              "artifact_sands": "Сила атаки"
            }
          ],
          "weapon_best": {
              "weapon_name": "Казначейский надзор",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f2/Weapon_Cashflow_Supervision.png/revision/latest",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
             "weapon_name": "Воспоминания Тулайтуллы",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/fc/Weapon_Tulaytullah%27s_Remembrance.png/revision/latest",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Песнь странника",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f0/Weapon_The_Widsith.png/revision/latest",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Сверкание чистых вод",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Weapon_Flowing_Purity.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
         "video_guide": "4Kpj2-8KAGQ"
        }
    """.trimIndent()
}