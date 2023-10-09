package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object NeuviletteDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Невілет",
          "rarity": 5,
          "element": "hydro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/21/Neuvillette_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "про Неупередженість",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a0/Item_Philosophies_of_Equity.png",
            "book_days": "Понеділок/Четвер/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Вічний бурштин",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/26/Item_Everamber.png/revision/latest"
          },
          "talents_priority": [
            "Атака",
            "Навичка",
            "Ульта"
          ],
          "artifacts": [
            {
              "artifact_name": "Фантомний мисливець",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8d/Item_Hunter%27s_Brooch.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Гідро ДПС / Здоровʼя%",
              "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг",
              "artifact_sands": "Здоровʼя%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Фоліант вічних потоків",
            "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/91/Weapon_Tome_of_the_Eternal_Flow.png/revision/latest",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
            "weapon_name": "Рукописи Чотирьох Вітрів",
            "weapon_url": "https://paimon.moe/images/weapons/lost_prayer_to_the_sacred_winds.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Мандрівна симфонія",
              "weapon_url": "https://paimon.moe/images/weapons/the_widsith.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Прототип золотого бурштину",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_amber.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "zfUlbWVkQVk"
        }
    """.trimIndent()
}