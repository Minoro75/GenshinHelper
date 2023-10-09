package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object NeuviletteDetailsSourceRu {
    @Language("JSON")
    val details = """
        {
          "name": "Нёвиллет",
          "rarity": 5,
          "element": "hydro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/21/Neuvillette_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "о Беспристрастии",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a0/Item_Philosophies_of_Equity.png",
            "book_days": "Понедельник/Четверг/Воскресенье"
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
              "artifact_gobelet": "Гидро ДПС / Здоровье%",
              "artifact_circlet": "Крит шанс / Крит урон",
              "artifact_sands": "Здоровье%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Обряд вечного течения",
            "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/91/Weapon_Tome_of_the_Eternal_Flow.png/revision/latest",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
            "weapon_name": "Молитва святым ветрам",
            "weapon_url": "https://paimon.moe/images/weapons/lost_prayer_to_the_sacred_winds.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Песнь странника",
              "weapon_url": "https://paimon.moe/images/weapons/the_widsith.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Прототип: Янтарь",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_amber.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "eTydn3C4ZT4"
        }
    """.trimIndent()
}