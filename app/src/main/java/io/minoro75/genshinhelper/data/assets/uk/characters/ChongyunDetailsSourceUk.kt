package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object ChongyunDetailsSourceUk {
    @Language("JSON")
    val details = """
            {
              "name": "Чонʼюнь",
              "rarity": 4,
              "element": "cryo",
              "weapon": "sword",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/68/Character_Chongyun_Thumb.png",
              "talents_books": {
                "book_name": "про Старанність",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
                "book_days": "Вівторок/Пʼятниця/Неділя"
              },
              "weekly_boss_item": {
                "boss_item_name": "Подих Дваліна",
                "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/07/Item_Dvalin%27s_Sigh.png"
              },
              "talents_priority": [
                "Атака",
                "Навичка",
                "Ульта"
              ],
              "artifacts": [
                {
                  "artifact_name": "Емблема відрізаної долі",
                  "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Кріо ДПС",
                  "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг",
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
                  "weapon_name": "Небесна гордість",
                  "weapon_url": "https://paimon.moe/images/weapons/skyward_pride.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Дворучний меч жертовного ритуалу",
                  "weapon_url": "https://paimon.moe/images/weapons/sacrificial_greatsword.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Прототип: Архаїчний",
                  "weapon_url": "https://paimon.moe/images/weapons/prototype_archaic.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": null
            }
        """.trimIndent()
}
