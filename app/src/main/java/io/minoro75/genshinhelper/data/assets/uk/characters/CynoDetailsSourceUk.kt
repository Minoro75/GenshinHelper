package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object CynoDetailsSourceUk {
    @Language("JSON")
    val details = """
            {
              "name": "Сайно",
              "rarity": 5,
              "element": "electro",
              "weapon": "polearm",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d1/Character_Cyno_Thumb.png",
              "talents_books": {
                "book_name": "про Напоумлення",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9b/Item_Philosophies_of_Admonition.png",
                "book_days": "Понеділок/Четвер/Неділя"
              },
              "weekly_boss_item": {
                "boss_item_name": "Всевидяча рука зловісного генералу",
                "boss_item_url": "https://paimon.moe/images/items/mudra_of_the_malefic_general.png"
              },
              "talents_priority": [
                "Ульта",
                "Навичка",
                "Атака"
              ],
              "artifacts": [
                {
                  "artifact_name": "Лють грому",
                  "artifact_url": "https://paimon.moe/images/artifacts/thundering_fury_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Електро ДПС",
                  "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг",
                  "artifact_sands": "Майстерність стихій / Сила Атаки%"
                }
              ],
              "weapon_best": {
                "weapon_name": "Посох багряних пісків",
                "weapon_url": "https://paimon.moe/images/weapons/staff_of_the_scarlet_sands.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Шуліка з тонкого нефриту",
                  "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_winged-spear.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Смертельний бій",
                  "weapon_url": "https://paimon.moe/images/weapons/deathmatch.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Біла китиця",
                  "weapon_url": "https://paimon.moe/images/weapons/white_tassel.png",
                  "weapon_rarity": 3
                }
              ],
             "video_guide": "qRRc0R1pPVQ"
            }
        """.trimIndent()
}