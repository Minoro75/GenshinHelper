package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object AlbedoDetailsSourceRu {

    /** last updated at 07.09.2022 **/

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Альбедо",
          "rarity": 5,
          "element": "geo",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/00/Character_Albedo_Thumb.png",
          "talents_books": {
            "book_name": "Баллады",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7e/Item_Philosophies_of_Ballad.png",
            "book_days": "СРЕ/СУБ/ВОС"
          },
          "weekly_boss_item": {
            "boss_item_name": "Рог небесного кита",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1c/Item_Tusk_of_Monoceros_Caeli.png"
          },
          "talents_priority": [
            "Скилл",
            "Ульта",
            "Аттака"
          ],
          "artifacts": [
            {
              "artifact_name": "Кокон сладких грез",
              "artifact_url": "https://paimon.moe/images/artifacts/husk_of_opulent_dreams_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Гео ДПС",
              "artifact_circlet": "Крит Шанс / Крит Урон",
              "artifact_sands": "Защита"
            }
          ],
          "weapon_best": {
            "weapon_name": "Киноварное веретено",
            "weapon_url": "https://paimon.moe/images/weapons/cinnabar_spindle.png",
            "weapon_rarity": 4
          },
          "weapons_replacements": [
            {
              "weapon_name": "Предвестник зари",
              "weapon_url": "https://paimon.moe/images/weapons/harbinger_of_dawn.png",
              "weapon_rarity": 3
            },
            {
              "weapon_name": "Драгоценный омут",
              "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_cutter.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Предвестник зари",
              "weapon_url": "https://paimon.moe/images/weapons/harbinger_of_dawn.png",
              "weapon_rarity": 3
            }
          ]
        }
    """.trimIndent()
}