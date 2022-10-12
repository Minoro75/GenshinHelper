package io.minoro75.genshinhelper.data.assets.books

import org.intellij.lang.annotations.Language

object WedSatBooksSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val booksList = """
        [
          {
            "book_name": "Ballad",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7e/Item_Philosophies_of_Ballad.png",
            "characters": [
              {
                "name": "Albedo",
                "rarity": 5,
                "element": "geo",
                "image_url": "https://paimon.moe/images/characters/albedo.png"
              },
              {
                "name": "Fischl",
                "rarity": 4,
                "element": "electro",
                "image_url": "https://paimon.moe/images/characters/fischl.png"
              },
              {
                "name": "Kaeya",
                "rarity": 4,
                "element": "cryo",
                "image_url": "https://paimon.moe/images/characters/kaeya.png"
              },
              {
                "name": "Lisa",
                "rarity": 4,
                "element": "electro",
                "image_url": "https://paimon.moe/images/characters/lisa.png"
              },
              {
                "name": "Rosaria",
                "rarity": 4,
                "element": "cryo",
                "image_url": "https://paimon.moe/images/characters/rosaria.png"
              },
              {
                "name": "Traveler   (Anemo)",
                "rarity": 5,
                "element": "anemo",
                "image_url": "https://paimon.moe/images/characters/traveler_anemo.png"
              },
              {
                "name": "Venti",
                "rarity": 5,
                "element": "anemo",
                "image_url": "https://paimon.moe/images/characters/venti.png"
              }
            ]
          },
          {
            "book_name": "Gold",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/01/Item_Philosophies_of_Gold.png",
            "characters": [
              {
                "name": "Beidou",
                "rarity": 4,
                "element": "electro",
                "image_url": "https://paimon.moe/images/characters/beidou.png"
              },
              {
                "name": "Traveler   (Geo)",
                "rarity": 5,
                "element": "geo",
                "image_url": "https://paimon.moe/images/characters/traveler_anemo.png"
              },
              {
                "name": "Xingqiu",
                "rarity": 4,
                "element": "hydro",
                "image_url": "https://paimon.moe/images/characters/xingqiu.png"
              },
              {
                "name": "Xinyan",
                "rarity": 4,
                "element": "pyro",
                "image_url": "https://paimon.moe/images/characters/xinyan.png"
              },
              {
                "name": "Yanfei",
                "rarity": 4,
                "element": "pyro",
                "image_url": "https://paimon.moe/images/characters/yanfei.png"
              },
              {
                "name": "Zhongli",
                "rarity": 5,
                "element": "geo",
                "image_url": "https://paimon.moe/images/characters/zhongli.png"
              }
            ]
          },
          {
            "book_name": "Light",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/95/Item_Philosophies_of_Light.png",
            "characters": [
              {
                "name": "Gorou",
                "rarity": 4,
                "element": "geo",
                "image_url": "https://paimon.moe/images/characters/gorou.png"
              },
              {
                "name": "Raiden Shogun",
                "rarity": 5,
                "element": "electro",
                "image_url": "https://paimon.moe/images/characters/raiden_shogun.png"
              },
              {
                "name": "Sayu",
                "rarity": 4,
                "element": "anemo",
                "image_url": "https://paimon.moe/images/characters/sayu.png"
              },
              {
                "name": "Traveler   (Electro)",
                "rarity": 5,
                "element": "electro",
                "image_url": "https://paimon.moe/images/characters/traveler_anemo.png"
              },
              {
                "name": "Yae Miko",
                "rarity": 5,
                "element": "electro",
                "image_url": "https://paimon.moe/images/characters/yae_miko.png"
              }
            ]
          },
          {
            "book_name": "Praxis",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/82/Item_Philosophies_of_Praxis.png",
            "characters": [
              {
                "name": "Collei",
                "rarity": 4,
                "element": "dendro",
                "image_url": "https://paimon.moe/images/characters/collei.png"
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
