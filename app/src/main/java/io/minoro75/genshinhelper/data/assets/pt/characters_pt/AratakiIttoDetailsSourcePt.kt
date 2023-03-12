package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object AratakiIttoDetailsSourcePt {
    @Language("JSON")
    val details = """
            {
              "name": "Arataki Itto",
              "rarity": 5,
              "element": "geo",
              "weapon": "claymore",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7b/Arataki_Itto_Icon.png/revision/latest",
              "talents_books": {
                "book_name": "Elegance",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/6f/Item_Philosophies_of_Elegance.png",
                "book_days": "Tuesday/Friday/Sunday"
              },
              "weekly_boss_item": {
                "boss_item_name": "Ashen Heart",
                "boss_item_url": "https://paimon.moe/images/items/ashen_heart.png"
              },
              "talents_priority": [
                "Attack",
                "Burst",
                "Skill"
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
                "weapon_name": "Redhorn Stonethresher",
                "weapon_url": "https://paimon.moe/images/weapons/redhorn_stonethresher.png",
                "weapon_rarity": 5
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Skyward Pride",
                  "weapon_url": "https://paimon.moe/images/weapons/skyward_pride.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Serpent Spine",
                  "weapon_url": "https://paimon.moe/images/weapons/serpent_spine.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Whiteblind",
                  "weapon_url": "https://paimon.moe/images/weapons/whiteblind.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "KLvivxNQJj0"
            }
        """.trimIndent()
}
