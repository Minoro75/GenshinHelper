package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object YunJinDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Юнь Цзинь",
          "rarity": 4,
          "element": "geo",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9c/Yun_Jin_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "об Усердии",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
            "book_days": "Вторник/Пятница/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Пепельное сердце",
            "boss_item_url": "https://paimon.moe/images/items/ashen_heart.png"
          },
          "talents_priority": [
            "Ульта",
            "Скилл",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Кокон сладких грёз",
              "artifact_url": "https://paimon.moe/images/artifacts/husk_of_opulent_dreams_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Защита",
              "artifact_circlet": "Защита / Крит шанс",
              "artifact_sands": "Защита / Восстановление энергии"
            }
          ],
          "weapon_best": {
            "weapon_name": "Сияющая жатва",
            "weapon_url": "https://paimon.moe/images/weapons/engulfing_lightning.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
            "weapon_name": "Копьё Фавония",
            "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
            "weapon_rarity": 4
            },
            {
              "weapon_name": "Улов",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Прототип: Звёздный блеск",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_starglitter.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "dqRQ2baD_e0"
        }
    """.trimIndent()
}