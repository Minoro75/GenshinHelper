package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object EulaDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Эола",
          "rarity": 5,
          "element": "cryo",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d3/Character_Eula_Thumb.png",
          "talents_books": {
            "book_name": "о Борьбе",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0b/Item_Philosophies_of_Resistance.png",
            "book_days": "ВТО/ПЯТ/ВОС"
          },
          "weekly_boss_item": {
            "boss_item_name": "Корона лорда драконов",
            "boss_item_url": "https://paimon.moe/images/items/dragon_lords_crown.png"
          },
          "talents_priority": [
            "Ульта",
            "Атака",
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
            "weapon_name": "Песнь разбитых сосен",
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
              "weapon_name": "Заснеженное звёздное серебро",
              "weapon_url": "https://paimon.moe/images/weapons/snow-tombed_starsilver.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}
