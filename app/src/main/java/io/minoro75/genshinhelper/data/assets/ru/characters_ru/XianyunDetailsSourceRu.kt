package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object XianyunDetailsSourceRu {
    @Language("JSON")
    val details = """
        {
          "name": "Сянь Юнь",
          "rarity": 5,
          "element": "anemo",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d3/Xianyun_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "о Золоте",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_Philosophies_of_Gold.png",
            "book_days": "Среда/Суббота/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Тёмная шёлковая нить",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Lightless_Silk_String.png/revision/latest"
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
              "artifact_gobelet": "Восстановление энергии / ДПС%",
              "artifact_circlet": "ДПС%",
              "artifact_sands": "ДПС%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Звонкий клич журавля",
            "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/61/Weapon_Crane%27s_Echoing_Call.png/revision/latest",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Небесный атлас",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Око клятвы",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/af/Weapon_Oathsworn_Eye.png/revision/latest",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Эпос о драконоборцах",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/19/Weapon_Thrilling_Tales_of_Dragon_Slayers.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "tV_ZhHm5lMQ"
        }
    """.trimIndent()
}