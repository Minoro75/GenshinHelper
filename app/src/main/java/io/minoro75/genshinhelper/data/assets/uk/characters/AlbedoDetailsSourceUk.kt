package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object AlbedoDetailsSourceUk {

    /** last updated at 07.09.2022 **/

    @Language("JSON")
    val details = """
        {
          "name": "Альбедо",
          "rarity": 5,
          "element": "geo",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/00/Character_Albedo_Thumb.png",
          "talents_books": {
            "book_name": "про Поезію",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7e/Item_Philosophies_of_Ballad.png",
            "book_days": "Середа/Субота/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Ріг небесного кита",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1c/Item_Tusk_of_Monoceros_Caeli.png"
          },
          "talents_priority": [
            "Навичка",
            "Ульта",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Пробудження від сну",
              "artifact_url": "https://paimon.moe/images/artifacts/husk_of_opulent_dreams_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Гео ДПС",
              "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг",
              "artifact_sands": "Захист"
            }
          ],
          "weapon_best": {
            "weapon_name": "Кіноварне веретено",
            "weapon_url": "https://paimon.moe/images/weapons/cinnabar_spindle.png",
            "weapon_rarity": 4
          },
          "weapons_replacements": [
            {
              "weapon_name": "Вісник світанку",
              "weapon_url": "https://paimon.moe/images/weapons/harbinger_of_dawn.png",
              "weapon_rarity": 3
            },
            {
              "weapon_name": "Нефритовий вир",
              "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_cutter.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Вісник світанку",
              "weapon_url": "https://paimon.moe/images/weapons/harbinger_of_dawn.png",
              "weapon_rarity": 3
            }
          ],
           "video_guide": "2J7lCVNvqPM"
        }
    """.trimIndent()
}