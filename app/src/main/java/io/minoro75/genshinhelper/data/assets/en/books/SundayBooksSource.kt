package io.minoro75.genshinhelper.data.assets.en.books

import org.intellij.lang.annotations.Language

object SundayBooksSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.2 1st part"

    @Language("JSON")
    val booksList = """
        [
        {
            "book_name": "Freedom",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
            "characters": [
              {
                "name": "Aloy",
                "rarity": 5,
                "element": "cryo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e5/Aloy_Icon.png/revision/latest"
              },
              {
                "name": "Amber",
                "rarity": 4,
                "element": "pyro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/75/Amber_Icon.png/revision/latest"
              },
              {
                "name": "Barbara",
                "rarity": 4,
                "element": "hydro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Barbara_Icon.png/revision/latest"
              },
              {
                "name": "Diona",
                "rarity": 4,
                "element": "cryo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/40/Diona_Icon.png/revision/latest"
              },
              {
                "name": "Klee",
                "rarity": 5,
                "element": "pyro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9c/Klee_Icon.png/revision/latest"
              },
              {
                "name": "Sucrose",
                "rarity": 4,
                "element": "anemo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0e/Sucrose_Icon.png/revision/latest"
              },
              {
                "name": "Tartaglia",
                "rarity": 5,
                "element": "hydro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/85/Tartaglia_Icon.png/revision/latest"
              },
              {
                "name": "Traveler (Anemo)",
                "rarity": 5,
                "element": "anemo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/59/Traveler_Icon.png/revision/latest"
              }
            ]
          },
          {
            "book_name": "Prosperity",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bd/Item_Philosophies_of_Prosperity.png",
            "characters": [
              {
                "name": "Keqing",
                "rarity": 5,
                "element": "electro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/52/Keqing_Icon.png/revision/latest"
              },
              {
                "name": "Ningguang",
                "rarity": 4,
                "element": "geo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e0/Ningguang_Icon.png/revision/latest"
              },
              {
                "name": "Qiqi",
                "rarity": 5,
                "element": "cryo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b3/Qiqi_Icon.png/revision/latest"
              },
              {
                "name": "Shenhe",
                "rarity": 5,
                "element": "cryo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/af/Shenhe_Icon.png/revision/latest"
              },
              {
                "name": "Traveler (Geo)",
                "rarity": 5,
                "element": "geo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/59/Traveler_Icon.png/revision/latest"
              },
              {
                "name": "Xiao",
                "rarity": 5,
                "element": "anemo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/fd/Xiao_Icon.png/revision/latest"
              },
              {
                "name": "Yelan",
                "rarity": 5,
                "element": "hydro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d3/Yelan_Icon.png/revision/latest"
              }
            ]
          },
          {
            "book_name": "Transience",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/27/Item_Philosophies_of_Transience.png",
            "characters": [
              {
                "name": "Sangonomiya Kokomi",
                "rarity": 5,
                "element": "hydro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/ff/Sangonomiya_Kokomi_Icon.png/revision/latest"
              },
              {
                "name": "Shikanoin Heizou",
                "rarity": 4,
                "element": "anemo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/20/Shikanoin_Heizou_Icon.png/revision/latest"
              },
              {
                "name": "Thoma",
                "rarity": 4,
                "element": "pyro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/5b/Thoma_Icon.png/revision/latest"
              },
              {
                "name": "Traveler (Electro)",
                "rarity": 5,
                "element": "electro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/59/Traveler_Icon.png/revision/latest"
              },
              {
                "name": "Yoimiya",
                "rarity": 5,
                "element": "pyro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/88/Yoimiya_Icon.png/revision/latest"
              }
            ]
          },
          {
            "book_name": "Admonition",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9b/Item_Philosophies_of_Admonition.png",
            "characters": [
            {
                "name": "Candace",
                "rarity": 4,
                "element": "hydro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/dd/Candace_Icon.png/revision/latest"
              },
              {
                "name": "Cyno",
                "rarity": 5,
                "element": "electro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/31/Cyno_Icon.png/revision/latest"
              },
              {
                "name": "Faruzan",
                "rarity": 4,
                "element": "anemo",
                "weapon": "bow",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b2/Faruzan_Icon.png/revision/latest"
              },
              {
                "name": "Tighnari",
                "rarity": 5,
                "element": "dendro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/87/Tighnari_Icon.png/revision/latest"
              },
              {
                "name": "Traveler (Dendro)",
                "rarity": 5,
                "element": "dendro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/59/Traveler_Icon.png/revision/latest"
              }
            ]
          },
          {
            "book_name": "Resistance",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0b/Item_Philosophies_of_Resistance.png",
            "characters": [
              {
                "name": "Bennett",
                "rarity": 4,
                "element": "pyro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/79/Bennett_Icon.png/revision/latest"
              },
              {
                "name": "Diluc",
                "rarity": 5,
                "element": "pyro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/3d/Diluc_Icon.png/revision/latest"
              },
              {
                "name": "Eula",
                "rarity": 5,
                "element": "cryo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/af/Eula_Icon.png/revision/latest"
              },
              {
                "name": "Jean",
                "rarity": 5,
                "element": "anemo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/64/Jean_Icon.png/revision/latest"
              },
              {
                "name": "Mona",
                "rarity": 5,
                "element": "hydro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/41/Mona_Icon.png/revision/latest"
              },
              {
                "name": "Noelle",
                "rarity": 4,
                "element": "geo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8e/Noelle_Icon.png/revision/latest"
              },
              {
                "name": "Razor",
                "rarity": 4,
                "element": "electro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b8/Razor_Icon.png/revision/latest"
              },
              {
                "name": "Traveler (Anemo)",
                "rarity": 5,
                "element": "anemo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/59/Traveler_Icon.png/revision/latest"
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
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/35/Chongyun_Icon.png/revision/latest"
              },
              {
                "name": "Ganyu",
                "rarity": 5,
                "element": "cryo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/79/Ganyu_Icon.png/revision/latest"
              },
              {
                "name": "Hu Tao",
                "rarity": 5,
                "element": "pyro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e9/Hu_Tao_Icon.png/revision/latest"
              },
              {
                "name": "Kaedehara Kazuha",
                "rarity": 5,
                "element": "anemo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e3/Kaedehara_Kazuha_Icon.png/revision/latest"
              },
              {
                "name": "Traveler (Geo)",
                "rarity": 5,
                "element": "geo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/59/Traveler_Icon.png/revision/latest"
              },
              {
                "name": "Xiangling",
                "rarity": 4,
                "element": "pyro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/39/Xiangling_Icon.png/revision/latest"
              },
              {
                "name": "Yaoyao",
                "rarity": 4,
                "element": "dendro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/83/Yaoyao_Icon.png/revision/latest"
              },
              {
                "name": "Yun Jin",
                "rarity": 4,
                "element": "geo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9c/Yun_Jin_Icon.png/revision/latest"
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
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7b/Arataki_Itto_Icon.png/revision/latest"
              },
              {
                "name": "Kamisato Ayaka",
                "rarity": 5,
                "element": "cryo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/51/Kamisato_Ayaka_Icon.png/revision/latest"
              },
              {
                "name": "Kamisato Ayato",
                "rarity": 5,
                "element": "hydro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/27/Kamisato_Ayato_Icon.png/revision/latest"
              },
              {
                "name": "Kujou Sara",
                "rarity": 4,
                "element": "electro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/df/Kujou_Sara_Icon.png/revision/latest"
              },
              {
                "name": "Kuki Shinobu",
                "rarity": 4,
                "element": "electro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b3/Kuki_Shinobu_Icon.png/revision/latest"
              },
              {
                "name": "Traveler (Electro)",
                "rarity": 5,
                "element": "electro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/59/Traveler_Icon.png/revision/latest"
              }
            ]
          },
          {
            "book_name": "Ingenuity",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f7/Item_Philosophies_of_Ingenuity.png",
            "characters": [
                {
                "name": "Alhaitham",
                "rarity": 5,
                "element": "dendro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/2c/Alhaitham_Icon.png/revision/latest"
                },
              {
                "name": "Dori",
                "rarity": 4,
                "element": "electro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/54/Dori_Icon.png/revision/latest"
              },
              {
                "name": "Layla",
                "rarity": 4,
                "element": "cryo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1a/Layla_Icon.png/revision/latest"
              },
              {
                "name": "Nahida",
                "rarity": 5,
                "element": "dendro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f9/Nahida_Icon.png/revision/latest"
              },
              {
                "name": "Traveler (Dendro)",
                "rarity": 5,
                "element": "dendro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/59/Traveler_Icon.png/revision/latest"
              }
            ]
          },
          {
            "book_name": "Ballad",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7e/Item_Philosophies_of_Ballad.png",
            "characters": [
              {
                "name": "Albedo",
                "rarity": 5,
                "element": "geo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/30/Albedo_Icon.png/revision/latest"
              },
              {
                "name": "Fischl",
                "rarity": 4,
                "element": "electro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9a/Fischl_Icon.png/revision/latest"
              },
              {
                "name": "Kaeya",
                "rarity": 4,
                "element": "cryo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b6/Kaeya_Icon.png/revision/latest"
              },
              {
                "name": "Lisa",
                "rarity": 4,
                "element": "electro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/65/Lisa_Icon.png/revision/latest"
              },
              {
                "name": "Rosaria",
                "rarity": 4,
                "element": "cryo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/35/Rosaria_Icon.png/revision/latest"
              },
              {
                "name": "Traveler (Anemo)",
                "rarity": 5,
                "element": "anemo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/59/Traveler_Icon.png/revision/latest"
              },
              {
                "name": "Venti",
                "rarity": 5,
                "element": "anemo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f1/Venti_Icon.png/revision/latest"
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
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e1/Beidou_Icon.png/revision/latest"
              },
              {
                "name": "Traveler (Geo)",
                "rarity": 5,
                "element": "geo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/59/Traveler_Icon.png/revision/latest"
              },
              {
                "name": "Xingqiu",
                "rarity": 4,
                "element": "hydro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d4/Xingqiu_Icon.png/revision/latest"
              },
              {
                "name": "Xinyan",
                "rarity": 4,
                "element": "pyro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/24/Xinyan_Icon.png/revision/latest"
              },
              {
                "name": "Yanfei",
                "rarity": 4,
                "element": "pyro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/54/Yanfei_Icon.png/revision/latest"
              },
              {
                "name": "Zhongli",
                "rarity": 5,
                "element": "geo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a6/Zhongli_Icon.png/revision/latest"
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
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/fe/Gorou_Icon.png/revision/latest"
              },
              {
                "name": "Raiden Shogun",
                "rarity": 5,
                "element": "electro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/24/Raiden_Shogun_Icon.png/revision/latest"
              },
              {
                "name": "Sayu",
                "rarity": 4,
                "element": "anemo",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/22/Sayu_Icon.png/revision/latest"
              },
              {
                "name": "Traveler (Electro)",
                "rarity": 5,
                "element": "electro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/59/Traveler_Icon.png/revision/latest"
              },
              {
                "name": "Yae Miko",
                "rarity": 5,
                "element": "electro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/ba/Yae_Miko_Icon.png/revision/latest"
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
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a2/Collei_Icon.png/revision/latest"
              },
              {
                "name": "Nilou",
                "rarity": 5,
                "element": "hydro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/58/Nilou_Icon.png/revision/latest"
              },
              {
                "name": "Traveler (Dendro)",
                "rarity": 5,
                "element": "dendro",
                "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/59/Traveler_Icon.png/revision/latest"
              },
              {
                 "name": "Wanderer",
                 "rarity": 5,
                 "element": "anemo",
                 "weapon": "catalyst",
                 "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f8/Wanderer_Icon.png/revision/latest"
              }
            ]
          }
        ] 
    """.trimIndent()
}