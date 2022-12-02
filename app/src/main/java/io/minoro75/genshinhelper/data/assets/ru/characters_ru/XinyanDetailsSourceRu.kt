package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object XinyanDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Синь Янь",
          "rarity": 4,
          "element": "pyro",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9d/Character_Xinyan_Thumb.png",
          "talents_books": {
            "book_name": "о Золоте",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_Philosophies_of_Gold.png",
            "book_days": "Среда/Суббота/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Рог небесного кита",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1c/Item_Tusk_of_Monoceros_Caeli.png"
          },
          "talents_priority": [
            "Атака",
            "Ульта",
            "Скилл"
          ],
          "artifacts": [
            {
              "artifact_name": "Бледный огонь",
              "artifact_url": "https://paimon.moe/images/artifacts/pale_flame_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Физический ДПС",
              "artifact_circlet": "Крит шанс / Крит урон",
              "artifact_sands": "Сила атаки / Восстановление энергии"
            },
             {
              "artifact_name": "Рыцарь крови",
              "artifact_url": "https://paimon.moe/images/artifacts/bloodstained_chivalry_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Физический ДПС",
              "artifact_circlet": "Крит шанс / Крит урон",
              "artifact_sands": "Сила атаки / Восстановление энергии"
            }
          ],
          "weapon_best": {
            "weapon_name": "Кроснорогий камнеруб",
            "weapon_url": "https://paimon.moe/images/weapons/redhorn_stonethresher.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Небесное величие",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_pride.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Заснеженное звёздное серебро",
              "weapon_url": "https://paimon.moe/images/weapons/snow-tombed_starsilver.png",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Прототип: Архаичный",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_archaic.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "TQeQE2-AGFc"
        }
    """.trimIndent()
}