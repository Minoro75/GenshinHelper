package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object XinyanDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Сіньянь",
          "rarity": 4,
          "element": "pyro",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/24/Xinyan_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "про Золото",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_Philosophies_of_Gold.png",
            "book_days": "Середа/Субота/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Ріг небесного кита",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1c/Item_Tusk_of_Monoceros_Caeli.png"
          },
          "talents_priority": [
            "Атака",
            "Ульта",
            "Навичка"
          ],
          "artifacts": [
            {
              "artifact_name": "Блідий вогонь",
              "artifact_url": "https://paimon.moe/images/artifacts/pale_flame_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Фіз. ДПС",
              "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг ",
              "artifact_sands": "Сила Атаки% / Відновлення енергії"
            },
             {
              "artifact_name": "Криваве лицарство",
              "artifact_url": "https://paimon.moe/images/artifacts/bloodstained_chivalry_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Фіз. ДПС",
              "artifact_circlet": "Кріт. Шанс / Кріт. Дамаг ",
              "artifact_sands": "Сила Атаки% / Відновлення енергії"
            }
          ],
          "weapon_best": {
            "weapon_name": "Червонорогий Каменомолотник",
            "weapon_url": "https://paimon.moe/images/weapons/redhorn_stonethresher.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Небесна гордість",
              "weapon_url": "https://paimon.moe/images/weapons/skyward_pride.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Снігова могила срібної зірки",
              "weapon_url": "https://paimon.moe/images/weapons/snow-tombed_starsilver.png",
              "weapon_rarity": 4
            },
            {
             "weapon_name": "Прототип: Архаїчний",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_archaic.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "WccCde5SXEc"
        }
    """.trimIndent()
}