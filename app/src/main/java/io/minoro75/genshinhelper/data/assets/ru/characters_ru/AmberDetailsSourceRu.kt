package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object AmberDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
            {
              "name": "Эмбер",
              "rarity": 4,
              "element": "pyro",
              "weapon": "bow",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c6/Character_Amber_Thumb.png",
              "talents_books": {
                "book_name": "о Свободе",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
                "book_days": "Понедельник/Четверг/Воскресенье"
              },
              "weekly_boss_item": {
                "boss_item_name": "Вздох Двалина",
                "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/07/Item_Dvalin%27s_Sigh.png"
              },
              "talents_priority": [
                "Ульта",
                "Скилл",
                "Атака"
              ],
              "artifacts": [
                {
                  "artifact_name": "Эмблема рассечённой судьбы",
                  "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Пиро ДПС",
                  "artifact_circlet": "Крит Шанс / Крит Урон",
                  "artifact_sands": "Сила атаки"
                }
              ],
              "weapon_best": {
                "weapon_name": "Элегия погибели",
                "weapon_url": "https://paimon.moe/images/weapons/elegy_for_the_end.png",
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
                  "weapon_name": "Боевой лук Фавония",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_warbow.png",
                  "weapon_rarity": 4
                }
              ]
            }
        """.trimIndent()
}
