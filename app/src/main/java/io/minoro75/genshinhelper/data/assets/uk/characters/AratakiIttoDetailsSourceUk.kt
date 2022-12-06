package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object AratakiIttoDetailsSourceUk {
    @Language("JSON")
    val details = """
            {
              "name": "Аратакі Ітто",
              "rarity": 5,
              "element": "geo",
              "weapon": "claymore",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/79/Character_Arataki_Itto_Thumb.png",
              "talents_books": {
                "book_name": "про Вишуканість",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/6f/Item_Philosophies_of_Elegance.png",
                "book_days": "Вівторок/Пʼятниця/Неділя"
              },
              "weekly_boss_item": {
                "boss_item_name": "Серце попелу",
                "boss_item_url": "https://paimon.moe/images/items/ashen_heart.png"
              },
              "talents_priority": [
                "Атака",
                "Ульта",
                "Навичка"
              ],
              "artifacts": [
                {
                  "artifact_name": "Пробудження від сну",
                  "artifact_url": "https://paimon.moe/images/artifacts/husk_of_opulent_dreams_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Гео ДПС",
                  "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг",
                  "artifact_sands": "Захист"
                }
              ],
              "weapon_best": {
                "weapon_name": "Червонорогий Каменомолотник",
                "weapon_url": "https://paimon.moe/images/weapons/redhorn_stonethresher.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Небесна гордість",
                  "weapon_url": "https://paimon.moe/images/weapons/skyward_pride.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Кістковий меч",
                  "weapon_url": "https://paimon.moe/images/weapons/serpent_spine.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Меч білої тіні",
                  "weapon_url": "https://paimon.moe/images/weapons/whiteblind.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "KLvivxNQJj0"
            }
        """.trimIndent()
}
