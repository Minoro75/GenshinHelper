package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object MikaDetailsSourceUk {
    @Language("JSON")
    val details = """
            {
              "name": "Міка",
              "rarity": 4,
              "element": "cryo",
              "weapon": "polearm",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/dd/Mika_Icon.png/revision/latest",
              "talents_books": {
                "book_name": "про Поезію",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7e/Item_Philosophies_of_Ballad.png",
                "book_days": "Середа/Субота/Неділя"
              },
              "weekly_boss_item": {
              "boss_item_name": "Дзеркало Мушіну",
              "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/ee/Item_Mirror_of_Mushin.png"
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
                  "artifact_gobelet": "Здоровʼя %",
                  "artifact_circlet": "Здоровʼя %",
                  "artifact_sands": "Відновлення енергії / Здоровʼя %"
                }
              ],
              "weapon_best": {
                  "weapon_name": "Спис Фавонія",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
                  "weapon_rarity": 4
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Блискавка травокосу",
                  "weapon_url": "https://paimon.moe/images/weapons/engulfing_lightning.png",
                  "weapon_rarity": 5
                },
                {
                 "weapon_name": "Чорна китиця",
                 "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
                 "weapon_rarity": 3
                },
                {
                  "weapon_name": "Спис Фавонія",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": null
            }
        """.trimIndent()
}