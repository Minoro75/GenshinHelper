package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object GanyuDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Ганью",
          "rarity": 5,
          "element": "cryo",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0a/Character_Ganyu_Thumb.png",
          "talents_books": {
            "book_name": "про Старанність",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
            "book_days": "Вівторок/Пʼятниця/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Тінь воїна",
            "boss_item_url": "https://paimon.moe/images/items/shadow_of_the_warrior.png"
          },
          "talents_priority": [
            "Атака",
            "Ульта",
            "Навичка"
          ],
          "artifacts": [
            {
              "artifact_name": "Мандрівна трупа",
              "artifact_url": "https://paimon.moe/images/artifacts/wanderers_troupe_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Кріо ДПС",
              "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг",
              "artifact_sands": "Сила Атаки%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Лук Амоса",
            "weapon_url": "https://paimon.moe/images/weapons/amos_bow.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Аква Симулякр",
              "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Прототип: Півмісяць",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_crescent.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Хамаюмі",
              "weapon_url": "https://paimon.moe/images/weapons/hamayumi.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "81WgJEcNRQ8"
        }
    """.trimIndent()
}
