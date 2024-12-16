package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object ArlecchinoDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Arlecchino",
          "rarity": 5,
          "element": "pyro",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9a/Arlecchino_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "про Порядок",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/32/Item_Philosophies_of_Order.png",
            "book_days": "Середа/Субота/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Тлінна свіча",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e4/Item_Fading_Candle.png/revision/latest"
          },
          "talents_priority": [
            "Атака",
            "Навичка",
            "Ульта"
          ],
          "artifacts": [
            {
              "artifact_name": "Фрагмент милозвучної примхи",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/ff/Item_Harmonious_Symphony_Prelude.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Піро ДПС",
              "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг ",
              "artifact_sands": "Сила Атаки%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Подоба Багряного місяця",
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
              "weapon_name": "Спис дуелі",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Чорногірський спис",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "S5mogRh4rJY"
        }
    """.trimIndent()
}