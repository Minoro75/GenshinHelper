package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object NaviaDetailsSourceRu {
    @Language("JSON")
    val details = """
        {
          "name": "Навия",
          "rarity": 5,
          "element": "geo",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c0/Navia_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "о Беспристрастии",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a0/Item_Philosophies_of_Equity.png",
            "book_days": "Понедельник/Четверг/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Тёмная шёлковая нить",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Lightless_Silk_String.png/revision/latest"
          },
          "talents_priority": [
            "Скилл",
            "Атака",
            "Ульта"
          ],
          "artifacts": [
            {
               "artifact_name": "Ночной шёпот",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9f/Item_Selfless_Floral_Accessory.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Гео ДПС",
              "artifact_circlet": "Крит шанс / Крит урон ",
              "artifact_sands": "Сила атаки"
            }
          ],
          "weapon_best": {
            "weapon_name": "Вердикт",
            "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1d/Weapon_Verdict.png/revision/latest",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Некованый",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Weapon_The_Unforged.png/revision/latest",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Меч драконьей кости",
              "weapon_url": "https://paimon.moe/images/weapons/serpent_spine.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Тень волны",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/69/Weapon_Tidal_Shadow.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "v-Bw6XEYmuQ"
        }
    """.trimIndent()
}