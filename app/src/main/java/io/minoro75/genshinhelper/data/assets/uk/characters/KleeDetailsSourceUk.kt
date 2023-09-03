package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object KleeDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Клі",
          "rarity": 5,
          "element": "pyro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9c/Klee_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "про Волю",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
            "book_days": "Понеділок/Четвер/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Каблучка Борея",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d6/Item_Ring_of_Boreas.png"
          },
          "talents_priority": [
            "Атака",
            "Навичка",
            "Ульта"
          ],
          "artifacts": [
            {
              "artifact_name": "Вогняна відьма",
              "artifact_url": "https://paimon.moe/images/artifacts/crimson_witch_of_flames_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Піро ДПС",
              "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг",
              "artifact_sands": "Сила Атаки%"
            }
          ],
          "weapon_best": {
             "weapon_name": "Загублені молитви священим вітрам",
              "weapon_url": "https://paimon.moe/images/weapons/lost_prayer_to_the_sacred_winds.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
            "weapon_name": "Небесний атлас",
            "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Мандрівний рух",
              "weapon_url": "https://paimon.moe/images/weapons/the_widsith.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Морський атлас",
              "weapon_url": "https://paimon.moe/images/weapons/mappa_mare.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "ZP8LtLeiLus"
        }
    """.trimIndent()
}