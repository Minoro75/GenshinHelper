package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object HuTaoDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Ху Тао",
          "rarity": 5,
          "element": "pyro",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a4/Character_Hu_Tao_Thumb.png",
          "talents_books": {
            "book_name": "об Усердии",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
            "book_days": "Вторник/Пятница/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Осколок дьявольского меча",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/48/Item_Shard_of_a_Foul_Legacy.png"
          },
          "talents_priority": [
            "Атака",
            "Скилл",
            "Ульта"
          ],
          "artifacts": [
            {
              "artifact_name": "Горящая алая ведьма",
              "artifact_url": "https://paimon.moe/images/artifacts/crimson_witch_of_flames_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Пиро ДПС",
              "artifact_circlet": "Крит урон/ Крит шанс",
              "artifact_sands": "Здоровье"
            }
          ],
          "weapon_best": {
            "weapon_name": "Посох Хомы",
            "weapon_url": "https://paimon.moe/images/weapons/staff_of_homa.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Нефритовый коршун",
              "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_winged-spear.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Гроза драконов",
              "weapon_url": "https://paimon.moe/images/weapons/dragons_bane.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Смертельный бой",
              "weapon_url": "https://paimon.moe/images/weapons/deathmatch.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "X2mJItYYFEI"
        }
    """.trimIndent()
}