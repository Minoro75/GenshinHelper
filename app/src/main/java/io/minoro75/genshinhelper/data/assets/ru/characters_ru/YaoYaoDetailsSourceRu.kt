package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object YaoYaoDetailsSourceRu {
    @Language("JSON")
    val details = """
        {
          "name": "Яо Яо",
          "rarity": 5,
          "element": "dendro",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/83/Yaoyao_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "об Усердии",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
            "book_days": "Вторник/Пятница/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Пустой колокольчик",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a2/Item_Daka%27s_Bell.png"
          },
          "talents_priority": [
            "Скилл",
            "Ульта",
            "Атака"
          ],
          "artifacts": [
             {
                  "artifact_name": "Воспоминания дремучего леса",
                  "artifact_url": "https://paimon.moe/images/artifacts/deepwood_memories_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Здоровье",
                  "artifact_circlet": "Бонус Лечения",
                  "artifact_sands": "Восстановление Энергии"
                }
          ],
          "weapon_best": {
                  "weapon_name": "Копьё Фавония",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
                  "weapon_rarity": 4
           },
          "weapons_replacements": [
            {
              "weapon_name": "Небесная ось",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_spine.png",
              "weapon_rarity": 5
            },
            {
             "weapon_name": "Чёрное копье",
             "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
             "weapon_rarity": 3
             
            },
            {
              "weapon_name": "Крест-копьё Китаин",
              "weapon_url": "https://paimon.moe/images/weapons/kitain_cross_spear.pngÏ",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "csF-d57-Kks"
        }
    """.trimIndent()
}