package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object ZhongliDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Чжун Ли",
          "rarity": 5,
          "element": "geo",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Character_Zhongli_Thumb.png",
          "talents_books": {
            "book_name": "о Золоте",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_Philosophies_of_Gold.png",
            "book_days": "Среда/Суббота/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Рог небесного кита",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1c/Item_Tusk_of_Monoceros_Caeli.png"
          },
          "talents_priority": [
            "Скилл",
            "Ульта",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Стойкость Миллелита",
              "artifact_url": "https://paimon.moe/images/artifacts/tenacity_of_the_millelith_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Здоровье",
              "artifact_circlet": "Здоровье",
              "artifact_sands": "Здоровье"
            }
          ],
          "weapon_best": {
            "weapon_name": "Чёрная кисть",
            "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
            "weapon_rarity": 3
          },
          "weapons_replacements": [
            {
              "weapon_name": "Посох Хомы",
              "weapon_url": "https://paimon.moe/images/weapons/staff_of_homa.png",
              "weapon_rarity": 5
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
          "video_guide": "oXEPKa6i5lU"
        }
    """.trimIndent()
}