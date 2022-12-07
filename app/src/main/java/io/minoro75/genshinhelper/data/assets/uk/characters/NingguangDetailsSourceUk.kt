package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object NingguangDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Нінгуан",
          "rarity": 4,
          "element": "geo",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/2b/Character_Ningguang_Thumb.png",
          "talents_books": {
            "book_name": "про Процвітання",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bd/Item_Philosophies_of_Prosperity.png",
            "book_days": "Понеділок/Четвер/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Душа Борея",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/81/Item_Spirit_Locket_of_Boreas.png"
          },
          "talents_priority": [
            "Атака",
            "Ульта",
            "Навичка"
          ],
          "artifacts": [
            {
              "artifact_name": "Архаїчний камінь",
              "artifact_url": "https://paimon.moe/images/artifacts/archaic_petra_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Гео ДПС",
              "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг",
              "artifact_sands": "Сила Атаки%"
            },
            {
              "artifact_name": "Церемонія поховання гладіатора",
              "artifact_url": "https://paimon.moe/images/artifacts/gladiators_finale_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Гео ДПС",
              "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг",
              "artifact_sands": "Сила Атаки%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Загублені молитви священим вітрам",
            "weapon_url": "https://paimon.moe/images/weapons/lost_prayer_to_the_sacred_winds.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Небесний атлас",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_atlas.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Сонячна перлина",
              "weapon_url": "https://paimon.moe/images/weapons/solar_pearl.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Морський атлас",
              "weapon_url": "https://paimon.moe/images/weapons/mappa_mare.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": null
        }
    """.trimIndent()
}