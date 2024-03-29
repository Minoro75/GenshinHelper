package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object YanfeiDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Янь Фэй",
          "rarity": 4,
          "element": "pyro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/54/Yanfei_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "о Золоте",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_Philosophies_of_Gold.png",
            "book_days": "Среда/Суббота/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Ветвь кровавой яшмы",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b1/Item_Bloodjade_Branch.png"
          },
          "talents_priority": [
            "Атака",
            "Ульта",
            "Скилл"
          ],
          "artifacts": [
            {
              "artifact_name": "Горящая алая ведьма",
              "artifact_url": "https://paimon.moe/images/artifacts/crimson_witch_of_flames_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Пиро ДПС",
              "artifact_circlet": "Крит шанс / Крит урон",
              "artifact_sands": "Сила атаки"
            }
          ],
          "weapon_best": {
            "weapon_name": "Молитва святым ветрам",
            "weapon_url": "https://paimon.moe/images/weapons/lost_prayer_to_the_sacred_winds.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Небесный атлас",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Песнь странника",
              "weapon_url": "https://paimon.moe/images/weapons/the_widsith.png",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Плод вечной мерзлоты",
              "weapon_url": "https://paimon.moe/images/weapons/frostbearer.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "BQwVkOOU1BQ"
        }
    """.trimIndent()
}