package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object CandaceDetailsSourceUk {
    @Language("JSON")
    val details = """
            {
              "name": "Кандаке",
              "rarity": 4,
              "element": "hydro",
              "weapon": "polearm",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/dd/Candace_Icon.png/revision/latest",
              "talents_books": {
                "book_name": "про Напоумлення",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9b/Item_Philosophies_of_Admonition.png",
                "book_days": "Понеділок/Четвер/Неділя"
              },
              "weekly_boss_item": {
                "boss_item_name": "Сльози згубного бога",
                "boss_item_url": "https://paimon.moe/images/items/tears_of_the_calamitous_god.png"
              },
              "talents_priority": [
                "Навичка",
                "Ульта",
                "Атака"
              ],
              "artifacts": [
                {
                  "artifact_name": "Церемонія давньої династії",
                  "artifact_url": "https://paimon.moe/images/artifacts/noblesse_oblige_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Здоровʼя%",
                  "artifact_circlet": "Здоровʼя%",
                  "artifact_sands": "Здоровʼя%"
                }
              ],
              "weapon_best": {
                "weapon_name": "Небесний хребет",
                "weapon_url": "https://paimon.moe/images/weapons/skyward_spine.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Спис Фавонія",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Вилов",
                  "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Чорна китиця",
                  "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
                  "weapon_rarity": 3
                }
              ],
              "video_guide": "_BpL9Lc2uIU"
            }
        """.trimIndent()
}
