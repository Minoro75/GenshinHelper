package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object ChevreuseDetailsSourceRu {
    @Language("JSON")
    val details = """
        {
          "name": "Шеврёз",
          "rarity": 4,
          "element": "pyro",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8a/Chevreuse_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "о Порядке",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/32/Item_Philosophies_of_Order.png",
            "book_days": "Среда/Суббота/Воскресенье"
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
              "artifact_name": "Церемония древней знати",
              "artifact_url": "https://paimon.moe/images/artifacts/noblesse_oblige_flower.png ",
              "artifact_amount": 4,
              "artifact_gobelet": "Здоровье%",
              "artifact_circlet": "Здоровье%",
              "artifact_sands": "Здоровье%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Чёрная кисть",
            "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
            "weapon_rarity": 3
          },
          "weapons_replacements": [
            {
              "weapon_name": "Справедливая награда",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8d/Weapon_Rightful_Reward.png/revision/latest",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Копьё Фавония",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
              "weapon_rarity": 4
            },
            {
            "weapon_name": "Чёрная кисть",
            "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
            "weapon_rarity": 3
            }
          ],
         "video_guide": "tSJzHKDukvs"
        }
    """.trimIndent()
}