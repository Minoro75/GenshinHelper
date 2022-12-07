package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object DoriDetailsSourceUk {
    @Language("JSON")
    val details = """
            {
              "name": "Дорі",
              "rarity": 4,
              "element": "electro",
              "weapon": "claymore",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/90/Character_Dori_Thumb.png",
              "talents_books": {
                "book_name": "про Винахідливість",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Item_Philosophies_of_Ingenuity.png",
                "book_days": "Вівторок/Пʼятниця/Неділя"
              },
              "weekly_boss_item": {
                "boss_item_name": "Віть кривавого нефриту",
                "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b1/Item_Bloodjade_Branch.png"
              },
              "talents_priority": [
                "Ульта",
                "Навичка",
                "Атака"
              ],
              "artifacts": [
                {
                  "artifact_name": "Емблема відрізаної долі",
                  "artifact_url": "https://paimon.moe/images/artifacts/emblem_of_severed_fate_flower.png",
                  "artifact_amount": 2,
                  "artifact_gobelet": "Електро ДПС",
                  "artifact_circlet": "Здоровʼя%/ Бонус хілінгу%",
                  "artifact_sands": "Відновлення енергії / Здоровʼя%"
                },
                {
                  "artifact_name": "Непохитність Міллелітів",
                  "artifact_url": "https://paimon.moe/images/artifacts/tenacity_of_the_millelith_flower.png",
                  "artifact_amount": 2,
                  "artifact_gobelet": "Електро ДПС",
                  "artifact_circlet": "Здоровʼя%/ Бонус хілінгу%",
                  "artifact_sands": "Відновлення енергії / Здоровʼя%"
                }
              ],
              "weapon_best": {
                "weapon_name": "Дворучний меч жертовного ритуалу",
                "weapon_url": "https://paimon.moe/images/weapons/sacrificial_greatsword.png",
                "weapon_rarity": 4
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Небесна гордість",
                  "weapon_url": "https://paimon.moe/images/weapons/skyward_pride.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Дворучний меч Фавонія",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_greatsword.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Кацурагікірі Нагамаса",
                  "weapon_url": "https://paimon.moe/images/weapons/katsuragikiri_nagamasa.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "wxf3WF4bUYg"
            }
        """.trimIndent()
}