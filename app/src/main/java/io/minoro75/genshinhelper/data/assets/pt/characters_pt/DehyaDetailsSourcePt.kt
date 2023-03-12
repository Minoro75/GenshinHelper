package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object DehyaDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Dehya",
          "rarity": 5,
          "element": "pyro",
          "weapon": "claymore",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/3f/Dehya_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Praxis",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/82/Item_Philosophies_of_Praxis.png",
            "book_days": "Wednesday/Saturday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Puppet Strings",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f2/Item_Puppet_Strings.png"
          },
          "talents_priority": [
            "Skill",
            "Burst",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Tenacity of the Millelith",
              "artifact_url": "https://paimon.moe/images/artifacts/tenacity_of_the_millelith_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "HP%",
              "artifact_circlet": "HP%",
              "artifact_sands": "HP%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Wolf's Gravestone",
            "weapon_url": "https://paimon.moe/images/weapons/wolfs_gravestone.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Favonius Greatsword",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_greatsword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "The Bell",
              "weapon_url": "https://paimon.moe/images/weapons/the_bell.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Katsuragikiri Nagamasa",
              "weapon_url": "https://paimon.moe/images/weapons/katsuragikiri_nagamasa.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "zv4bdZW-lQA"
        }
    """.trimIndent()
}
