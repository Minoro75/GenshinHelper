package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object ArlecchinoDetailsSourceRu {
    @Language("JSON")
    val details = """
        {
          "name": "Arlecchino",
          "rarity": 5,
          "element": "pyro",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9a/Arlecchino_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "о Порядке",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/32/Item_Philosophies_of_Order.png",
            "book_days": "Среда/Суббота/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Угасающая свеча",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e4/Item_Fading_Candle.png/revision/latest"
          },
          "talents_priority": [
            "Атака",
            "Скилл",
            "Ульта"
          ],
          "artifacts": [
            {
              "artifact_name": "Фрагмент гармонической фантазии",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/ff/Item_Harmonious_Symphony_Prelude.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Пиро ДПС",
              "artifact_circlet": "Крит шанс / Крит урон",
              "artifact_sands": "Сила атаки"
            }
          ],
          "weapon_best": {
            "weapon_name": "Очертания алой луны",
            "weapon_url": "https://paimon.moe/images/weapons/engulfing_lightning.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Посох Хома",
              "weapon_url": "https://paimon.moe/images/weapons/staff_of_homa.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Смертельный бой",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Черногорская пика",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "1Eg2icYqVsg"
        }
    """.trimIndent()
}