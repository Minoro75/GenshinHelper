package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object SayuDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Саю",
          "rarity": 5,
          "element": "anemo",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/22/Sayu_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "про Світло",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/95/Item_Philosophies_of_Light.png",
            "book_days": "Середа/Субота/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Позолочена луска",
            "boss_item_url": "https://paimon.moe/images/items/gilded_scale.png"
          },
          "talents_priority": [
            "Ульта",
            "Навичка",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Смарагдова тінь",
              "artifact_url": "https://paimon.moe/images/artifacts/viridescent_venerer_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Майстерність стихій",
              "artifact_circlet": "Майстерність стихій / Бонус хілінгу",
              "artifact_sands": "Відновлення енергії / Майстерність стихій"
            }
          ],
          "weapon_best": {
            "weapon_name": "Вовчий надгробок",
            "weapon_url": "https://paimon.moe/images/weapons/wolfs_gravestone.png",
            "weapon_rarity": 5
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
          "video_guide": "bTwTBRcGkSk"
        }
    """.trimIndent()
}