package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object KavehDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Кавех",
          "rarity": 4,
          "element": "dendro",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1f/Kaveh_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "про Винахідливість",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Item_Philosophies_of_Ingenuity.png",
            "book_days": "Вівторок/Пʼятниця/Неділя"
          },
            "weekly_boss_item": {
            "boss_item_name": "Зелений первоцвіт",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e7/Item_Primordial_Greenbloom.png/revision/latest"
          },
          "talents_priority": [
            "Ульта",
            "Атака",
            "Навичка"
          ],
          "artifacts": [
            {
               "artifact_name": "Спогади хащі",
              "artifact_url": "https://paimon.moe/images/artifacts/deepwood_memories_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Дендро ДПС",
              "artifact_circlet": "Кріт шанс / Кріт дамаг",
              "artifact_sands": "Відновлення енергії"
            }
          ],
          "weapon_best": {
              "weapon_name": "Аквамарин Махайри",
              "weapon_url": "https://paimon.moe/images/weapons/makhaira_aquamarine.png",
              "weapon_rarity": 4
          },
          "weapons_replacements": [
            {
              "weapon_name": "Квітка в латах",
              "weapon_url": "https://paimon.moe/images/weapons/mailed_flower.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Дощоріз",
              "weapon_url": "https://paimon.moe/images/weapons/rainslasher.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Регалія лісу",
              "weapon_url": "https://paimon.moe/images/weapons/forest_regalia.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "qoLScogA5-8"
        }
    """.trimIndent()
}