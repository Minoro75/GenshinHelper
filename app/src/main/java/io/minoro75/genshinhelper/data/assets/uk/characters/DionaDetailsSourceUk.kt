package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object DionaDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Діона",
          "rarity": 4,
          "element": "cryo",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b9/Character_Diona_Thumb.png",
          "talents_books": {
            "book_name": "про Волю",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
            "book_days": "Понеділок/Четвер/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Фрагмент леза диявола",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/48/Item_Shard_of_a_Foul_Legacy.png"
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
            "weapon_name": "Елегія останнього зітхання",
            "weapon_url": "https://paimon.moe/images/weapons/elegy_for_the_end.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Лук жертовного ритуалу",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_bow.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Бойовий лук Фавонія",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_warbow.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Вигнутий лук",
              "weapon_url": "https://paimon.moe/images/weapons/recurve_bow.png",
              "weapon_rarity": 3
            }
          ],
          "video_guide": "l9353PeY69I"
        }
    """.trimIndent()
}
