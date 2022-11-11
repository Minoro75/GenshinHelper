package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object KeqingDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Кэ Цин",
          "rarity": 5,
          "element": "electro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/06/Character_Keqing_Thumb.png",
          "talents_books": {
            "book_name": "об Процветании",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bd/Item_Philosophies_of_Prosperity.png",
            "book_days": "Понедельник/Четверг/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Кольцо Борея",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d6/Item_Ring_of_Boreas.png"
          },
          "talents_priority": [
            "Ульта",
            "Скилл",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Громогласный рёв ярости",
              "artifact_url": "https://paimon.moe/images/artifacts/thundering_fury_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Електро ДПС",
              "artifact_circlet": "Крит шанс / Крит урон",
              "artifact_sands": "Сила атаки"
            },
             {
              "artifact_name": "Конец гладиатора",
              "artifact_url": "https://paimon.moe/images/artifacts/gladiators_finale_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Електро ДПС",
              "artifact_circlet": "Крит шанс / Крит урон",
              "artifact_sands": "Сила атаки"
            }
          ],
          "weapon_best": {
             "weapon_name": "Рассекающий туман",
              "weapon_url": "https://paimon.moe/images/weapons/mistsplitter_reforged.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
            "weapon_name": "Харан гэппаку фуцу",
            "weapon_url": "https://paimon.moe/images/weapons/haran_geppaku_futsu.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Чёрный меч",
              "weapon_url": "https://paimon.moe/images/weapons/the_black_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Амэнома Кагэути",
              "weapon_url": "https://paimon.moe/images/weapons/amenoma_kageuchi.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}