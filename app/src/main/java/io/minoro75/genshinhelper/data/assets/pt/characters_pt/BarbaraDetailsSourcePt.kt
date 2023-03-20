package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object BarbaraDetailsSourcePt {
    @Language("JSON")
    val details = """
            {
              "name": "Barbara",
              "rarity": 4,
              "element": "hydro",
              "weapon": "catalyst",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Barbara_Icon.png/revision/latest",
              "talents_books": {
                "book_name": "Liberdade",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
                "book_days": "Monday/Thursday/Sunday"
              },
              "weekly_boss_item": {
                "boss_item_name": "Cálice do Vento Norte",
                "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d6/Item_Ring_of_Boreas.png"
              },
              "talents_priority": [
                "Supremo",
                "Habilidade",
                "Ataque"
              ],
              "artifacts": [
                {
                  "artifact_name": "Concha Tingida Pelo Mar",
                  "artifact_url": "https://paimon.moe/images/artifacts/ocean-hued_clam_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "Vida%",
                  "artifact_circlet": "Vida% / Bônus de Cura",
                  "artifact_sands": "Vida%"
                }
              ],
              "weapon_best": {
                "weapon_name": "Histórias Extraordinárias de Caçadores de Dragões",
                "weapon_url": "https://paimon.moe/images/weapons/thrilling_tales_of_dragon_slayers.png",
                "weapon_rarity": 3
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Fumetsu Gekka",
                  "weapon_url": "https://paimon.moe/images/weapons/everlasting_moonglow.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Protótipo Âmbar",
                  "weapon_url": "https://paimon.moe/images/weapons/prototype_amber.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Codex de Favonius",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_codex.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "EkQCm4sorqs"
            }
        """.trimIndent()
}