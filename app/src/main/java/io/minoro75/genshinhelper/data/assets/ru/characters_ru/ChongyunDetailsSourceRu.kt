package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object ChongyunDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
            {
              "name": "Чун Юнь",
              "rarity": 4,
              "element": "cryo",
              "weapon": "claymore",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/35/Chongyun_Icon.png/revision/latest",
              "talents_books": {
                "book_name": "об Усердии",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
                "book_days": "Вторник/Пятница/Воскресенье"
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
              ],
             "video_guide": "V_5M0f3aqng"
            }
        """.trimIndent()
}
