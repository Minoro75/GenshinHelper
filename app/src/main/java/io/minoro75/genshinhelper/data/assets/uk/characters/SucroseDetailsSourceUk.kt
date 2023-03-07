package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object SucroseDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Цукроза",
          "rarity": 4,
          "element": "anemo",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0e/Sucrose_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "про Волю",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
            "book_days": "Понеділок/Четвер/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Душа Борея",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/81/Item_Spirit_Locket_of_Boreas.png"
          },
          "talents_priority": [
            "Навичка",
            "Ульта",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Смарагдова тінь",
              "artifact_url": "https://paimon.moe/images/artifacts/viridescent_venerer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Анемо ДПС / Майстерність стихій",
              "artifact_circlet": "Кріт. Шанс / Майстерність стихій",
              "artifact_sands": "Сила Атаки% / Майстерність стихій"
            }
          ],
          "weapon_best": {
            "weapon_name": "Фрагменти жертовного ритуалу",
            "weapon_url": "https://paimon.moe/images/weapons/sacrificial_fragments.png",
            "weapon_rarity": 4
          },
          "weapons_replacements": [
            {
              "weapon_name": "Захопливі оповідання про вбивць драконів",
              "weapon_url": "https://paimon.moe/images/weapons/thrilling_tales_of_dragon_slayers.png",
              "weapon_rarity": 3
            },
            {
              "weapon_name": "Кільце Хакушін",
              "weapon_url": "https://paimon.moe/images/weapons/hakushin_ring.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Морський атлас",
              "weapon_url": "https://paimon.moe/images/weapons/mappa_mare.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "nNpiH2KwB70"
        }
    """.trimIndent()
}