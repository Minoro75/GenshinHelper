package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object ShenheDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Шеньхе",
          "rarity": 5,
          "element": "cryo",
          "weapon": "polearm",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/58/Character_Shenhe_Thumb.png",
          "talents_books": {
            "book_name": "про Процвітання",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bd/Item_Philosophies_of_Prosperity.png",
            "book_days": "Понеділок/Четвер/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Метелик пекельного вогню",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/16/Item_Hellfire_Butterfly.png"
          },
          "talents_priority": [
            "Навичка",
            "Ульта",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Церемонія поховання гладіатора",
              "artifact_url": "https://paimon.moe/images/artifacts/gladiators_finale_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Сила Атаки%",
              "artifact_circlet": "Сила Атаки%",
              "artifact_sands": "Сила Атаки% / Відновлення енергії"
            },
            {
              "artifact_name": "Спогади Шіменави",
              "artifact_url": "https://paimon.moe/images/artifacts/shimenawas_reminiscence_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Сила Атаки%",
              "artifact_circlet": "Сила Атаки%",
              "artifact_sands": "Сила Атаки% / Відновлення енергії"
            }
          ],
          "weapon_best": {
            "weapon_name": "Припинення катастрофи",
            "weapon_url": "https://paimon.moe/images/weapons/calamity_queller.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Блискавка травокосу",
              "weapon_url": "https://paimon.moe/images/weapons/engulfing_lightning.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Спис Фавонія",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_lance.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Вилов",
              "weapon_url": "https://paimon.moe/images/weapons/the_catch.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": null
        }
    """.trimIndent()
}