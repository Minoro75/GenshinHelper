package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object ColleiDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
            {
              "name": "Коллеи",
              "rarity": 4,
              "element": "dendro",
              "weapon": "bow",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9e/Character_Collei_Thumb.png",
              "talents_books": {
                "book_name": "о Честности",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/82/Item_Philosophies_of_Praxis.png",
                "book_days": "Среда/Суббота/Воскресенье"
              },
              "weekly_boss_item": {
                "boss_item_name": "Слёзы очищения божества бедствий",
                "boss_item_url": "https://paimon.moe/images/items/tears_of_the_calamitous_god.png"
              },
              "talents_priority": [
                "Ульта",
                "Скилл",
                "Атака"
              ],
              "artifacts": [
                {
                  "artifact_name": "Воспоминания дремучего леса",
                  "artifact_url": "https://paimon.moe/images/artifacts/deepwood_memories_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Дендро ДПС",
                  "artifact_circlet": "Крит шанс / Крит урон",
                  "artifact_sands": "Восстановление энергии / Сила атаки"
                }
              ],
              "weapon_best": {
                "weapon_name": "Полярная звезда",
                "weapon_url": "https://paimon.moe/images/weapons/polar_star.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Элегия погибели",
                  "weapon_url": "https://paimon.moe/images/weapons/elegy_for_the_end.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Аква симулякрум",
                  "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Боевой лук Фавония",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_warbow.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "1fJQAhwQ-j4"
            }
        """.trimIndent()
}
