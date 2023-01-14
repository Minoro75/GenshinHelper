package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object NoelleDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Ноэлль",
          "rarity": 4,
          "element": "geo",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8e/Noelle_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "о Борьбе",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0b/Item_Philosophies_of_Resistance.png",
            "book_days": "Вторник/Пятница/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Коготь Двалина",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a8/Item_Dvalin%27s_Claw.png"
          },
          "talents_priority": [
            "Атака",
            "Ульта",
            "Скил"
          ],
          "artifacts": [
            {
              "artifact_name": "Кокон сладких грёз",
              "artifact_url": "https://paimon.moe/images/artifacts/husk_of_opulent_dreams_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Гео ДПС",
              "artifact_circlet": "Крит шанс / Крит урон",
              "artifact_sands": "Защита / Сила атаки"
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
              "weapon_name": "Меч драконьей кости",
              "weapon_url": "https://paimon.moe/images/weapons/serpent_spine.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Белая тень",
              "weapon_url": "https://paimon.moe/images/weapons/whiteblind.png",
              "weapon_rarity": 4
            }
          ],
         "video_guide": "tUJUGeyKLCo"
        }
    """.trimIndent()
}