package io.minoro75.genshinhelper.data.assets.books

import org.intellij.lang.annotations.Language

object MonThuBooksSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val booksList = """
        [
          {
            "book_name": "Freedom",
            "book_url": "https://paimon.moe/images/items/philosophies_of_freedom.png",
            "characters": [
              {
                "name": "Aloy",
                "rarity": 5,
                "element": "cryo",
                "image_url": "https://paimon.moe/images/characters/aloy.png"
              },
              {
                "name": "Amber",
                "rarity": 4,
                "element": "pyro",
                "image_url": "https://paimon.moe/images/characters/amber.png"
              },
              {
                "name": "Barbara",
                "rarity": 4,
                "element": "hydro",
                "image_url": "https://paimon.moe/images/characters/barbara.png"
              },
              {
                "name": "Diona",
                "rarity": 4,
                "element": "cryo",
                "image_url": "https://paimon.moe/images/characters/diona.png"
              },
              {
                "name": "Klee",
                "rarity": 5,
                "element": "pyro",
                "image_url": "https://paimon.moe/images/characters/klee.png"
              },
              {
                "name": "Sucrose",
                "rarity": 4,
                "element": "anemo",
                "image_url": "https://paimon.moe/images/characters/sucrose.png"
              },
              {
                "name": "Tartaglia",
                "rarity": 5,
                "element": "hydro",
                "image_url": "https://paimon.moe/images/characters/tartaglia.png"
              },
              {
                "name": "Traveler   (Anemo)",
                "rarity": 5,
                "element": "anemo",
                "image_url": "https://paimon.moe/images/characters/traveler_anemo.png"
              }
            ]
          },
          {
            "book_name": "Prosperity",
            "book_url": "https://paimon.moe/images/items/philosophies_of_prosperity.png",
            "characters": [
              {
                "name": "Keqing",
                "rarity": 5,
                "element": "electro",
                "image_url": "https://paimon.moe/images/characters/keqing.png"
              },
              {
                "name": "Ningguang",
                "rarity": 4,
                "element": "geo",
                "image_url": "https://paimon.moe/images/characters/ningguang.png"
              },
              {
                "name": "Qiqi",
                "rarity": 5,
                "element": "cryo",
                "image_url": "https://paimon.moe/images/characters/qiqi.png"
              },
              {
                "name": "Shenhe",
                "rarity": 5,
                "element": "cryo",
                "image_url": "https://paimon.moe/images/characters/shenhe.png"
              },
              {
                "name": "Traveler   (Geo)",
                "rarity": 5,
                "element": "geo",
                "image_url": "https://paimon.moe/images/characters/traveler_anemo.png"
              },
              {
                "name": "Xiao",
                "rarity": 5,
                "element": "anemo",
                "image_url": "https://paimon.moe/images/characters/xiao.png"
              },
              {
                "name": "Yelan",
                "rarity": 5,
                "element": "hydro",
                "image_url": "https://paimon.moe/images/characters/yelan.png"
              }
            ]
          },
          {
            "book_name": "Transience",
            "book_url": "https://paimon.moe/images/items/philosophies_of_transience.png",
            "characters": [
              {
                "name": "Sangonomiya Kokomi",
                "rarity": 5,
                "element": "hydro",
                "image_url": "https://paimon.moe/images/characters/sangonomiya_kokomi.png"
              },
              {
                "name": "Shikanoin Heizou",
                "rarity": 4,
                "element": "anemo",
                "image_url": "https://paimon.moe/images/characters/shikanoin_heizou.png"
              },
              {
                "name": "Thoma",
                "rarity": 4,
                "element": "pyro",
                "image_url": "https://paimon.moe/images/characters/thoma.png"
              },
              {
                "name": "Traveler   (Electro)",
                "rarity": 5,
                "element": "electro",
                "image_url": "https://paimon.moe/images/characters/traveler_anemo.png"
              },
              {
                "name": "Yoimiya",
                "rarity": 5,
                "element": "pyro",
                "image_url": "https://paimon.moe/images/characters/yoimiya.png"
              }
            ]
          },
          {
            "book_name": "Admonition",
            "book_url": "https://paimon.moe/images/items/philosophies_of_admonition.png",
            "characters": [
              {
                "name": "Tighnari",
                "rarity": 5,
                "element": "dendro",
                "image_url": "https://paimon.moe/images/characters/tighnari.png"
              },
              {
                "name": "Traveler   (Denro)",
                "rarity": 5,
                "element": "dendro",
                "image_url": "https://paimon.moe/images/characters/traveler_anemo.png"
              }
            ]
          }
        ]
    """.trimIndent()
}
