package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object NingguangDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Нин Гуан",
          "rarity": 4,
          "element": "geo",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/2b/Character_Ningguang_Thumb.png",
          "talents_books": {
            "book_name": "о Процветании",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bd/Item_Philosophies_of_Prosperity.png",
            "book_days": "Понедельник/Четверг/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Шкатулка с духом Борея",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/81/Item_Spirit_Locket_of_Boreas.png"
          },
          "talents_priority": [
            "Атака",
            "Ульта",
            "Скилл"
          ],
          "artifacts": [
            {
              "artifact_name": "Архаичный камень",
              "artifact_url": "https://paimon.moe/images/artifacts/archaic_petra_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Гео ДПС",
              "artifact_circlet": "Крит шанс / Крит урон",
              "artifact_sands": "Сила атаки"
            },
            {
              "artifact_name": "Конец гладиатора",
              "artifact_url": "https://paimon.moe/images/artifacts/gladiators_finale_flower.png",
              "artifact_amount": 2,
                "artifact_gobelet": "Гео ДПС",
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
              "weapon_name": "Солнечная жемчужина",
              "weapon_url": "https://paimon.moe/images/weapons/solar_pearl.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Морской атлас",
              "weapon_url": "https://paimon.moe/images/weapons/mappa_mare.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "nVmu5ActETE"
        }
    """.trimIndent()
}