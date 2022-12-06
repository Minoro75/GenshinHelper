package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object BennettDetailsSourceUk {
    @Language("JSON")
    val details = """
            {
              "name": "Беннетт",
              "rarity": 4,
              "element": "pyro",
              "weapon": "sword",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7b/Character_Bennett_Thumb.png",
              "talents_books": {
                "book_name": "про Стійкість",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0b/Item_Philosophies_of_Resistance.png",
                "book_days": "Вівторок/Пʼятниця/Неділя"
              },
              "weekly_boss_item": {
                "boss_item_name": "Перо Дваліна",
                "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bf/Item_Dvalin%27s_Plume.png"
              },
              "talents_priority": [
                "Ульта",
                "Навичка",
                "Атака"
              ],
              "artifacts": [
                {
                  "artifact_name": "Церемонія давньої династії",
                  "artifact_url": "https://paimon.moe/images/artifacts/noblesse_oblige_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Здоровʼя%",
                  "artifact_circlet": "Бонус хілінгу / Здоровʼя%",
                  "artifact_sands": "Відновлення енергії / Здоровʼя%"
                }
              ],
              "weapon_best": {
                "weapon_name": "Небесний клинок",
                "weapon_url": "https://paimon.moe/images/weapons/skyward_blade.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Спалах темної алеї",
                  "weapon_url": "https://paimon.moe/images/weapons/the_alley_flash.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Меч жертовного ритуалу",
                  "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Прототип: Злоба",
                  "weapon_url": "https://paimon.moe/images/weapons/prototype_rancour.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "H0tUlWYGYX8"
            }
        """.trimIndent()
}
