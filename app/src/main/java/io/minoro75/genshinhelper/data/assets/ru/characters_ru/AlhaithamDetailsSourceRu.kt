package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object AlhaithamDetailsSourceRu {
    @Language("JSON")
    val details = """
        {
          "name": "Аль-Хайтам",
          "rarity": 5,
          "element": "dendro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/2c/Alhaitham_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "об Остроумии",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Item_Philosophies_of_Ingenuity.png",
            "book_days": "Вторник/Пятница/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Зеркало Мусин",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/ee/Item_Mirror_of_Mushin.png"
          },
          "talents_priority": [
            "Скилл",
            "Ульта",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Воспоминания дремучего леса",
              "artifact_url": "https://paimon.moe/images/artifacts/deepwood_memories_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Dendro DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "Elemental Mastery"
            }
          ],
          "weapon_best": {
             "weapon_name": "Свет лиственного разреза",
              "weapon_url": "https://paimon.moe/images/weapons/light_of_foliar_incision.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
            "weapon_name": "Харан гэппаку фуцу",
            "weapon_url": "https://paimon.moe/images/weapons/haran_geppaku_futsu.png",
            "weapon_rarity": 5
            },
            {
              "weapon_name": "Рассекающий туман",
              "weapon_url": "https://paimon.moe/images/weapons/mistsplitter_reforged.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Предвестник зари",
              "weapon_url": "https://paimon.moe/images/weapons/harbinger_of_dawn.png",
              "weapon_rarity": 3
            }
          ],
         "video_guide": "4c8Wu8syN1M"
        }
    """.trimIndent()
}