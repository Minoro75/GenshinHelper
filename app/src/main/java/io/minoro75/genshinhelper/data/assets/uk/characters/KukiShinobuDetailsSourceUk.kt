package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object KukiShinobuDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Кукі Шінобу",
          "rarity": 4,
          "element": "electro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/37/Character_Kuki_Shinobu_Thumb.png",
          "talents_books": {
            "book_name": "про Вишуканість",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/6f/Item_Philosophies_of_Elegance.png",
            "book_days": "Вівторок/Пʼятниця/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Сльози згубного бога",
            "boss_item_url": "https://paimon.moe/images/items/tears_of_the_calamitous_god.png"
          },
          "talents_priority": [
            "Навичка",
            "Ульта",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Оздоблені золотом мрії",
              "artifact_url": "https://paimon.moe/images/artifacts/gilded_dreams_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Майстерність стихій",
              "artifact_circlet": "Майстерність стихій",
              "artifact_sands": "Майстерність стихій"
            }
          ],
          "weapon_best": {
             "weapon_name": "Клятва вічнох свободи",
              "weapon_url": "https://paimon.moe/images/weapons/freedom-sworn.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
            "weapon_name": "Нефритовий вир",
            "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_cutter.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Залізне жало",
              "weapon_url": "https://paimon.moe/images/weapons/iron_sting.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Залізне жало",
              "weapon_url": "https://paimon.moe/images/weapons/iron_sting.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "30sXZ7e_MOc"
        }
    """.trimIndent()
}