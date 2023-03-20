package io.minoro75.genshinhelper.data.assets.pt.characters_pt

import org.intellij.lang.annotations.Language

object NilouDetailsSourcePt {
    @Language("JSON")
    val details = """
        {
          "name": "Nilou",
          "rarity": 5,
          "element": "hydro",
          "weapon": "sword",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/58/Nilou_Icon.png/revision/latest",
          "talents_books": {
            "book_name": "Práxis",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/82/Item_Philosophies_of_Praxis.png",
            "book_days": "Quarta-feira/Sábado/Domingo"
          },
          "weekly_boss_item": {
            "boss_item_name": "Lágrima da Deusa do Desastre",
            "boss_item_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/ef/Item_Tears_of_the_Calamitous_God.png"
          },
          "talents_priority": [
            "Habilidade",
            "Supremo",
            "Ataque"
          ],
          "artifacts": [
            {
              "artifact_name": "Sonhos Dourados",
              "artifact_url": "https://paimon.moe/images/artifacts/gilded_dreams_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Vida%",
              "artifact_circlet": "Vida%",
              "artifact_sands": "Vida%"
            },
            {
              "artifact_name": "Millelith Firmes",
              "artifact_url": "https://paimon.moe/images/artifacts/tenacity_of_the_millelith_flower.png",
              "artifact_amount": 2,
              "artifact_gobelet": "Vida%",
              "artifact_circlet": "Vida%",
              "artifact_sands": "Vida%"
            }
          ],
          "weapon_best": {
             "weapon_name": "Chave de Hierofania",
              "weapon_url": "https://paimon.moe/images/weapons/key_of_khaj-nisut.png",
              "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Luz Lunar de Xiphos",
            "weapon_url": "https://paimon.moe/images/weapons/xiphos_moonlight.png",
            "weapon_rarity": 4
            },
            {
              "weapon_name": "Espada do Sacrifício",
              "weapon_url": "https://paimon.moe/images/weapons/sacrificial_sword.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Espada de Favonius",
              "weapon_url": "https://paimon.moe/images/weapons/favonius_sword.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "XzQVe6zA9ug"
        }
    """.trimIndent()
}