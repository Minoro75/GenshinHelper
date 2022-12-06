package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object YoimiyaDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Йоімія",
          "rarity": 5,
          "element": "pyro",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/05/Character_Yoimiya_Thumb.png",
          "talents_books": {
            "book_name": "про Швидкоплинність",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/27/Item_Philosophies_of_Transience.png",
            "book_days": "Понеділок/Четвер/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Корона володаря драконів",
            "boss_item_url": "https://paimon.moe/images/items/dragon_lords_crown.png"
          },
          "talents_priority": [
            "Атака",
            "Навичка",
            "Ульта"
          ],
          "artifacts": [
            {
              "artifact_name": "Спогади Шіменави",
              "artifact_url": "https://paimon.moe/images/artifacts/shimenawas_reminiscence_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Піро ДПС",
              "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг ",
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
              "weapon_name": "Аква Симулякр",
            "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Іржавий лук",
              "weapon_url": "https://paimon.moe/images/weapons/rust.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Прототип: Півмісяць",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_crescent.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "6CKnyJC4UWQ"
        }
    """.trimIndent()
}