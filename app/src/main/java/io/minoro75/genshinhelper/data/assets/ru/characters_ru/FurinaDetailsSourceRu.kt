package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object FurinaDetailsSourceRu {
    @Language("JSON")
    val details = """
        {
          "name": "Фурина",
          "rarity": 5,
          "element": "hydro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e6/Furina_Icon.png/revision/latest",
          "talents_books": {
           "book_name": "о Справедливости",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/37/Item_Philosophies_of_Justice.png",
            "book_days": "Вторник/Пятница/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Тёмная масса",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/ae/Item_Lightless_Mass.png/revision/latest"
          },
          "talents_priority": [
            "Скилл",
            "Ульта",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Золотая труппа",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/4d/Item_Golden_Song%27s_Variation.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Здоровье%",
              "artifact_circlet": "Крит. шанс / Крит. урон",
              "artifact_sands": "Здоровье%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Блеск тихих вод",
            "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/4f/Weapon_Splendor_of_Tranquil_Waters.png/revision/latest",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Ключ Хадж-нисут",
              "weapon_url": "https://paimon.moe/images/weapons/key_of_khaj-nisut.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Волчий клык",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e3/Weapon_Wolf-Fang.png/revision/latest",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Перевозчик Флёв Сандр",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7e/Weapon_Fleuve_Cendre_Ferryman.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "mx94G3rkGGY"
        }
    """.trimIndent()
}