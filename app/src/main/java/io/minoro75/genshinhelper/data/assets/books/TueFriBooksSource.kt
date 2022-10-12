package io.minoro75.genshinhelper.data.assets.books

import org.intellij.lang.annotations.Language

object TueFriBooksSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val booksList = """
        [
          {
            "book_name": "Resistance",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0b/Item_Philosophies_of_Resistance.png",
            "characters": [
              {
                "name": "Bennett",
                "rarity": 4,
                "element": "pyro",
                "image_url": "https://paimon.moe/images/characters/bennett.png"
              },
              {
                "name": "Diluc",
                "rarity": 5,
                "element": "pyro",
                "image_url": "https://paimon.moe/images/characters/diluc.png"
              },
              {
                "name": "Eula",
                "rarity": 5,
                "element": "cryo",
                "image_url": "https://paimon.moe/images/characters/eula.png"
              },
              {
                "name": "Jean",
                "rarity": 5,
                "element": "anemo",
                "image_url": "https://paimon.moe/images/characters/jean.png"
              },
              {
                "name": "Mona",
                "rarity": 5,
                "element": "hydro",
                "image_url": "https://paimon.moe/images/characters/mona.png"
              },
              {
                "name": "Noelle",
                "rarity": 4,
                "element": "geo",
                "image_url": "https://paimon.moe/images/characters/noelle.png"
              },
              {
                "name": "Razor",
                "rarity": 4,
                "element": "electro",
                "image_url": "https://paimon.moe/images/characters/razor.png"
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
            "book_name": "Diligence",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
            "characters": [
              {
                "name": "Chongyun",
                "rarity": 4,
                "element": "cryo",
                "image_url": "https://paimon.moe/images/characters/chongyun.png"
              },
              {
                "name": "Ganyu",
                "rarity": 5,
                "element": "cryo",
                "image_url": "https://paimon.moe/images/characters/ganyu.png"
              },
              {
                "name": "Hu Tao",
                "rarity": 5,
                "element": "pyro",
                "image_url": "https://paimon.moe/images/characters/hu_tao.png"
              },
              {
                "name": "Kaedehara Kazuha",
                "rarity": 5,
                "element": "anemo",
                "image_url": "https://paimon.moe/images/characters/kaedehara_kazuha.png"
              },
              {
                "name": "Traveler   (Geo)",
                "rarity": 5,
                "element": "geo",
                "image_url": "https://paimon.moe/images/characters/traveler_anemo.png"
              },
              {
                "name": "Xiangling",
                "rarity": 4,
                "element": "pyro",
                "image_url": "https://paimon.moe/images/characters/xiangling.png"
              },
              {
                "name": "Yun Jin",
                "rarity": 4,
                "element": "geo",
                "image_url": "https://paimon.moe/images/characters/yun_jin.png"
              }
            ]
          },
          {
            "book_name": "Elegance",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/6f/Item_Philosophies_of_Elegance.png",
            "characters": [
              {
                "name": "Arataki Itto",
                "rarity": 5,
                "element": "geo",
                "image_url": "https://paimon.moe/images/characters/arataki_itto.png"
              },
              {
                "name": "Kamisato Ayaka",
                "rarity": 5,
                "element": "cryo",
                "image_url": "https://paimon.moe/images/characters/kamisato_ayaka.png"
              },
              {
                "name": "Kamisato Ayato",
                "rarity": 5,
                "element": "hydro",
                "image_url": "https://paimon.moe/images/characters/kamisato_ayato.png"
              },
              {
                "name": "Kujou Sara",
                "rarity": 4,
                "element": "electro",
                "image_url": "https://paimon.moe/images/characters/kujou_sara.png"
              },
              {
                "name": "Kuki Shinobu",
                "rarity": 4,
                "element": "electro",
                "image_url": "https://paimon.moe/images/characters/kuki_shinobu.png"
              },
              {
                "name": "Traveler   (Electro)",
                "rarity": 5,
                "element": "electro",
                "image_url": "https://paimon.moe/images/characters/traveler_anemo.png"
              }
            ]
          },
          {
            "book_name": "Ingenuity",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Item_Philosophies_of_Ingenuity.png",
            "characters": [
              {
                "name": "Dori",
                "rarity": 4,
                "element": "electro",
                "image_url": "https://paimon.moe/images/characters/dori.png"
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