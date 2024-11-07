package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object ChioriDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Чіорі",
          "rarity": 5,
          "element": "geo",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/88/Chiori_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "про Світло",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/95/Item_Philosophies_of_Light.png",
            "book_days": "Середа/Субота/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Безпросвітна шовкова нить",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Lightless_Silk_String.png/revision/latest"
          },
          "talents_priority": [
            "Навичка",
            "Ульта",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Золота трупа",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/4d/Item_Golden_Song%27s_Variation.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Гео ДПС",
              "artifact_circlet": "Кріт. шанс / Кріт. дамаг",
              "artifact_sands": "Захист% / ДПС%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Ураку Місугірі",
            "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/44/Weapon_Uraku_Misugiri.png/revision/latest",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Нефритовий різак",
              "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_cutter.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Відблиск туману",
              "weapon_url": "https://paimon.moe/images/weapons/mistsplitter_reforged.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Флейта Езпіцаль",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/31/Weapon_Flute_of_Ezpitzal.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "nTCbk7bsQu0"
        }
    """.trimIndent()
}