package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object FaruzanDetailsSourceRu {
    @Language("JSON")
    val details = """
        {
          "name": "Фарузан",
          "rarity": 4,
          "element": "anemo",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a1/Character_Faruzan_Thumb.png",
          "talents_books": {
                "book_name": "о Наставлениях",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9b/Item_Philosophies_of_Admonition.png",
                "book_days": "Понедельник/Четверг/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Нити марионетки",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a2/Item_Daka%27s_Bell.png"
          },
          "talents_priority": [
            "Ульта",
            "Скилл",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Церемония древней знати",
              "artifact_url": "https://paimon.moe/images/artifacts/noblesse_oblige_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Анемо ДПС",
              "artifact_circlet": "Крит шанс / Крит урон",
              "artifact_sands": "Восстановление энергии"
            }
          ],
          "weapon_best": {
              "weapon_name": "Элегия погибели",
              "weapon_url": "https://paimon.moe/images/weapons/elegy_for_the_end.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Небесное крыло",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_harp.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Церемониальный лук",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_bow.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Боевой лук Фавония",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_warbow.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "3yz5viAZ6Ak"
        }
    """.trimIndent()
}