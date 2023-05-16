package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object BaizhuDetailsSourceRu {
    @Language("JSON")
    val details = """
        {
          "name": "Бай Чжу",
          "rarity": 5,
          "element": "dendro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/cb/Baizhu_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "о Золоте",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_Philosophies_of_Gold.png",
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
              "artifact_name": "Воспоминания дремучего леса",
              "artifact_url": "https://paimon.moe/images/artifacts/deepwood_memories_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Здоровье%",
              "artifact_circlet": "Здоровье%",
              "artifact_sands": "Здоровье%"
            }
          ],
         "weapon_best": {
                "weapon_name": "Великолепие лазурного свода",
                "weapon_url": "https://paimon.moe/images/weapons/jadefalls_splendor.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Кодекс Фавония",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_codex.png",
                  "weapon_rarity": 4
                },
                {
                 "weapon_name": "Церемониальные мемуары",
                 "weapon_url": "https://paimon.moe/images/weapons/sacrificial_fragments.png",
                 "weapon_rarity": 4
                },
                {
                 "weapon_name": "Прототип: Янтарь",
                  "weapon_url": "https://paimon.moe/images/weapons/prototype_amber.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "ryS2zOQqc_g"
        }
    """.trimIndent()
}