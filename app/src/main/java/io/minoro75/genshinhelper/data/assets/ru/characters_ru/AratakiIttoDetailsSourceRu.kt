package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object AratakiIttoDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
            {
              "name": "Аратаки Итто",
              "rarity": 5,
              "element": "geo",
              "weapon": "claymore",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/79/Character_Arataki_Itto_Thumb.png",
              "talents_books": {
                "book_name": "об Изяществе",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/6f/Item_Philosophies_of_Elegance.png",
                "book_days": "Вторник/Пятница/Воскресенье"
              },
              "weekly_boss_item": {
                "boss_item_name": "Пепельное сердце",
                "boss_item_url": "https://paimon.moe/images/items/ashen_heart.png"
              },
              "talents_priority": [
                "Атака",
                "Ульта",
                "Скилл"
              ],
              "artifacts": [
                {
                  "artifact_name": "Кокон сладких грёз",
                  "artifact_url": "https://paimon.moe/images/artifacts/husk_of_opulent_dreams_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Гео ДПС",
                  "artifact_circlet": "Крит Шанс/ Крит Урон",
                  "artifact_sands": "Защита"
                }
              ],
              "weapon_best": {
                "weapon_name": "Краснорогий камнеруб",
                "weapon_url": "https://paimon.moe/images/weapons/redhorn_stonethresher.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Небесное величие",
                  "weapon_url": "https://paimon.moe/images/weapons/skyward_pride.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Меч драконьей кости",
                  "weapon_url": "https://paimon.moe/images/weapons/serpent_spine.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Белая тень",
                  "weapon_url": "https://paimon.moe/images/weapons/whiteblind.png",
                  "weapon_rarity": 4
                }
              ]
            }
        """.trimIndent()

}
