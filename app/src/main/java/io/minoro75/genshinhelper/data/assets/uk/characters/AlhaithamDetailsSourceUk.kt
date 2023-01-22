package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object AlhaithamDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Аль-Хайтам",
          "rarity": 5,
          "element": "dendro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/2c/Alhaitham_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "про Винахідливість",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Item_Philosophies_of_Ingenuity.png",
            "book_days": "Вівторок/Пʼятниця/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Дзеркало Мушіну",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/ee/Item_Mirror_of_Mushin.png"
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
              "artifact_gobelet": "Дендро ДПС",
              "artifact_circlet": "Кріт шанс / Кріт дамаг",
              "artifact_sands": "Майстерність стихій"
            }
          ],
          "weapon_best": {
             "weapon_name": "Світло листяного розрізу",
              "weapon_url": "https://paimon.moe/images/weapons/light_of_foliar_incision.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
            "weapon_name": "Харан Геппаку Фуцу",
            "weapon_url": "https://paimon.moe/images/weapons/haran_geppaku_futsu.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Відблиск туману",
              "weapon_url": "https://paimon.moe/images/weapons/mistsplitter_reforged.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Вісник світанку",
              "weapon_url": "https://paimon.moe/images/weapons/harbinger_of_dawn.png",
              "weapon_rarity": 3
            }
          ],
         "video_guide": null
        }
    """.trimIndent()
}