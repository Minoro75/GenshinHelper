package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object NilouDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Nilou",
          "rarity": 5,
          "element": "hydro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/58/Nilou_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Praxis",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/82/Item_Philosophies_of_Praxis.png",
            "book_days": "Wednesday/Saturday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Tears of the Calamitous God",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/ef/Item_Tears_of_the_Calamitous_God.png"
          },
          "talents_priority": [
            "Skill",
            "Burst",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Gilded Dreams",
              "artifact_url": "https://paimon.moe/images/artifacts/gilded_dreams_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "HP%",
              "artifact_circlet": "HP%",
              "artifact_sands": "HP%"
            },
            {
              "artifact_name": "Tenacity of the Millelith",
              "artifact_url": "https://paimon.moe/images/artifacts/tenacity_of_the_millelith_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "HP%",
              "artifact_circlet": "HP%",
              "artifact_sands": "HP%"
            }
          ],
          "weapon_best": {
             "weapon_name": "Key of Khaj-Nisut",
              "weapon_url": "https://paimon.moe/images/weapons/key_of_khaj-nisut.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Xiphos' Moonlight",
            "weapon_url": "https://paimon.moe/images/weapons/xiphos_moonlight.png",
            "weapon_rarity": 4
            },
            {
              "weapon_name": "Sacrificial Sword",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Favonius Sword",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_sword.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "XzQVe6zA9ug"
        }
    """.trimIndent()
}