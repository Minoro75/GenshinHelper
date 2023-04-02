package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object MikaDetailsSourceRu {
    @Language("JSON")
    val details = """
            {
              "name": "Мика",
              "rarity": 4,
              "element": "cryo",
              "weapon": "polearm",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/dd/Mika_Icon.png/revision/latest",
              "talents_books": {
                "book_name": "о Поэзии",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7e/Item_Philosophies_of_Ballad.png",
                "book_days": "Среда/Суббота/Воскресенье"
              },
              "weekly_boss_item": {
              "boss_item_name": "Зеркало Мусин",
              "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/ee/Item_Mirror_of_Mushin.png"
              },
              "talents_priority": [
                "Скилл",
                "Ульта",
                "Атака"
              ],
              "artifacts": [
                {
                  "artifact_name": "Церемония древней знати",
                  "artifact_url": "https://paimon.moe/images/artifacts/noblesse_oblige_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Здоровье %",
                  "artifact_circlet": "Здоровье %",
                  "artifact_sands": "Восстановление энергии / Здоровье %"
                }
              ],
              "weapon_best": {
                  "weapon_name": "Копьё Фавония",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
                  "weapon_rarity": 4
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Сияющая жатва",
                  "weapon_url": "https://paimon.moe/images/weapons/engulfing_lightning.png",
                  "weapon_rarity": 5
                },
                {
                 "weapon_name": "Чёрная кисть",
                 "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
                 "weapon_rarity": 3
                },
                {
                  "weapon_name": "Копьё Фавония",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "bG7wk6yVzSU"
            }
        """.trimIndent()
}