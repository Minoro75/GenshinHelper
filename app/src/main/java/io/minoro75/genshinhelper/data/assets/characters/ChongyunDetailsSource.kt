package io.minoro75.genshinhelper.data.assets.characters

import org.intellij.lang.annotations.Language

object ChongyunDetailsSource {
    @Language("JSON")
    val details = """
            {
              "name": "Chongyun",
              "rarity": 4,
              "element": "cryo",
              "weapon": "sword",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/68/Character_Chongyun_Thumb.png",
              "talents_books": {
                "book_name": "Diligence",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
                "book_days": "TUE/FRI/SUN"
              },
              "weekly_boss_item": {
                "boss_item_name": "Dvalin's Sigh",
                "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/07/Item_Dvalin%27s_Sigh.png"
              },
              "talents_priority": [
                "Attack",
                "Skill",
                "Burst"
              ],
              "artifacts": [
                {
                  "artifact_name": "Emblem of Severed Fate",
                  "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Cryo DPS",
                  "artifact_circlet": "CRIT Rate / CRIT DMG",
                  "artifact_sands": "ATK% / Energy Recharge"
                }
              ],
              "weapon_best": {
                "weapon_name": "Wolf's Gravestone",
                "weapon_url": "https://paimon.moe/images/weapons/wolfs_gravestone.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Skyward Pride",
                  "weapon_url": "https://paimon.moe/images/weapons/skyward_pride.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Sacrificial Greatsword",
                  "weapon_url": "https://paimon.moe/images/weapons/sacrificial_greatsword.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Prototype Archaic",
                  "weapon_url": "https://paimon.moe/images/weapons/prototype_archaic.png",
                  "weapon_rarity": 4
                }
              ]
            }
        """.trimIndent()

    @Language("JSON")
    val detailsRu = """
            {
              "name": "Чун Юнь",
              "rarity": 4,
              "element": "cryo",
              "weapon": "sword",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/68/Character_Chongyun_Thumb.png",
              "talents_books": {
                "book_name": "об Усердии",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
                "book_days": "ВТО/ПЯТ/ВОС"
              },
              "weekly_boss_item": {
                "boss_item_name": "Вздох Двалина",
                "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/07/Item_Dvalin%27s_Sigh.png"
              },
              "talents_priority": [
                "Атака",
                "Скилл",
                "Ульта"
              ],
              "artifacts": [
                {
                  "artifact_name": "Эмблема рассечённой судьбы",
                  "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Крио ДПС",
                  "artifact_circlet": "Крит Шанс / Крит Урон",
                  "artifact_sands": "Сила атаки / Восстановление энергии"
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
                  "weapon_name": "Церемониальный двуручный меч",
                  "weapon_url": "https://paimon.moe/images/weapons/sacrificial_greatsword.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Прототип: Архаичный",
                  "weapon_url": "https://paimon.moe/images/weapons/prototype_archaic.png",
                  "weapon_rarity": 4
                }
              ]
            }
        """.trimIndent()
}
