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
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/00/Character_Albedo_Thumb.png"
              },
              {
                "name": "Fischl",
                "rarity": 4,
                "element": "electro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/14/Character_Fischl_Thumb.png"
              },
              {
                "name": "Kaeya",
                "rarity": 4,
                "element": "cryo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/33/Character_Kaeya_Thumb.png"
              },
              {
                "name": "Lisa",
                "rarity": 4,
                "element": "electro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/51/Character_Lisa_Thumb.png"
              },
              {
                "name": "Rosaria",
                "rarity": 4,
                "element": "cryo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f6/Character_Rosaria_Thumb.png"
              },
              {
                "name": "Traveler   (Anemo)",
                "rarity": 5,
                "element": "anemo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/71/Character_Traveler_Thumb.png"
              },
              {
                "name": "Venti",
                "rarity": 5,
                "element": "anemo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8d/Character_Venti_Thumb.png"
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
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/61/Character_Beidou_Thumb.png"
              },
              {
                "name": "Traveler   (Geo)",
                "rarity": 5,
                "element": "geo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/71/Character_Traveler_Thumb.png"
              },
              {
                "name": "Xingqiu",
                "rarity": 4,
                "element": "hydro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/4a/Character_Xingqiu_Thumb.png"
              },
              {
                "name": "Xinyan",
                "rarity": 4,
                "element": "pyro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9d/Character_Xinyan_Thumb.png"
              },
              {
                "name": "Yanfei",
                "rarity": 4,
                "element": "pyro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1f/Character_Yanfei_Thumb.png"
              },
              {
                "name": "Zhongli",
                "rarity": 5,
                "element": "geo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Character_Zhongli_Thumb.png"
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
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/56/Character_Gorou_Thumb.png"
              },
              {
                "name": "Raiden Shogun",
                "rarity": 5,
                "element": "electro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/52/Character_Raiden_Shogun_Thumb.png"
              },
              {
                "name": "Sayu",
                "rarity": 4,
                "element": "anemo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/ec/Character_Sayu_Thumb.png"
              },
              {
                "name": "Traveler   (Electro)",
                "rarity": 5,
                "element": "electro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/71/Character_Traveler_Thumb.png"
              },
              {
                "name": "Yae Miko",
                "rarity": 5,
                "element": "electro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/57/Character_Yae_Miko_Thumb.png"
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
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9e/Character_Collei_Thumb.png"
              },
              {
                "name": "Traveler   (Denro)",
                "rarity": 5,
                "element": "dendro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/71/Character_Traveler_Thumb.png"
              }
            ]
          }
        ]
    """.trimIndent()
}
