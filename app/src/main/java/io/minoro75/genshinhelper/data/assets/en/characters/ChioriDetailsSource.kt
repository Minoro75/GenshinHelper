package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object ChioriDetailsSource {
    @Language("JSON")
    val details = """
        {
          "name": "Chiori",
          "rarity": 5,
          "element": "geo",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/88/Chiori_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Light",
             "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/95/Item_Philosophies_of_Light.png",
            "book_days": "Wednesday/Saturday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Lightless Silk String",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Lightless_Silk_String.png/revision/latest"
          },
          "talents_priority": [
            "Skill",
            "Burst",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Golden Troupe",
              "artifact_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/4d/Item_Golden_Song%27s_Variation.png/revision/latest",
              "artifact_amount": 4,
              "artifact_gobelet": "Geo DPS",
              "artifact_circlet": "CRIT Rate / CRIT DMG",
              "artifact_sands": "DEF% / ATK%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Uraku Misugiri",
            "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/44/Weapon_Uraku_Misugiri.png/revision/latest",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Primordial Jade Cutter",
              "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_cutter.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Mistsplitter Reforged",
              "weapon_url": "https://paimon.moe/images/weapons/mistsplitter_reforged.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Flute of Ezpitzal",
              "weapon_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/31/Weapon_Flute_of_Ezpitzal.png/revision/latest",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "QeCsTWMFrmg"
        }
    """.trimIndent()
}