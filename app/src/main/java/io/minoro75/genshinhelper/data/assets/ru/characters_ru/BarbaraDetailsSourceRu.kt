package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object BarbaraDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
            {
              "name": "Барбара",
              "rarity": 4,
              "element": "hydro",
              "weapon": "catalyst",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/72/Character_Barbara_Thumb.png",
              "talents_books": {
                "book_name": "о Свободе",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
                "book_days": "ПОН/ЧЕТ/ВОС"
              },
              "weekly_boss_item": {
                "boss_item_name": "Кольцо Борея",
                "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d6/Item_Ring_of_Boreas.png"
              },
              "talents_priority": [
                "Ульта",
                "Скилл",
                "Атака"
              ],
              "artifacts": [
                {
                  "artifact_name": "Моллюск морских красок",
                  "artifact_url": "https://paimon.moe/images/artifacts/ocean-hued_clam_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Здоровье",
                  "artifact_circlet": "Здоровье / Бонус к лечению",
                  "artifact_sands": "Здоровье"
                }
              ],
              "weapon_best": {
                "weapon_name": "Эпос о драконоборцах",
                "weapon_url": "https://paimon.moe/images/weapons/thrilling_tales_of_dragon_slayers.png",
                "weapon_rarity": 3
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Вечное лунное сияние",
                  "weapon_url": "https://paimon.moe/images/weapons/everlasting_moonglow.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Прототип: Янтарь",
                  "weapon_url": "https://paimon.moe/images/weapons/prototype_amber.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Кодекс Фавония",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_codex.png",
                  "weapon_rarity": 4
                }
              ]
            }
        """.trimIndent()
}