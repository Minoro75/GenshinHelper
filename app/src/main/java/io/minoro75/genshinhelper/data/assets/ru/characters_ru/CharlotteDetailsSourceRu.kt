package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object CharlotteDetailsSourceRu {
    @Language("JSON")
    val details = """
        {
          "name": "Шарлотта",
          "rarity": 4,
          "element": "cryo",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d2/Charlotte_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "о Справедливости",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/37/Item_Philosophies_of_Justice.png",
            "book_days": "Вторник/Пятница/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Тёмная шёлковая нить",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Lightless_Silk_String.png/revision/latest"
          },
          "talents_priority": [
            "Скилл",
            "Ульта",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Золотая труппа",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/4d/Item_Golden_Song%27s_Variation.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Сила атаки / Крио ДПС",
              "artifact_circlet": "Крит урон",
              "artifact_sands": "Сила атаки"
            }
          ],
          "weapon_best": {
              "weapon_name": "Истина кагура",
            "weapon_url": "https://paimon.moe/images/weapons/kaguras_verity.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Небесный атлас",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Сверкание чистых вод",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Weapon_Flowing_Purity.png/revision/latest",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Сверкание чистых вод",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Weapon_Flowing_Purity.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
         "video_guide": "PyteMFdqSkI"
        }
    """.trimIndent()
}