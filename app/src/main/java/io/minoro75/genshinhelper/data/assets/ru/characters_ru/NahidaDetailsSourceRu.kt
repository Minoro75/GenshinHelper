package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object NahidaDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Нахида",
          "rarity": 5,
          "element": "dendro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/cf/Character_Nahida_Thumb.png",
          "talents_books": {
            "book_name": "об Остроумии",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Item_Philosophies_of_Ingenuity.png",
            "book_days": "Вторник/Пятница/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Нити марионетки",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f2/Item_Puppet_Strings.png"
          },
          "talents_priority": [
            "Скилл",
            "Ульта",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Воспоминания дремучего леса",
              "artifact_url": "https://paimon.moe/images/artifacts/deepwood_memories_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Мастерство стихий",
              "artifact_circlet": "Мастерство стихий",
              "artifact_sands": "Мастерство стихий"
            }
          ],
         "weapon_best": {
                "weapon_name": "Сновидения тысячи ночей",
                "weapon_url": "https://paimon.moe/images/weapons/a_thousand_floating_dreams.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Скитающаюся звезда",
                  "weapon_url": "https://paimon.moe/images/weapons/wandering_evenstar.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Церемониальные мемуары",
                  "weapon_url": "https://paimon.moe/images/weapons/sacrificial_fragments.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Руководство по магии",
                  "weapon_url": "https://paimon.moe/images/weapons/magic_guide.png",
                  "weapon_rarity": 3
                }
              ],
              "video_guide": "6WgMwfzX2Q8"
        }
    """.trimIndent()
}