package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object CharlotteDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Шарлотта",
          "rarity": 4,
          "element": "cryo",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d2/Charlotte_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "про Справедливість",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/37/Item_Philosophies_of_Justice.png",
            "book_days": "Вівторок/Пʼятниця/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Безпросвітна шовкова нить",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Lightless_Silk_String.png/revision/latest"
          },
          "talents_priority": [
            "Скілл",
            "Ульта",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Золота трупа",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/4d/Item_Golden_Song%27s_Variation.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Сила атаки / Кріо ДПС",
              "artifact_circlet": "Кріт урон",
              "artifact_sands": "Сила атаки"
            }
          ],
          "weapon_best": {
              "weapon_name": "Істина Кагура",
            "weapon_url": "https://paimon.moe/images/weapons/kaguras_verity.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Небесний атлас",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Плин непорочних вод",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Weapon_Flowing_Purity.png/revision/latest",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Плин непорочних вод",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Weapon_Flowing_Purity.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
         "video_guide": "choNlHs5jfw"
        }
    """.trimIndent()
}