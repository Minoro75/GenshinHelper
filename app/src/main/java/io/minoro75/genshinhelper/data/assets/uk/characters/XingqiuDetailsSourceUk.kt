package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object XingqiuDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Сінцю",
          "rarity": 4,
          "element": "hydro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d4/Xingqiu_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "про Золото",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_Philosophies_of_Gold.png",
            "book_days": "Середа/Субота/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Хвіст Борея",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/66/Item_Tail_of_Boreas.png"
          },
          "talents_priority": [
            "Ульта",
            "Атака",
            "Навичка"
          ],
          "artifacts": [
            {
              "artifact_name": "Емблема відрізаної долі",
              "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Гідро ДПС",
              "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг ",
              "artifact_sands": "Сила Атаки% / Відновлення енергії"
            }
          ],
          "weapon_best": {
            "weapon_name": "Меч жертовного ритуалу",
            "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
            "weapon_rarity": 4
          },
          "weapons_replacements": [
            {
              "weapon_name": "Нефритовий вир",
              "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_cutter.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Відблиск туману",
              "weapon_url": "https://paimon.moe/images/weapons/mistsplitter_reforged.png",
              "weapon_rarity": 5
            },
            {
             "weapon_name": "Аменома Кагеучі",
              "weapon_url": "https://paimon.moe/images/weapons/amenoma_kageuchi.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "jGt3Z4L4qac"
        }
    """.trimIndent()
}