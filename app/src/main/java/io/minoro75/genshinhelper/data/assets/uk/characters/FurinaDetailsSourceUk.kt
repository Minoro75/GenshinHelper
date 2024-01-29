package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object FurinaDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Фуріна",
          "rarity": 5,
          "element": "hydro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e6/Furina_Icon.png/revision/latest",
          "talents_books": {
           "book_name": "про Справедливість",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/37/Item_Philosophies_of_Justice.png",
            "book_days": "Вівторок/Пʼятниця/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Безпросвітна матерія",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/ae/Item_Lightless_Mass.png/revision/latest"
          },
          "talents_priority": [
            "Скілл",
            "Ульта",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Золота трупа",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/4d/Item_Golden_Song%27s_Variation.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Здоровʼя%",
              "artifact_circlet": "Кріт. шанс / Кріт. урон",
              "artifact_sands": "Здоровʼя%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Велич ідилічних вод",
            "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/4f/Weapon_Splendor_of_Tranquil_Waters.png/revision/latest",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Ключ Хадж-нісут",
              "weapon_url": "https://paimon.moe/images/weapons/key_of_khaj-nisut.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Волче ікло",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e3/Weapon_Wolf-Fang.png/revision/latest",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Паромник Флев Сандр",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7e/Weapon_Fleuve_Cendre_Ferryman.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "ES-3n3Jt2Zo"
        }
    """.trimIndent()
}