package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object ShikanoinHeizouDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Хэйдзо",
          "rarity": 4,
          "element": "anemo",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e4/Character_Shikanoin_Heizou_Thumb.png",
          "talents_books": {
            "book_name": "о Бренности",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/27/Item_Philosophies_of_Transience.png",
            "book_days": "Понедельник/Четверг/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Смысл эонов",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c9/Item_The_Meaning_of_Aeons.png"
          },
          "talents_priority": [
            "Скилл",
            "Атака",
            "Ульта"
            
          ],
          "artifacts": [
            {
              "artifact_name": "Изумрудная тень",
              "artifact_url": "https://paimon.moe/images/artifacts/viridescent_venerer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Анемо Дпс",
              "artifact_circlet": "Крит шанс / Крит урон / Мастерство стихий",
              "artifact_sands": "Сила атаки / Мастерство стихий"
            }
          ],
          "weapon_best": {
            "weapon_name": "Небесный атлас",
            "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Истина кагура",
              "weapon_url": "https://paimon.moe/images/weapons/kaguras_verity.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Песнь странника",
              "weapon_url": "https://paimon.moe/images/weapons/the_widsith.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Морской атлас",
              "weapon_url": "https://paimon.moe/images/weapons/mappa_mare.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "g9Tmvfs2jpk"
        }
    """.trimIndent()
}