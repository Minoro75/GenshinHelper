package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object LaylaDetailsSourceRu {
    @Language("JSON")
    val details = """
        {
          "name": "Лайла",
          "rarity": 4,
          "element": "cryo",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/genshin-impact/images/c/cd/%D0%9F%D0%B5%D1%80%D1%81%D0%BE%D0%BD%D0%B0%D0%B6_%D0%9B%D0%B0%D0%B9%D0%BB%D0%B0_%D0%98%D0%BA%D0%BE%D0%BD%D0%BA%D0%B0.png/revision/latest?cb=20221102060014&path-prefix=ru",
          "talents_books": {
            "book_name": "об Остроумии",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Item_Philosophies_of_Ingenuity.png",
            "book_days": "Вторник/Пятница/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Зеркало Мусин",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/ee/Item_Mirror_of_Mushin.png"
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
              "artifact_gobelet": "Крио ДПС / Здоровье",
              "artifact_circlet": "Крит шанс /Крит урон / Здоровье",
              "artifact_sands": "Здоровье"
            }
          ],
          "weapon_best": {
             "weapon_name": "Ключ Хадж-нисут",
              "weapon_url": "https://paimon.moe/images/weapons/key_of_khaj-nisut.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Меч Фавония",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Небесный меч",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_blade.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Меч Фавония",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_sword.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "DU5zUuzNn5I"
        }
    """.trimIndent()
}