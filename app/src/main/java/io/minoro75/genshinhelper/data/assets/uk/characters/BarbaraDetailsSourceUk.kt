package io.minoro75.genshinhelper.data.assets.uk.characters

import org.intellij.lang.annotations.Language

object BarbaraDetailsSourceUk {
    @Language("JSON")
    val details = """
            {
              "name": "Барбара",
              "rarity": 4,
              "element": "hydro",
              "weapon": "catalyst",
              "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/72/Character_Barbara_Thumb.png",
              "talents_books": {
                "book_name": "про Волю",
                "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
                "book_days": "Понеділок/Четвер/Неділя"
              },
              "weekly_boss_item": {
                "boss_item_name": "Каблучка Борея",
                "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d6/Item_Ring_of_Boreas.png"
              },
              "talents_priority": [
                "Ульта",
                "Навичка",
                "Атака"
              ],
              "artifacts": [
                {
                  "artifact_name": "Молюск лазурового відтінку",
                  "artifact_url": "https://paimon.moe/images/artifacts/ocean-hued_clam_flower.png",
                  "artifact_amount": 4,
                  "artifact_gobelet": "HP",
                  "artifact_circlet": "HP / Бонус хілінгу",
                  "artifact_sands": "HP"
                }
              ],
              "weapon_best": {
                "weapon_name": "Захопливі оповідання про вбивць драконів",
                "weapon_url": "https://paimon.moe/images/weapons/thrilling_tales_of_dragon_slayers.png",
                "weapon_rarity": 3
              },
              "weapons_replacements": [
                {
                  "weapon_name": "Вічне місячне сяво",
                  "weapon_url": "https://paimon.moe/images/weapons/everlasting_moonglow.png",
                  "weapon_rarity": 5
                },
                {
                  "weapon_name": "Прототип: Бурштин",
                  "weapon_url": "https://paimon.moe/images/weapons/prototype_amber.png",
                  "weapon_rarity": 4
                },
                {
                  "weapon_name": "Кодекс Фавонія",
                  "weapon_url": "https://paimon.moe/images/weapons/favonius_codex.png",
                  "weapon_rarity": 4
                }
              ],
              "video_guide": "EkQCm4sorqs"
            }
        """.trimIndent()
}