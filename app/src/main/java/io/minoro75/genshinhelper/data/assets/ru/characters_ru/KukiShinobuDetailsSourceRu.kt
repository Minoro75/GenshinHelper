package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object KukiShinobuDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Куки Синобу",
          "rarity": 4,
          "element": "electro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/37/Character_Kuki_Shinobu_Thumb.png",
          "talents_books": {
            "book_name": "об Элегантности",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/6f/Item_Philosophies_of_Elegance.png",
            "book_days": "Вторник/Пятница/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Слёзы очищения божества бедствий",
            "boss_item_url": "https://paimon.moe/images/items/tears_of_the_calamitous_god.png"
          },
          "talents_priority": [
            "Скилл",
            "Ульта",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Позолоченные сны",
              "artifact_url": "https://paimon.moe/images/artifacts/gilded_dreams_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Мастерство стихий",
              "artifact_circlet": "Мастерство стихий",
              "artifact_sands": "Мастерство стихий"
            }
          ],
          "weapon_best": {
             "weapon_name": "Клятва свободе",
              "weapon_url": "https://paimon.moe/images/weapons/freedom-sworn.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
            "weapon_name": "Драгоценный омут",
            "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_cutter.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Стальное жало",
              "weapon_url": "https://paimon.moe/images/weapons/iron_sting.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Стальное жало",
              "weapon_url": "https://paimon.moe/images/weapons/iron_sting.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}