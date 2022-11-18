package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object DoriDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
            {
              "name": "Дори",
              "rarity": 4,
              "element": "electro",
              "weapon": "claymore",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/90/Character_Dori_Thumb.png",
              "talents_books": {
                "book_name": "об Остроумии",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Item_Philosophies_of_Ingenuity.png",
                "book_days": "Вторник/Пятница/Воскресенье"
              },
              "weekly_boss_item": {
                "boss_item_name": "Ветвь кровавой яшмы",
                "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b1/Item_Bloodjade_Branch.png"
              },
              "talents_priority": [
                "Ульта",
                "Скилл",
                "Атака"
              ],
              "artifacts": [
                {
                  "artifact_name": "Эмблема рассечённой судьбы",
                  "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
                  "artifact_amount": 2,
                  "artifact_gobelet": "Електро ДПС",
                  "artifact_circlet": "Здоровье / Бонус исцеления",
                  "artifact_sands": "Восстановление енергии / Здоровье"
                },
                {
                  "artifact_name": "Стойкость Миллелита",
                  "artifact_url": "https://paimon.moe/images/artifacts/tenacity_of_the_millelith_flower.png",
                  "artifact_amount": 2,
                  "artifact_gobelet": "Електро ДПС",
                  "artifact_circlet": "Здоровье / Бонус исцеления",
                  "artifact_sands": "Восстановление енергии / Здоровье"
                }
              ],
              "weapon_best": {
                "weapon_name": "Церемониальный двуручный меч",
                "weapon_url": "https://paimon.moe/images/weapons/sacrificial_greatsword.png",
                "weapon_rarity": 4
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Небесное величие",
                  "weapon_url": "https://paimon.moe/images/weapons/skyward_pride.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Двуручный меч Фавония",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_greatsword.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Кацурагикири Нагамаса",
                  "weapon_url": "https://paimon.moe/images/weapons/katsuragikiri_nagamasa.png",
                  "weapon_rarity": 4
                }
              ]
            }
        """.trimIndent()
}