package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object WriothesleyDetailSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Різлі",
          "rarity": 5,
          "element": "cryo",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bb/Wriothesley_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "про Порядок",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/32/Item_Philosophies_of_Order.png",
            "book_days": "Середа/Субота/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Вічний бурштин",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/26/Item_Everamber.png/revision/latest"
          },
          "talents_priority": [
            "Атака",
            "Навичка",
            "Ульта"
          ],
          "artifacts": [
            {
              "artifact_name": "Фантомний мисливець",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8d/Item_Hunter%27s_Brooch.png/revision/latest",
              "artifact_amount": 4,
             "artifact_gobelet": "Кріо ДПС",
              "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг ",
              "artifact_sands": "Сила Атаки"
            }
          ],
          "weapon_best": {
              "weapon_name": "Обліковець доходів та витрат",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f2/Weapon_Cashflow_Supervision.png/revision/latest",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
             "weapon_name": "Спогади Тулайтуллы",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/fc/Weapon_Tulaytullah%27s_Remembrance.png/revision/latest",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Мандрівна симфонія",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f0/Weapon_The_Widsith.png/revision/latest",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Плин непорочних вод",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Weapon_Flowing_Purity.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
         "video_guide": "dDjXCYFHElc"
        }
    """.trimIndent()
}