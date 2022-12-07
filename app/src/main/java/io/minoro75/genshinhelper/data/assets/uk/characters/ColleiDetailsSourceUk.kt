package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object ColleiDetailsSourceUk {
    @Language("JSON")
    val details = """
            {
              "name": "Коллей",
              "rarity": 4,
              "element": "dendro",
              "weapon": "bow",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9e/Character_Collei_Thumb.png",
              "talents_books": {
                "book_name": "про Діяння",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/82/Item_Philosophies_of_Praxis.png",
                "book_days": "Середа/Субота/Неділя"
              },
              "weekly_boss_item": {
                "boss_item_name": "Сльози згубного бога",
                "boss_item_url": "https://paimon.moe/images/items/tears_of_the_calamitous_god.png"
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
                  "artifact_gobelet": "Дендро ДПС",
                  "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг",
                  "artifact_sands": "Відновлення енергії / Сила Атаки%"
                }
              ],
              "weapon_best": {
                "weapon_name": "Полярна зірка",
                "weapon_url": "https://paimon.moe/images/weapons/polar_star.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Елегія останнього зітхання",
                  "weapon_url": "https://paimon.moe/images/weapons/elegy_for_the_end.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Аква Симулякр",
                  "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Бойовий лук Фавонія",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_warbow.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "krMnbjwapug"
            }
        """.trimIndent()
}
