package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object NahidaDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Нахіда",
          "rarity": 5,
          "element": "dendro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f9/Nahida_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "про Винахідливість",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Item_Philosophies_of_Ingenuity.png",
            "book_days": "Вівторок/Пʼятниця/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Нитки маріонетки",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f2/Item_Puppet_Strings.png"
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
              "artifact_gobelet": "Майстерність стихій",
              "artifact_circlet": "Майстерність стихій",
              "artifact_sands": "Майстерність стихій"
            }
          ],
         "weapon_best": {
                "weapon_name": "Плин снів тисячі ночей",
                "weapon_url": "https://paimon.moe/images/weapons/a_thousand_floating_dreams.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Мандрівня вечірня зоря",
                  "weapon_url": "https://paimon.moe/images/weapons/wandering_evenstar.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Фрагменти жертовного ритуалу",
                  "weapon_url": "https://paimon.moe/images/weapons/sacrificial_fragments.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Введення в магію",
                  "weapon_url": "https://paimon.moe/images/weapons/magic_guide.png",
                  "weapon_rarity": 3
                }
              ],
              "video_guide": "-OvdYCZwNmc"
        }
    """.trimIndent()
}