package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object KiraraDetailSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Кірара",
          "rarity": 4,
          "element": "dendro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b6/Kirara_Icon.png/revision/latest?cb=20230524073946",
          "talents_books": {
           "book_name": "про Швидкоплинність",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/27/Item_Philosophies_of_Transience.png",
            "book_days": "Понеділок/Четвер/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Вічний бурштин",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/26/Item_Everamber.png/revision/latest"
          },
          "talents_priority": [
            "Навичка",
            "Ульта",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Спогади хащі",
              "artifact_url": "https://paimon.moe/images/artifacts/deepwood_memories_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Здоровʼя% / Дендро ДПС",
              "artifact_circlet": "Здоровʼя% / Кріт. Шанс / Кріт. Дамаг",
              "artifact_sands": "Здоровʼя% / Майстерність стихій"
            }
          ],
          "weapon_best": {
                "weapon_name": "Ключ Хадж-Нісута",
              "weapon_url": "https://paimon.moe/images/weapons/key_of_khaj-nisut.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
             "weapon_name": "Меч Фавонія",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Меч жертовного ритуалу",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Меч Фавонія",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_sword.png",
              "weapon_rarity": 4
            }
          ],
         "video_guide": "Xj63uBhiQhY"
        }
    """.trimIndent()
}