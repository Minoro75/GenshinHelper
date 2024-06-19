package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object GamingDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Га Мін",
          "rarity": 4,
          "element": "pyro",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/77/Gaming_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "про Процвітання",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bd/Item_Philosophies_of_Prosperity.png",
            "book_days": "Понеділок/Четвер/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Безпросвітна матерія",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/ae/Item_Lightless_Mass.png/revision/latest"
          },
          "talents_priority": [
            "Скілл",
            "Ульта",
            "Атака"
            
          ],
          "artifacts": [
            {
              "artifact_name": "Фантомний мисливець",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8d/Item_Hunter%27s_Brooch.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Піро ДПС",
              "artifact_circlet": "Кріт дамаг",
              "artifact_sands": "Майстерність стихій"
            }
          ],
          "weapon_best": {
            "weapon_name": "Кістковий меч",
              "weapon_url": "https://paimon.moe/images/weapons/serpent_spine.png",
              "weapon_rarity": 4
          },
          "weapons_replacements": [
            {
                "weapon_name": "Червонорогий Каменомолотник",
                "weapon_url": "https://paimon.moe/images/weapons/redhorn_stonethresher.png",
                "weapon_rarity": 5
            },
            {
              "weapon_name": "Квітка в латах",
              "weapon_url": "https://paimon.moe/images/weapons/mailed_flower.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Тінь прибою",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/69/Weapon_Tidal_Shadow.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "aG8ZxiQkSsM"
        }
    """.trimIndent()
}
