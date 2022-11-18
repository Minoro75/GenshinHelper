package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object ShenheDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Шэнь Хэ",
          "rarity": 5,
          "element": "cryo",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/58/Character_Shenhe_Thumb.png",
          "talents_books": {
            "book_name": "о Процветании",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bd/Item_Philosophies_of_Prosperity.png",
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
              "artifact_name": "Конец гладиатора",
              "artifact_url": "https://paimon.moe/images/artifacts/gladiators_finale_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Сила атаки",
              "artifact_circlet": "Сила атаки",
              "artifact_sands": "Сила атаки / Восстановление энергии"
            },
            {
              "artifact_name": "Воспоминания Симэнавы",
              "artifact_url": "https://paimon.moe/images/artifacts/shimenawas_reminiscence_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Сила атаки",
              "artifact_circlet": "Сила атаки",
              "artifact_sands": "Сила атаки / Восстановление энергии"
            }
          ],
          "weapon_best": {
            "weapon_name": "Усмиритель бед",
            "weapon_url": "https://paimon.moe/images/weapons/calamity_queller.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Сияющая жатва",
              "weapon_url": "https://paimon.moe/images/weapons/engulfing_lightning.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Копьё Фавония",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Улов",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}