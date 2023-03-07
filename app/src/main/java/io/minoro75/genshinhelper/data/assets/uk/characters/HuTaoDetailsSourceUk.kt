package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object HuTaoDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Ху Тао",
          "rarity": 5,
          "element": "pyro",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e9/Hu_Tao_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "про Старанність",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
            "book_days": "Вівторок/Пʼятниця/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Фрагмент леза диявола",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/48/Item_Shard_of_a_Foul_Legacy.png"
          },
          "talents_priority": [
            "Атака",
            "Навичка",
            "Ульта"
          ],
          "artifacts": [
            {
              "artifact_name": "Вогняна відьма",
              "artifact_url": "https://paimon.moe/images/artifacts/crimson_witch_of_flames_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Піро ДПС",
              "artifact_circlet": "Кріт. Дамаг / Кріт. Шанс",
              "artifact_sands": "Здоровʼя%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Посох Хоми",
            "weapon_url": "https://paimon.moe/images/weapons/staff_of_homa.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Шуліка з тонкого нефриту",
              "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_winged-spear.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Смертельний бій",
              "weapon_url": "https://paimon.moe/images/weapons/deathmatch.png",
              "weapon_rarity": 4
            },
           {
              "weapon_name": "Вбивця драконів",
              "weapon_url": "https://paimon.moe/images/weapons/dragons_bane.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "ZnWxCukX7hk"
        }
    """.trimIndent()
}