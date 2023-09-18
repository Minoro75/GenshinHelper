package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object TravelerHydroDetailsSourceRu {
    @Language("JSON")
    val details = """
        {
          "name": "Путешественник Гидро",
          "rarity": 5,
          "element": "hydro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/59/Traveler_Icon.png/revision/latest",
           "talents_books": {
            "book_name": "о Порядке",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/32/Item_Philosophies_of_Order.png",
            "book_days": "Среда/Суббота/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Объявший небосвод папоротник",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f8/Item_Worldspan_Fern.png/revision/latest"
          },
          "talents_priority": [
            "Ульта",
            "Скилл",
            "Атака"
          ],
          "artifacts": [
            {
               "artifact_name": "Сердце глубин",
              "artifact_url": "https://paimon.moe/images/artifacts/heart_of_depth_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Гидро ДПС",
              "artifact_circlet": "Крит шанс / Крит урон",
              "artifact_sands": "Сила атаки"
            },
            {
              "artifact_name": "Конец гладиатора",
              "artifact_url": "https://paimon.moe/images/artifacts/gladiators_finale_flower.png",
              "artifact_amount": 2,
               "artifact_gobelet": "Гидро ДПС",
              "artifact_circlet": "Крит шанс / Крит урон",
              "artifact_sands": "Сила атаки"
            }
          ],
          "weapon_best": {
            "weapon_name": "Драгоценный омут",
            "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_cutter.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Волчий клык",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e3/Weapon_Wolf-Fang.png/revision/latest",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Осквернённое желание",
              "weapon_url": "https://paimon.moe/images/weapons/festering_desire.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Амэнома Кагэути",
              "weapon_url": "https://paimon.moe/images/weapons/amenoma_kageuchi.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "q0V73MxGF34"
        }
    """.trimIndent()
}