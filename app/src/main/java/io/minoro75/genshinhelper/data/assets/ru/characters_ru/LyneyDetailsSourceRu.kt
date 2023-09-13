package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object LyneyDetailsSourceRu {
    @Language("JSON")
    val details = """
        {
          "name": "Лини",
          "rarity": 5,
          "element": "pyro",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b2/Lyney_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "о Беспристрастии",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a0/Item_Philosophies_of_Equity.png",
            "book_days": "Понедельник/Четверг/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Первозданный цветок оазиса",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e7/Item_Primordial_Greenbloom.png/revision/latest"
          },
          "talents_priority": [
            "Атака",
            "Навык",
            "Ульта"
          ],
          "artifacts": [
            {
              "artifact_name": "Охотник Сумеречного двора",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8d/Item_Hunter%27s_Brooch.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Пиро ДПС",
              "artifact_circlet": "Крит шанс / Крит урон",
              "artifact_sands": "Сила атаки"
            }
          ],
          "weapon_best": {
            "weapon_name": "Первый великий фокус",
            "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/03/Weapon_The_First_Great_Magic.png/revision/latest",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Аква симулякрум",
            "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Наследник слепящего солнца",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/83/Weapon_Scion_of_the_Blazing_Sun.png/revision/latest",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Прототип: Полумесяц",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_crescent.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "lqH5VKI2PlA"
        }
    """.trimIndent()
}