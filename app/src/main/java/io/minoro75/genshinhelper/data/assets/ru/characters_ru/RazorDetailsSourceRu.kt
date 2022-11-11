package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object RazorDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Рэйзор",
          "rarity": 4,
          "element": "electro",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1d/Character_Razor_Thumb.png",
          "talents_books": {
            "book_name": "о Борьбе",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0b/Item_Philosophies_of_Resistance.png",
            "book_days": "Вторник/Пятница/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Коготь двалина",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a8/Item_Dvalin%27s_Claw.png"
          },
          "talents_priority": [
            "Атака",
            "Ульта",
            "Скилл"
          ],
          "artifacts": [
            {
              "artifact_name": "Бледный огонь",
              "artifact_url": "https://paimon.moe/images/artifacts/pale_flame_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Физический ДПС",
              "artifact_circlet": "Крит шанс / Крит урон",
              "artifact_sands": "Сила атаки"
            }
          ],
          "weapon_best": {
            "weapon_name": "Песнь рабитых сосен",
            "weapon_url": "https://paimon.moe/images/weapons/song_of_broken_pines.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Волчья погибель",
              "weapon_url": "https://paimon.moe/images/weapons/wolfs_gravestone.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Меч драконьей кости",
              "weapon_url": "https://paimon.moe/images/weapons/serpent_spine.png",
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