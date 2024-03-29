package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object BeidouDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
            {
              "name": "Бэй Доу",
              "rarity": 4,
              "element": "electro",
              "weapon": "claymore",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e1/Beidou_Icon.png/revision/latest",
              "talents_books": {
                "book_name": "о Золоте",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_Philosophies_of_Gold.png",
                "book_days": "Среда/Суббота/Воскресенье"
              },
              "weekly_boss_item": {
                "boss_item_name": "Вздох Двалина",
                "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/07/Item_Dvalin%27s_Sigh.png"
              },
              "talents_priority": [
                "Скилл",
                "Ульта",
                "Атака"
              ],
              "artifacts": [
                {
                  "artifact_name": "Эмблема рассечённой судьбы",
                  "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Электро ДПС",
                  "artifact_circlet": "Крит Шанс / Крит Урон",
                  "artifact_sands": "Сила Атаки / Восстановление Энергии"
                }
              ],
              "weapon_best": {
                "weapon_name": "Волчья погибель",
                "weapon_url": "https://paimon.moe/images/weapons/wolfs_gravestone.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Акуомару",
                  "weapon_url": "https://paimon.moe/images/weapons/akuoumaru.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Меч драконьей кости",
                  "weapon_url": "https://paimon.moe/images/weapons/serpent_spine.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Кацурагикири Нагамаса",
                  "weapon_url": "https://paimon.moe/images/weapons/katsuragikiri_nagamasa.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "yt5KLzFzres"
            }
        """.trimIndent()
}
