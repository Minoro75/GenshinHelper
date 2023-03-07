package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object CandaceDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
            {
              "name": "Кандакия",
              "rarity": 4,
              "element": "hydro",
              "weapon": "polearm",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/dd/Candace_Icon.png/revision/latest",
              "talents_books": {
                "book_name": "о Наставлениях",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9b/Item_Philosophies_of_Admonition.png",
                "book_days": "Понедельник/Четверг/Воскресенье"
              },
              "weekly_boss_item": {
                "boss_item_name": "Слёзы очищения божества бедствий",
                "boss_item_url": "https://paimon.moe/images/items/tears_of_the_calamitous_god.png"
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
                  "artifact_gobelet": "Здоровье",
                  "artifact_circlet": "Здоровье",
                  "artifact_sands": "Здоровье"
                }
              ],
              "weapon_best": {
                "weapon_name": "Небесная ось",
                "weapon_url": "https://paimon.moe/images/weapons/skyward_spine.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Копьё Фавония",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Улов",
                  "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Чёрная кисть",
                  "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
                  "weapon_rarity": 3
                }
              ],
             "video_guide": "znHLPZZpIKs"
            }
        """.trimIndent()
}
