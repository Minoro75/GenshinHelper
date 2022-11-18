package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object TighnariDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Тигнари",
          "rarity": 5,
          "element": "dendro",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/91/Character_Tighnari_Thumb.png",
          "talents_books": {
            "book_name": "о Наставлениях",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9b/Item_Philosophies_of_Admonition.png",
            "book_days": "Понедельник/Четверг/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Смысл эонов",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c9/Item_The_Meaning_of_Aeons.png"
          },
          "talents_priority": [
            "Атака",
            "Ульта",
            "Скилл"
          ],
          "artifacts": [
            {
              "artifact_name": "Воспоминания дремучего леса",
              "artifact_url": "https://paimon.moe/images/artifacts/deepwood_memories_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Дендро ДПС",
              "artifact_circlet": "Крит шанс / Крит урон ",
              "artifact_sands": "Сила атаки / Мастерство стихий"
            }
          ],
          "weapon_best": {
            "weapon_name": "Охотничья тропа",
            "weapon_url": "https://paimon.moe/images/weapons/hunters_path.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Аква симулякрум",
              "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Зелёный лук",
              "weapon_url": "https://paimon.moe/images/weapons/the_viridescent_hunt.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Прототип: Полумесяц",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_crescent.png",
              "weapon_rarity": 4
            }
          ]
        }
    """.trimIndent()
}