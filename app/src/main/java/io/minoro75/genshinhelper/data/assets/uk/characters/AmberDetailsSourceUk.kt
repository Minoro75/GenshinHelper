package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object AmberDetailsSourceUk {
    @Language("JSON")
    val details = """
            {
              "name": "Ембер",
              "rarity": 4,
              "element": "pyro",
              "weapon": "bow",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c6/Character_Amber_Thumb.png",
              "talents_books": {
                "book_name": "про Волю",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
                "book_days": "Понеділок/Четвер/Неділя"
              },
              "weekly_boss_item": {
                "boss_item_name": "Подих Дваліна",
                "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/07/Item_Dvalin%27s_Sigh.png"
              },
              "talents_priority": [
                "Ульта",
                "Навичка",
                "Атака"
              ],
              "artifacts": [
                {
                  "artifact_name": "Емблема відрізаної долі",
                  "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Піро ДПС",
                  "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг",
                  "artifact_sands": "Сила Атаки%"
                }
              ],
              "weapon_best": {
                "weapon_name": "Елегія останнього зітхання",
                "weapon_url": "https://paimon.moe/images/weapons/elegy_for_the_end.png",
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
                  "weapon_name": "Бойовий лук Фавонія",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_warbow.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "oRMTPVfffUc"
            }
        """.trimIndent()
}
