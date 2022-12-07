package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object NilouDetailsSourceUk {
    @Language("JSON")
    val details = """
        {
          "name": "Нілу",
          "rarity": 5,
          "element": "hydro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a5/Character_Nilou_Thumb.png",
          "talents_books": {
            "book_name": "про Діяння",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/82/Item_Philosophies_of_Praxis.png",
            "book_days": "Середа/Субота/Неділя"
          },
          "weekly_boss_item": {
            "boss_item_name": "Сльози згубного бога",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/ef/Item_Tears_of_the_Calamitous_God.png"
          },
          "talents_priority": [
            "Навичка",
            "Ульта",
            "Атака"
          ],
          "artifacts": [
            {
              "artifact_name": "Оздоблені золотом мрії",
              "artifact_url": "https://paimon.moe/images/artifacts/gilded_dreams_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Здоровʼя%",
              "artifact_circlet": "Здоровʼя%",
              "artifact_sands": "Здоровʼя%"
            },
            {
              "artifact_name": "Непохитність Міллелітів",
              "artifact_url": "https://paimon.moe/images/artifacts/tenacity_of_the_millelith_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Здоровʼя%",
              "artifact_circlet": "Здоровʼя%",
              "artifact_sands": "Здоровʼя%"
            }
          ],
          "weapon_best": {
             "weapon_name": "Ключ Хадж-Нісута",
              "weapon_url": "https://paimon.moe/images/weapons/key_of_khaj-nisut.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Місячне сяйво Ксифоса",
            "weapon_url": "https://paimon.moe/images/weapons/xiphos_moonlight.png",
            "weapon_rarity": 4
            },
            {
              "weapon_name": "Меч жертовного ритуалу",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Меч Фавонія",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_sword.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "uTmLNSTpTrg"
        }
    """.trimIndent()
}