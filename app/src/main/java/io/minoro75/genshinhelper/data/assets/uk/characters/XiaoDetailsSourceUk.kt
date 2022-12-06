package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object XiaoDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Сяо",
          "rarity": 5,
          "element": "anemo",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b9/Character_Xiao_Thumb.png",
          "talents_books": {
            "book_name": "про Процвітання",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bd/Item_Philosophies_of_Prosperity.png",
            "book_days": "Понеділок/Четвер/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Тінь воїна",
            "boss_item_url": "https://paimon.moe/images/items/shadow_of_the_warrior.png"
          },
          "talents_priority": [
            "Атака",
            "Ульта",
            "Навичка"
          ],
          "artifacts": [
            {
              "artifact_name": "Відродження кіноварні",
              "artifact_url": "https://paimon.moe/images/artifacts/vermillion_hereafter_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Анемо ДПС",
              "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг ",
              "artifact_sands": "Сила Атаки%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Шуліка з тонкого нефриту",
            "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_winged-spear.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Посох Хоми",
              "weapon_url": "https://paimon.moe/images/weapons/staff_of_homa.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Смертельний бій",
              "weapon_url": "https://paimon.moe/images/weapons/deathmatch.png",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Спис Фавонія",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "xHpeqEvAxEM"
        }
    """.trimIndent()
}