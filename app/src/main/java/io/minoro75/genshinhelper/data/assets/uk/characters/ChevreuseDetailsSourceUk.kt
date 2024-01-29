package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object ChevreuseDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Шеврез",
          "rarity": 4,
          "element": "pyro",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8a/Chevreuse_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "про Порядок",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/32/Item_Philosophies_of_Order.png",
            "book_days": "Середа/Субота/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Безпросвітна шовкова нить",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Lightless_Silk_String.png/revision/latest"
          },
          "talents_priority": [
            "Скілл",
            "Ульта",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Церемонія давньої династії",
              "artifact_url": "https://paimon.moe/images/artifacts/noblesse_oblige_flower.png ",
              "artifact_amount": 4,
              "artifact_gobelet": "Здоровʼя%",
              "artifact_circlet": "Здоровʼя%",
              "artifact_sands": "Здоровʼя%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Чорна китиця",
            "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
            "weapon_rarity": 3
          },
          "weapons_replacements": [
            {
              "weapon_name": "Справедлива нагорода",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8d/Weapon_Rightful_Reward.png/revision/latest",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Спис Фавонія",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
              "weapon_rarity": 4
            },
            {
            "weapon_name": "Чорна китиця",
            "weapon_url": "https://paimon.moe/images/weapons/black_tassel.png",
            "weapon_rarity": 3
            }
          ],
         "video_guide": "RKIK5S0NtFY"
        }
    """.trimIndent()
}