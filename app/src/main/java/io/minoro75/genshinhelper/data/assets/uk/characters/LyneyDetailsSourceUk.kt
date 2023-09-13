package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object LyneyDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Ліні",
          "rarity": 5,
          "element": "pyro",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b2/Lyney_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "про Неупередженість",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a0/Item_Philosophies_of_Equity.png",
            "book_days": "Понеділок/Четвер/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Зелений первоцвіт",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e7/Item_Primordial_Greenbloom.png/revision/latest"
          },
          "talents_priority": [
            "Атака",
            "Навичка",
            "Ульта"
          ],
          "artifacts": [
            {
              "artifact_name": "Фантомний мисливець",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8d/Item_Hunter%27s_Brooch.png/revision/latest",
              "artifact_amount": 4,
             "artifact_gobelet": "Піро ДПС",
              "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг ",
              "artifact_sands": "Сила Атаки"
            }
          ],
          "weapon_best": {
            "weapon_name": "Перші диво-чари",
            "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/03/Weapon_The_First_Great_Magic.png/revision/latest",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Аква симулякр",
            "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Нащадок палючого сонця",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/83/Weapon_Scion_of_the_Blazing_Sun.png/revision/latest",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Прототип: Півмісяць",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_crescent.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "ippIVSkD-hw"
        }
    """.trimIndent()
}