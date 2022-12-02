package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object BennettDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
            {
              "name": "Беннет",
              "rarity": 4,
              "element": "pyro",
              "weapon": "sword",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7b/Character_Bennett_Thumb.png",
              "talents_books": {
                "book_name": "о Борьбе",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0b/Item_Philosophies_of_Resistance.png",
                "book_days": "Вторник/Пятница/Воскресенье"
              },
              "weekly_boss_item": {
                "boss_item_name": "Перо из хвоста Двалина",
                "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bf/Item_Dvalin%27s_Plume.png"
              },
              "talents_priority": [
                "Ульта",
                "Скилл",
                "Атака"
              ],
              "artifacts": [
                {
                  "artifact_name": "Церемония древней знати",
                  "artifact_url": "https://paimon.moe/images/artifacts/noblesse_oblige_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Здоровье",
                  "artifact_circlet": "Бонус лечения / Здоровье",
                  "artifact_sands": "Восстановление энергии/ Здоровье"
                }
              ],
              "weapon_best": {
                "weapon_name": "Небесный меч",
                "weapon_url": "https://paimon.moe/images/weapons/skyward_blade.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Осквернённое желание",
                  "weapon_url": "https://paimon.moe/images/weapons/the_alley_flash.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Церемониальный меч",
                  "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Прототип: Злоба",
                  "weapon_url": "https://paimon.moe/images/weapons/prototype_rancour.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "AvfHFcz4vUo"
            }
        """.trimIndent()
}
