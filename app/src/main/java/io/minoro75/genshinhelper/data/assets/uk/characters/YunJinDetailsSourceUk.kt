package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object YunJinDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Юнь Дзінь",
          "rarity": 4,
          "element": "geo",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/cb/Character_Yun_Jin_Thumb.png",
          "talents_books": {
            "book_name": "про Старанність",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
            "book_days": "Вівторок/Пʼятниця/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Серце попелу",
            "boss_item_url": "https://paimon.moe/images/items/ashen_heart.png"
          },
          "talents_priority": [
            "Ульта",
            "Навичка",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Пробудження від сну",
              "artifact_url": "https://paimon.moe/images/artifacts/husk_of_opulent_dreams_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Захист",
              "artifact_circlet": "Захист / Кріт. Шанс",
              "artifact_sands": "Захист / Відновлення енергії"
            }
          ],
          "weapon_best": {
            "weapon_name": "Блискавка травокосу",
            "weapon_url": "https://paimon.moe/images/weapons/engulfing_lightning.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Спис Фавонія",
            "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
            "weapon_rarity": 4
            },
            {
              "weapon_name": "Вилов",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Прототип: Півмісяць",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_starglitter.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "SCxNTYac1RU"
        }
    """.trimIndent()
}