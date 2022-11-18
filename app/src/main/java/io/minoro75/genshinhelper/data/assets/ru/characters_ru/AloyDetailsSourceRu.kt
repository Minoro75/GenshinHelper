package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object AloyDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Элой",
          "rarity": 5,
          "element": "cryo",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png",
          "talents_books": {
            "book_name": "о Свободе",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
            "book_days": "Понедельник/Четверг/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Расплавленный миг",
            "boss_item_url": "https://paimon.moe/images/items/molten_moment.png"
          },
          "talents_priority": [
            "Ульта",
            "Скилл",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Заблудший в метели",
              "artifact_url": "https://paimon.moe/images/artifacts/blizzard_strayer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Крио ДПС",
              "artifact_circlet": "Крит Шанс/ Крит Урон",
              "artifact_sands": "Сила атаки"
            }
          ],
          "weapon_best": {
            "weapon_name": "Громовой пульс",
            "weapon_url": "https://paimon.moe/images/weapons/thundering_pulse.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Небесное крыло",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_harp.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Бесструнный",
              "weapon_url": "https://paimon.moe/images/weapons/the_stringless.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Прототип: Полумесяц",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_crescent.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}
