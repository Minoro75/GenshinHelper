package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object YaoYaoDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Яо Яо",
          "rarity": 5,
          "element": "dendro",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/83/Yaoyao_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "про Старанність",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
            "book_days": "Вівторок/Пʼятниця/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Пустий дзвоник",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a2/Item_Daka%27s_Bell.png"
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
              "artifact_gobelet": "Здоровʼя",
              "artifact_circlet": "Бонус хілінгу",
              "artifact_sands": "Відновлення Енергії"
             }
          ],
          "weapon_best": {
                  "weapon_name": "Спис Фавонія",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
                  "weapon_rarity": 4
           },
          "weapons_replacements": [
            {
              "weapon_name": "Небесний хребет",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_spine.png",
              "weapon_rarity": 5
            },
            {
             "weapon_name": "Чорна китиця",
             "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
             "weapon_rarity": 3
             
            },
            {
              "weapon_name": "Хрест-спис Кітаїн",
              "weapon_url": "https://paimon.moe/images/weapons/kitain_cross_spear.pngÏ",
              "weapon_rarity": 4
            }
          ],
          "video_guide": null
        }
    """.trimIndent()
}