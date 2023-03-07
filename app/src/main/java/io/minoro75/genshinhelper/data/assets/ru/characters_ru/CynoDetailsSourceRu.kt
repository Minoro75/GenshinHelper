package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object CynoDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
            {
              "name": "Сайно",
              "rarity": 5,
              "element": "electro",
              "weapon": "polearm",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/31/Cyno_Icon.png/revision/latest",
              "talents_books": {
                "book_name": "о Наставлениях",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9b/Item_Philosophies_of_Admonition.png",
                "book_days": "Понедельник/Четверг/Воскресенье"
              },
              "weekly_boss_item": {
                "boss_item_name": "Мудра зловещего генерала",
                "boss_item_url": "https://paimon.moe/images/items/mudra_of_the_malefic_general.png"
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
                  "artifact_amount": 4,
                  "artifact_gobelet": "Электро ДПС",
                  "artifact_circlet": "Крит шанс / Крит урон",
                  "artifact_sands": "Елементалье мастерство / Сила атаки"
                }
              ],
              "weapon_best": {
                "weapon_name": "Посох алых песков",
                "weapon_url": "https://paimon.moe/images/weapons/staff_of_the_scarlet_sands.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Нефритовый коршун",
                  "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_winged-spear.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Смертельный бой",
                  "weapon_url": "https://paimon.moe/images/weapons/deathmatch.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Белая кисть",
                  "weapon_url": "https://paimon.moe/images/weapons/white_tassel.png",
                  "weapon_rarity": 3
                }
              ],
              "video_guide": "mGXmPHM8ed0"
            }
        """.trimIndent()
}