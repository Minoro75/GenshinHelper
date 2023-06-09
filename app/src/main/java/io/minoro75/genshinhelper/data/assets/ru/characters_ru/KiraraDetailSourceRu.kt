package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object KiraraDetailSourceRu {
    @Language("JSON")
    val details = """
        {
          "name": "Кирара",
          "rarity": 4,
          "element": "dendro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b6/Kirara_Icon.png/revision/latest?cb=20230524073946",
          "talents_books": {
            "book_name": "о Бренности",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/27/Item_Philosophies_of_Transience.png",
            "book_days": "Понедельник/Четверг/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Вечный янтарь",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/26/Item_Everamber.png/revision/latest"
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
              "artifact_gobelet": "Здоровье% / Дендро ДПС",
              "artifact_circlet": "Здоровье% / Крит шанс / Крит урон",
              "artifact_sands": "Здоровье% / Мастерство стихий"
            }
          ],
          "weapon_best": {
                "weapon_name": "Ключ Хадж-нисут",
              "weapon_url": "https://paimon.moe/images/weapons/key_of_khaj-nisut.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
             "weapon_name": "Меч Фавония",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Церемониальный меч",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Меч Фавония",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_sword.png",
              "weapon_rarity": 4
            }
          ],
         "video_guide": "lo1zeg-lfbM"
        }
    """.trimIndent()
}