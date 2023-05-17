package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object KavehDetailsSourceRu {
    @Language("JSON")
    val details = """
        {
          "name": "Кавех",
          "rarity": 4,
          "element": "dendro",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1f/Kaveh_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "об Остроумии",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Item_Philosophies_of_Ingenuity.png",
            "book_days": "Вторник/Пятница/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Первозданный цветок оазиса",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e7/Item_Primordial_Greenbloom.png/revision/latest"
          },
          "talents_priority": [
            "Ульта",
            "Атака",
            "Скилл"
          ],
          "artifacts": [
            {
              "artifact_name": "Воспоминания дремучего леса",
              "artifact_url": "https://paimon.moe/images/artifacts/deepwood_memories_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Дендро ДПС",
              "artifact_circlet": "Крит шанс / Крит урон",
              "artifact_sands": "Восстановление энергии"
            }
          ],
          "weapon_best": {
              "weapon_name": "Аквамарин Махайры",
              "weapon_url": "https://paimon.moe/images/weapons/makhaira_aquamarine.png",
              "weapon_rarity": 4
          },
          "weapons_replacements": [
            {
              "weapon_name": "Цветок в латах",
              "weapon_url": "https://paimon.moe/images/weapons/mailed_flower.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Дождерез",
              "weapon_url": "https://paimon.moe/images/weapons/rainslasher.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Регалия леса",
              "weapon_url": "https://paimon.moe/images/weapons/forest_regalia.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "p--hmZxHiHc"
        }
    """.trimIndent()
}