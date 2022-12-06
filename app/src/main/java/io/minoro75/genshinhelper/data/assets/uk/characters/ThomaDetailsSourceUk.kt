package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object ThomaDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Тома",
          "rarity": 4,
          "element": "pyro",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8a/Character_Thoma_Thumb.png",
          "talents_books": {
            "book_name": "про Швидкоплинність",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/27/Item_Philosophies_of_Transience.png",
            "book_days": "Понеділок/Четвер/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Метелик пекельного вогню",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/16/Item_Hellfire_Butterfly.png"
          },
          "talents_priority": [
            "Навичка",
            "Ульта",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Емблема відрізаної долі",
              "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Здоровʼя% / Піро ДПС",
              "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг / Здоровʼя%",
              "artifact_sands": "Відновлення енергії"
            }
          ],
          "weapon_best": {
            "weapon_name": "Блискавка травокосу",
            "weapon_url": "https://paimon.moe/images/weapons/engulfing_lightning.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Посох Хоми",
              "weapon_url": "https://paimon.moe/images/weapons/staff_of_homa.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Спис Фавонія",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Вилов",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "r-Icv60BxlU"
        }
    """.trimIndent()
}