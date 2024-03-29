package io.minoro75.genshinhelper.data.assets.en.characters

import org.intellij.lang.annotations.Language

object AlbedoDetailsSource {

    /** last updated at 07.09.2022 **/

    @Language("JSON")
    val details = """
        {
          "name": "Albedo",
          "rarity": 5,
          "element": "geo",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/30/Albedo_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Ballad",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7e/Item_Philosophies_of_Ballad.png",
            "book_days": "Wednesday/Saturday/Sunday"
          },
          "weekly_boss_item": {
            "boss_item_name": "Tusk of Monoceros Caeli",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1c/Item_Tusk_of_Monoceros_Caeli.png"
          },
          "talents_priority": [
            "Skill",
            "Burst",
            "Attack"
          ],
          "artifacts": [
            {
              "artifact_name": "Husk of Opulent Dreams",
              "artifact_url": "https://paimon.moe/images/artifacts/husk_of_opulent_dreams_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Geo DPS",
              "artifact_circlet": "Crit Rate / Crit DMG",
              "artifact_sands": "DEF%"
            }
          ],
          "weapon_best": {
            "weapon_name": "Cinnabar Spindle",
            "weapon_url": "https://paimon.moe/images/weapons/cinnabar_spindle.png",
            "weapon_rarity": 4
          },
          "weapons_replacements": [
            {
              "weapon_name": "Harbinger of Dawn",
              "weapon_url": "https://paimon.moe/images/weapons/harbinger_of_dawn.png",
              "weapon_rarity": 3
            },
            {
              "weapon_name": "Primordial Jade Cutter",
              "weapon_url": "https://paimon.moe/images/weapons/primordial_jade_cutter.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Harbinger of Dawn",
              "weapon_url": "https://paimon.moe/images/weapons/harbinger_of_dawn.png",
              "weapon_rarity": 3
            }
          ],
           "video_guide": "2J7lCVNvqPM"
        }
    """.trimIndent()
}