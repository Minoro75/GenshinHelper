package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object SayuDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Саю",
          "rarity": 5,
          "element": "anemo",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/22/Sayu_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "о Свете",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/95/Item_Philosophies_of_Light.png",
            "book_days": "Среда/Суббота/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Позолоченная чешуя",
            "boss_item_url": "https://paimon.moe/images/items/gilded_scale.png"
          },
          "talents_priority": [
            "Ульта",
            "Скилл",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Изумрудная тень",
              "artifact_url": "https://paimon.moe/images/artifacts/viridescent_venerer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Мастерство стихий",
              "artifact_circlet": "Мастерство стихий / Бонус исцеления",
              "artifact_sands": "Восстановление энергии / Мастерство стихий"
            }
          ],
          "weapon_best": {
            "weapon_name": "Волчья погибель",
            "weapon_url": "https://paimon.moe/images/weapons/wolfs_gravestone.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Небесное величие",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_pride.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Двуручный меч Фавония",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_greatsword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Кацурагикири Нагамаса",
              "weapon_url": "https://paimon.moe/images/weapons/katsuragikiri_nagamasa.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "HdS1OWd-Ys0"
        }
    """.trimIndent()
}