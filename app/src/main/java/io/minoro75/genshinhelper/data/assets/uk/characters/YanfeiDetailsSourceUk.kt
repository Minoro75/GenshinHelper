package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object YanfeiDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Яньфей",
          "rarity": 4,
          "element": "pyro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1f/Character_Yanfei_Thumb.png",
          "talents_books": {
            "book_name": "про Золото",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_Philosophies_of_Gold.png",
            "book_days": "Середа/Субота/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Віть кривавого нефриту",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b1/Item_Bloodjade_Branch.png"
          },
          "talents_priority": [
            "Атака",
            "Ульта",
            "Навичка"
          ],
          "artifacts": [
            {
              "artifact_name": "Вогняна відьма",
              "artifact_url": "https://paimon.moe/images/artifacts/crimson_witch_of_flames_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Піро ДПС",
              "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг ",
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
             "weapon_name": "Плід жимолості",
              "weapon_url": "https://paimon.moe/images/weapons/frostbearer.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "Yez1jO-QzAU"
        }
    """.trimIndent()
}