package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object NilouDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Нилу",
          "rarity": 5,
          "element": "hydro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/58/Nilou_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "о Честности",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/82/Item_Philosophies_of_Praxis.png",
            "book_days": "Среда/Суббота/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Слёзы очищения божества бедствий",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/ef/Item_Tears_of_the_Calamitous_God.png"
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
              "artifact_amount": 2,
              "artifact_gobelet": "Здоровье",
              "artifact_circlet": "Здоровье",
              "artifact_sands": "Здоровье"
            },
            {
              "artifact_name": "Стойкость Миллелита",
              "artifact_url": "https://paimon.moe/images/artifacts/tenacity_of_the_millelith_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Здоровье",
              "artifact_circlet": "Здоровье",
              "artifact_sands": "Здоровье"
            }
          ],
          "weapon_best": {
             "weapon_name": "Ключ Хадж-нисут",
              "weapon_url": "https://paimon.moe/images/weapons/key_of_khaj-nisut.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Лунное сияние ксифоса",
            "weapon_url": "https://paimon.moe/images/weapons/xiphos_moonlight.png",
            "weapon_rarity": 4
            },
            {
              "weapon_name": "Церемониальный меч",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Меч Фавония",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_sword.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "jlCZPKw6vVg"
        }
    """.trimIndent()
}