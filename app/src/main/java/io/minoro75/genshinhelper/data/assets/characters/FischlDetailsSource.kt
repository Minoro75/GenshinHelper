package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object FischlDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Fischl",
          "rarity": 4,
          "element": "electro",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/14/Character_Fischl_Thumb.png",
          "talents_books": {
            "book_name": "Ballad",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7e/Item_Philosophies_of_Ballad.png",
            "book_days": "WED/SAT/SUN"
          },
          "weekly_boss_item": {
            "boss_item_name": "Spirit Locket of Boreas",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/81/Item_Spirit_Locket_of_Boreas.png"
          },
          "talents_priority": [
            "Skill",
            "Burst",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Gladiator's Finale",
              "artifact_url": "https://paimon.moe/images/artifacts/gladiators_finale_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Electro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "ATK% / Elemental Mastery"
            },
            {
              "artifact_name": "Thundering Fury",
              "artifact_url": "https://paimon.moe/images/artifacts/thundering_fury_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Electro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "ATK% / Elemental Mastery"
            }
          ],
          "weapon_best": {
            "weapon_name": "Skyward Harp",
            "weapon_url": "https://paimon.moe/images/weapons/skyward_harp.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "The Stringless",
              "weapon_url": "https://paimon.moe/images/weapons/the_stringless.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Fading Twilight",
              "weapon_url": "https://paimon.moe/images/weapons/fading_twilight.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Hamayumi",
              "weapon_url": "https://paimon.moe/images/weapons/hamayumi.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Фишль",
          "rarity": 4,
          "element": "electro",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/14/Character_Fischl_Thumb.png",
          "talents_books": {
            "book_name": "о Балладах",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7e/Item_Philosophies_of_Ballad.png",
            "book_days": "СРЕ/СУБ/ВОС"
          },
          "weekly_boss_item": {
            "boss_item_name": "Шкатулка с духом Борея",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/81/Item_Spirit_Locket_of_Boreas.png"
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
              "artifact_gobelet": "Електро ДПС",
              "artifact_circlet": "Крит шанс / Крит урон",
              "artifact_sands": "Сила атаки / Мастерство стихий"
            },
            {
              "artifact_name": "Громогласный рёв ярости",
              "artifact_url": "https://paimon.moe/images/artifacts/thundering_fury_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Електро ДПС",
              "artifact_circlet": "Крит шанс / Крит урон",
              "artifact_sands": "Сила атаки / Мастерство стихий"
            }
          ],
          "weapon_best": {
            "weapon_name": "Небесное крыло",
            "weapon_url": "https://paimon.moe/images/weapons/skyward_harp.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Бесструнный",
              "weapon_url": "https://paimon.moe/images/weapons/the_stringless.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Гаснущие сумерки",
              "weapon_url": "https://paimon.moe/images/weapons/fading_twilight.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Хамаюми",
              "weapon_url": "https://paimon.moe/images/weapons/hamayumi.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}
