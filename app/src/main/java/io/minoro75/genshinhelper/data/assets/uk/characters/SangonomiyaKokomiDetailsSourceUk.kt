package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object SangonomiyaKokomiDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Сангономія Кокомі",
          "rarity": 5,
          "element": "hydro",
          "weapon": "catalyst",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/cc/Character_Sangonomiya_Kokomi_Thumb.png",
          "talents_books": {
            "book_name": "про Швидкоплинність",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/27/Item_Philosophies_of_Transience.png",
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
              "artifact_name": "Непохитність Міллелітів",
              "artifact_url": "https://paimon.moe/images/artifacts/tenacity_of_the_millelith_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Здоровʼя%",
              "artifact_circlet": "Бонус хілінгу",
              "artifact_sands": "Відновлення енергії / Здоровʼя%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Захопливі оповідання про вбивць драконів",
            "weapon_url": "https://paimon.moe/images/weapons/thrilling_tales_of_dragon_slayers.png",
            "weapon_rarity": 3
          },
          "weapons_replacements": [
            {
              "weapon_name": "Прототип: Бурштин",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_amber.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Вічне місячне сяво",
              "weapon_url": "https://paimon.moe/images/weapons/everlasting_moonglow.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Кільце Хакушін",
              "weapon_url": "https://paimon.moe/images/weapons/hakushin_ring.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "ce4DSxUZ1BM"
        }
    """.trimIndent()
}