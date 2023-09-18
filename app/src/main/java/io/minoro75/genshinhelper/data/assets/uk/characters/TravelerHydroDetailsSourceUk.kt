package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object TravelerHydroDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Мандрівник Гідро",
          "rarity": 5,
          "element": "hydro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/59/Traveler_Icon.png/revision/latest",
           "talents_books": {
            "book_name": "про Порядок",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/32/Item_Philosophies_of_Order.png",
            "book_days": "Середа/Субота/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Світоросла папороть",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f8/Item_Worldspan_Fern.png/revision/latest"
          },
          "talents_priority": [
            "Ульта",
            "Навичка",
            "Атака"
          ],
          "artifacts": [
            {
            "artifact_name": "Серце глибин",
              "artifact_url": "https://paimon.moe/images/artifacts/heart_of_depth_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Гідро ДПС",
              "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг",
              "artifact_sands": "Сила Атаки%"
            },
            {
              "artifact_name": "Церемонія поховання гладіатора",
              "artifact_url": "https://paimon.moe/images/artifacts/gladiators_finale_flower.png",
              "artifact_amount": 2,
               "artifact_gobelet": "Гідро ДПС",
              "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг",
              "artifact_sands": "Сила Атаки%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Нефритовий вир",
            "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_cutter.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Вовче ікло",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e3/Weapon_Wolf-Fang.png/revision/latest",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Тлінний меч",
              "weapon_url": "https://paimon.moe/images/weapons/festering_desire.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Аменома Кагеучі",
              "weapon_url": "https://paimon.moe/images/weapons/amenoma_kageuchi.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": null
        }
    """.trimIndent()
}