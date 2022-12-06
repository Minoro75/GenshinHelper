package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object AloyDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Елой",
          "rarity": 5,
          "element": "cryo",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png",
          "talents_books": {
            "book_name": "про Волю",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
            "book_days": "Понеділок/Четвер/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Розплавлений момент",
            "boss_item_url": "https://paimon.moe/images/items/molten_moment.png"
          },
          "talents_priority": [
            "Ульта",
            "Навичка",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Загублений у хуртовині",
              "artifact_url": "https://paimon.moe/images/artifacts/blizzard_strayer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Кріо ДПС",
              "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг",
              "artifact_sands": "Сила Атаки%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Громова струна",
            "weapon_url": "https://paimon.moe/images/weapons/thundering_pulse.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Небесні крила",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_harp.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Безструнний",
              "weapon_url": "https://paimon.moe/images/weapons/the_stringless.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Прототип: Півмісяць",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_crescent.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "s_cAQF-Tq30"
        }
    """.trimIndent()
}
