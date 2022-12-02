package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object QiqiDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Ци Ци",
          "rarity": 5,
          "element": "cryo",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d5/Character_Qiqi_Thumb.png",
          "talents_books": {
            "book_name": "о Процветании",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bd/Item_Philosophies_of_Prosperity.png",
            "book_days": "Понедельник/Четверг/Воскресенье"
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
              "artifact_name": "Стойкость Миллелита",
              "artifact_url": "https://paimon.moe/images/artifacts/tenacity_of_the_millelith_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Сила атаки",
              "artifact_circlet": "Бонус исцеления / Сила атаки",
              "artifact_sands": "Восстановление энергии / Сила атаки"
            }
          ],
          "weapon_best": {
            "weapon_name": "Небесный меч",
            "weapon_url": "https://paimon.moe/images/weapons/skyward_blade.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Меч Сокола",
              "weapon_url": "https://paimon.moe/images/weapons/aquila_favonia.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Церемониальный меч",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Меч Фавония",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_sword.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "3OgQj9UAHyk"
        }
    """.trimIndent()
}