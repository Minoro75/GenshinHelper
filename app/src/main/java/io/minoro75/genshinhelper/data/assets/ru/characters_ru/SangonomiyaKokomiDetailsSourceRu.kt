package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object SangonomiyaKokomiDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Сангономия Кокоми",
          "rarity": 5,
          "element": "hydro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/cc/Character_Sangonomiya_Kokomi_Thumb.png",
          "talents_books": {
            "book_name": "о Бренности",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/27/Item_Philosophies_of_Transience.png",
            "book_days": "Понедельник/Четверг/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Бабочка адского пламени",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/16/Item_Hellfire_Butterfly.png"
          },
          "talents_priority": [
            "Скилл",
            "Ульта",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Стойкость Миллелита",
              "artifact_url": "https://paimon.moe/images/artifacts/tenacity_of_the_millelith_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Здоровье",
              "artifact_circlet": "Бонус исцеления",
              "artifact_sands": "Восстановление энергии / Здоровье"
            }
          ],
          "weapon_best": {
            "weapon_name": "Эпос о драконоборцах",
            "weapon_url": "https://paimon.moe/images/weapons/thrilling_tales_of_dragon_slayers.png",
            "weapon_rarity": 3
          },
          "weapons_replacements": [
            {
              "weapon_name": "Прототип: Янтарь",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_amber.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Вечное лунное сияние",
              "weapon_url": "https://paimon.moe/images/weapons/everlasting_moonglow.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Кольцо Хакусин",
              "weapon_url": "https://paimon.moe/images/weapons/hakushin_ring.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}