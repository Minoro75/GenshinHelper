package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object WandererDetailsSourceRu {
    @Language("JSON")
    val detailsRu = """
        {
          "name": "Странник",
          "rarity": 5,
          "element": "anemo",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f8/Wanderer_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "о Честности",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/82/Item_Philosophies_of_Praxis.png",
            "book_days": "Среда/Суббота/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Пустой колокольчик",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a2/Item_Daka%27s_Bell.png"
          },
          "talents_priority": [
            "Атака",
            "Скилл",
            "Ульта"
          ],
          "artifacts": [
            {
              "artifact_name": "Хроники Чертогов в пустыне",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_The_First_Days_of_the_City_of_Kings.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Анемо ДПС",
              "artifact_circlet": "Крит Шанс / Крит урон ",
              "artifact_sands": "Сила атаки%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Воспоминания Тулайтуллы",
            "weapon_url": "https://paimon.moe/images/weapons/tulaytullahs_remembrance.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Небесный атлас",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Песнь странника",
              "weapon_url": "https://paimon.moe/images/weapons/the_widsith.png",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Морской атлас",
              "weapon_url": "https://paimon.moe/images/weapons/mappa_mare.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "pj3R0DMiTOk"
        }
    """.trimIndent()
}