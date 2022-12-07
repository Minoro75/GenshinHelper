package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object BeidouDetailsSourceUk {
    @Language("JSON")
    val details = """
            {
              "name": "Бейдоу",
              "rarity": 4,
              "element": "electro",
              "weapon": "claymore",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/61/Character_Beidou_Thumb.png",
              "talents_books": {
                "book_name": "про Золото",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_Philosophies_of_Gold.png",
                "book_days": "Середа/Субота/Неділя"
              },
              "weekly_boss_item": {
                "boss_item_name": "Подих Дваліна",
                "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/07/Item_Dvalin%27s_Sigh.png"
              },
              "talents_priority": [
                "Навичка",
                "Ульта",
                "Атака"
              ],
              "artifacts": [
                {
                  "artifact_name": "Емблема відрізаної долі",
                  "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Електро ДПС",
                  "artifact_circlet": "Кріт. Шанс or Кріт. Дамаг",
                  "artifact_sands": "Сила Атаки% / Відновлення енергії"
                }
              ],
              "weapon_best": {
                "weapon_name": "Вовчий надгробок",
                "weapon_url": "https://paimon.moe/images/weapons/wolfs_gravestone.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Акуомару",
                  "weapon_url": "https://paimon.moe/images/weapons/akuoumaru.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Кістковий меч",
                  "weapon_url": "https://paimon.moe/images/weapons/serpent_spine.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Кацурагікірі Нагамаса",
                  "weapon_url": "https://paimon.moe/images/weapons/katsuragikiri_nagamasa.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": null
            }
        """.trimIndent()
}
