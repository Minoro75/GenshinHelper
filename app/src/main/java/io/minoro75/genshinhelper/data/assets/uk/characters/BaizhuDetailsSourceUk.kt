package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object BaizhuDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Бай Чжу",
          "rarity": 5,
          "element": "dendro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/cb/Baizhu_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "про Золото",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_Philosophies_of_Gold.png",
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
              "artifact_name": "Спогади хащі",
              "artifact_url": "https://paimon.moe/images/artifacts/deepwood_memories_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Здоровʼя%",
              "artifact_circlet": "Здоровʼя%",
              "artifact_sands": "Здоровʼя%"
            }
          ],
         "weapon_best": {
                "weapon_name": "Велич небесного нефриту",
                "weapon_url": "https://paimon.moe/images/weapons/jadefalls_splendor.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Кодекс Фавонія",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_codex.png",
                  "weapon_rarity": 4
                },
                {
                 "weapon_name": "Фрагменти жертовного ритуалу",
                 "weapon_url": "https://paimon.moe/images/weapons/sacrificial_fragments.png",
                 "weapon_rarity": 4
                },
                {
                 "weapon_name": "Прототип: Бурштин",
                  "weapon_url": "https://paimon.moe/images/weapons/prototype_amber.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "uCV14hvFFDo"
        }
    """.trimIndent()
}