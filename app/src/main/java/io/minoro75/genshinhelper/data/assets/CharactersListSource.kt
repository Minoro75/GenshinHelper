package io.minoro75.genshinhelper.data.assets

import org.intellij.lang.annotations.Language

object CharactersListSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.2 1st part"

    @Language("JSON")
    val charactersList = """
       [
    {
      "name": "Albedo",
      "rarity": 5,
      "element": "geo",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/00/Character_Albedo_Thumb.png"
    }
    {
      "name": "Aloy",
      "rarity": 5,
      "element": "cryo",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
    },
    {
      "name": "Amber",
      "rarity": 4,
      "element": "pyro",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c6/Character_Amber_Thumb.png"
    },
    {
      "name": "Arataki Itto",
      "rarity": 5,
      "element": "geo",
      "weapon": "claymore",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/79/Character_Arataki_Itto_Thumb.png"
    },
    {
      "name": "Barbara",
      "rarity": 4,
      "element": "hydro",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/72/Character_Barbara_Thumb.png"
    },
    {
      "name": "Beidou",
      "rarity": 4,
      "element": "electro",
      "weapon": "claymore",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/61/Character_Beidou_Thumb.png"
    },
    {
      "name": "Bennett",
      "rarity": 4,
      "element": "pyro",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7b/Character_Bennett_Thumb.png"
    },
    {
      "name": "Candace",
      "rarity": 4,
      "element": "hydro",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bf/Character_Candace_Thumb.png"
    },
    {
      "name": "Chongyun",
      "rarity": 4,
      "element": "cryo",
      "weapon": "claymore",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/68/Character_Chongyun_Thumb.png"
    },
   {
      "name": "Collei",
      "rarity": 4,
      "element": "dendro",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9e/Character_Collei_Thumb.png"
    },
    {
      "name": "Cyno",
      "rarity": 5,
      "element": "electro",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d1/Character_Cyno_Thumb.png"
    },
    {
      "name": "Diluc",
      "rarity": 5,
      "element": "pyro",
      "weapon": "claymore",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/02/Character_Diluc_Thumb.png"
    },
    {
      "name": "Diona",
      "rarity": 4,
      "element": "cryo",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b9/Character_Diona_Thumb.png"
    },
    {
      "name": "Dori",
      "rarity": 4,
      "element": "electro",
      "weapon": "claymore",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/90/Character_Dori_Thumb.png"
    },
    {
      "name": "Eula",
      "rarity": 5,
      "element": "cryo",
      "weapon": "claymore",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d3/Character_Eula_Thumb.png"
    },
    {
      "name": "Fischl",
      "rarity": 4,
      "element": "electro",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/14/Character_Fischl_Thumb.png"
    },
    {
      "name": "Ganyu",
      "rarity": 5,
      "element": "cryo",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0a/Character_Ganyu_Thumb.png"
    },
    {
      "name": "Gorou",
      "rarity": 4,
      "element": "geo",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/56/Character_Gorou_Thumb.png"
    },
    {
      "name": "Hu Tao",
      "rarity": 5,
      "element": "pyro",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a4/Character_Hu_Tao_Thumb.png"
    },
    {
      "name": "Jean",
      "rarity": 5,
      "element": "anemo",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/89/Character_Jean_Thumb.png"
    },
    {
      "name": "Kaedehara Kazuha",
      "rarity": 5,
      "element": "anemo",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f0/Character_Kaedehara_Kazuha_Thumb.png"
    },
    {
      "name": "Kaeya",
      "rarity": 4,
      "element": "cryo",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/33/Character_Kaeya_Thumb.png"
    },
    {
      "name": "Kamisato Ayaka",
      "rarity": 5,
      "element": "cryo",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/fd/Character_Kamisato_Ayaka_Thumb.png"
    },
    {
      "name": "Kamisato Ayato",
      "rarity": 5,
      "element": "hydro",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a2/Character_Kamisato_Ayato_Thumb.png"
    },
    {
      "name": "Keqing",
      "rarity": 5,
      "element": "electro",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/06/Character_Keqing_Thumb.png"
    },
    {
      "name": "Klee",
      "rarity": 5,
      "element": "pyro",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c3/Character_Klee_Thumb.png"
    },
    {
      "name": "Kujou Sara",
      "rarity": 4,
      "element": "electro",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/96/Character_Kujou_Sara_Thumb.png"
    },
    {
      "name": "Kuki Shinobu",
      "rarity": 4,
      "element": "electro",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/37/Character_Kuki_Shinobu_Thumb.png"
    },
    {
      "name": "Lisa",
      "rarity": 4,
      "element": "electro",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/51/Character_Lisa_Thumb.png"
    },
    {
      "name": "Mona",
      "rarity": 5,
      "element": "hydro",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a0/Character_Mona_Thumb.png"
    },
    {
      "name": "Nahida",
      "rarity": 5,
      "element": "dendro",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/cf/Character_Nahida_Thumb.png"
    },
    {
      "name": "Nilou",
      "rarity": 5,
      "element": "hydro",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a5/Character_Nilou_Thumb.png"
    },
    {
      "name": "Ningguang",
      "rarity": 4,
      "element": "geo",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/2b/Character_Ningguang_Thumb.png"
    },
    {
      "name": "Noelle",
      "rarity": 4,
      "element": "geo",
      "weapon": "claymore",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/ab/Character_Noelle_Thumb.png"
    },
    {
      "name": "Qiqi",
      "rarity": 5,
      "element": "cryo",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d5/Character_Qiqi_Thumb.png"
    },
    {
      "name": "Raiden Shogun",
      "rarity": 5,
      "element": "electro",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/52/Character_Raiden_Shogun_Thumb.png"
    },
    {
      "name": "Razor",
      "rarity": 4,
      "element": "electro",
      "weapon": "claymore",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1d/Character_Razor_Thumb.png"
    },
    {
      "name": "Rosaria",
      "rarity": 4,
      "element": "cryo",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f6/Character_Rosaria_Thumb.png"
    },
    {
      "name": "Sangonomiya Kokomi",
      "rarity": 5,
      "element": "hydro",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/cc/Character_Sangonomiya_Kokomi_Thumb.png"
    },
    {
      "name": "Sayu",
      "rarity": 4,
      "element": "anemo",
      "weapon": "claymore",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/ec/Character_Sayu_Thumb.png"
    },
    {
      "name": "Shenhe",
      "rarity": 5,
      "element": "cryo",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/58/Character_Shenhe_Thumb.png"
    },
    {
      "name": "Shikanoin Heizou",
      "rarity": 4,
      "element": "anemo",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e4/Character_Shikanoin_Heizou_Thumb.png"
    },
    {
      "name": "Sucrose",
      "rarity": 4,
      "element": "anemo",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/61/Character_Sucrose_Thumb.png"
    },
    {
      "name": "Tartaglia",
      "rarity": 5,
      "element": "hydro",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/53/Character_Tartaglia_Thumb.png"
    },
    {
      "name": "Thoma",
      "rarity": 4,
      "element": "pyro",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8a/Character_Thoma_Thumb.png"
    },
   {
      "name": "Tighnari",
      "rarity": 5,
      "element": "dendro",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/91/Character_Tighnari_Thumb.png"
    },
    {
      "name": "Traveler   (Anemo)",
      "rarity": 5,
      "element": "anemo",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/71/Character_Traveler_Thumb.png"
    },
    {
      "name": "Traveler   (Electro)",
      "rarity": 5,
      "element": "electro",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/71/Character_Traveler_Thumb.png"
    },
    {
      "name": "Traveler   (Geo)",
      "rarity": 5,
      "element": "geo",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/71/Character_Traveler_Thumb.png"
    },

   {
      "name": "Traveler   (Denro)",
      "rarity": 5,
      "element": "dendro",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/71/Character_Traveler_Thumb.png"
    },
    {
      "name": "Venti",
      "rarity": 5,
      "element": "anemo",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8d/Character_Venti_Thumb.png"
    },
    {
      "name": "Xiangling",
      "rarity": 4,
      "element": "pyro",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a0/Character_Xiangling_Thumb.png"
    },
    {
      "name": "Xiao",
      "rarity": 5,
      "element": "anemo",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b9/Character_Xiao_Thumb.png"
    },
    {
      "name": "Xingqiu",
      "rarity": 4,
      "element": "hydro",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/4a/Character_Xingqiu_Thumb.png"
    },
    {
      "name": "Xinyan",
      "rarity": 4,
      "element": "pyro",
      "weapon": "claymore",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9d/Character_Xinyan_Thumb.png"
    },
    {
      "name": "Yae Miko",
      "rarity": 5,
      "element": "electro",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/57/Character_Yae_Miko_Thumb.png"
    },
    {
      "name": "Yanfei",
      "rarity": 4,
      "element": "pyro",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1f/Character_Yanfei_Thumb.png"
    },
    {
      "name": "Yelan",
      "rarity": 5,
      "element": "hydro",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a8/Character_Yelan_Thumb.png"
    },
    {
      "name": "Yoimiya",
      "rarity": 5,
      "element": "pyro",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/05/Character_Yoimiya_Thumb.png"
    },
    {
      "name": "Yun Jin",
      "rarity": 4,
      "element": "geo",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/cb/Character_Yun_Jin_Thumb.png"
    },
    {
      "name": "Zhongli",
      "rarity": 5,
      "element": "geo",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Character_Zhongli_Thumb.png"
    },
  ]
        """.trimIndent()


    @Language("JSON")
    val charactersListRu = """
        [
    {
      "name": "Альбедо",
      "rarity": 5,
      "element": "geo",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/00/Character_Albedo_Thumb.png"
    },
    {
      "name": "Элой",
      "rarity": 5,
      "element": "cryo",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
    },
    {
      "name": "Эмбер",
      "rarity": 4,
      "element": "pyro",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c6/Character_Amber_Thumb.png"
    },
    {
      "name": "Аратаки Итто",
      "rarity": 5,
      "element": "geo",
      "weapon": "claymore",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/79/Character_Arataki_Itto_Thumb.png"
    },
    {
      "name": "Барбара",
      "rarity": 4,
      "element": "hydro",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/72/Character_Barbara_Thumb.png"
    },
    {
      "name": "Бэй Доу",
      "rarity": 4,
      "element": "electro",
      "weapon": "claymore",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/61/Character_Beidou_Thumb.png"
    },
    {
      "name": "Беннет",
      "rarity": 4,
      "element": "pyro",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/7b/Character_Bennett_Thumb.png"
    },
    {
      "name": "Кандакия",
      "rarity": 4,
      "element": "hydro",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/bf/Character_Candace_Thumb.png"
    },
    {
      "name": "Чун Юнь",
      "rarity": 4,
      "element": "cryo",
      "weapon": "claymore",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/68/Character_Chongyun_Thumb.png"
    },
   {
      "name": "Коллеи",
      "rarity": 4,
      "element": "dendro",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9e/Character_Collei_Thumb.png"
    },
    {
      "name": "Сайно",
      "rarity": 5,
      "element": "electro",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d1/Character_Cyno_Thumb.png"
    },
    {
      "name": "Дилюк",
      "rarity": 5,
      "element": "pyro",
      "weapon": "claymore",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/02/Character_Diluc_Thumb.png"
    },
    {
      "name": "Диона",
      "rarity": 4,
      "element": "cryo",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b9/Character_Diona_Thumb.png"
    },
    {
      "name": "Дори",
      "rarity": 4,
      "element": "electro",
      "weapon": "claymore",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/90/Character_Dori_Thumb.png"
    },
    {
      "name": "Эола",
      "rarity": 5,
      "element": "cryo",
      "weapon": "claymore",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d3/Character_Eula_Thumb.png"
    },
    {
      "name": "Фишль",
      "rarity": 4,
      "element": "electro",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/14/Character_Fischl_Thumb.png"
    },
    {
      "name": "Гань Юй",
      "rarity": 5,
      "element": "cryo",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0a/Character_Ganyu_Thumb.png"
    },
    {
      "name": "Горо",
      "rarity": 4,
      "element": "geo",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/56/Character_Gorou_Thumb.png"
    },
    {
      "name": "Ху Тао",
      "rarity": 5,
      "element": "pyro",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a4/Character_Hu_Tao_Thumb.png"
    },
    {
      "name": "Джинн",
      "rarity": 5,
      "element": "anemo",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/89/Character_Jean_Thumb.png"
    },
    {
      "name": "Кадзуха",
      "rarity": 5,
      "element": "anemo",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f0/Character_Kaedehara_Kazuha_Thumb.png"
    },
    {
      "name": "Кэйа",
      "rarity": 4,
      "element": "cryo",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/33/Character_Kaeya_Thumb.png"
    },
    {
      "name": "Камисато Аяйка",
      "rarity": 5,
      "element": "cryo",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/fd/Character_Kamisato_Ayaka_Thumb.png"
    },
    {
      "name": "Камисато Аято",
      "rarity": 5,
      "element": "hydro",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a2/Character_Kamisato_Ayato_Thumb.png"
    },
    {
      "name": "Кэ Цин",
      "rarity": 5,
      "element": "electro",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/06/Character_Keqing_Thumb.png"
    },
    {
      "name": "Кли",
      "rarity": 5,
      "element": "pyro",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c3/Character_Klee_Thumb.png"
    },
    {
      "name": "Кудзё Сара",
      "rarity": 4,
      "element": "electro",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/96/Character_Kujou_Sara_Thumb.png"
    },
    {
      "name": "Куки Синобу",
      "rarity": 4,
      "element": "electro",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/3/37/Character_Kuki_Shinobu_Thumb.png"
    },
    {
      "name": "Лиза",
      "rarity": 4,
      "element": "electro",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/51/Character_Lisa_Thumb.png"
    },
    {
      "name": "Мона",
      "rarity": 5,
      "element": "hydro",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a0/Character_Mona_Thumb.png"
    },
    {
      "name": "Нахида",
      "rarity": 5,
      "element": "dendro",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/cf/Character_Nahida_Thumb.png"
    },
    {
      "name": "Нилу",
      "rarity": 5,
      "element": "hydro",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a5/Character_Nilou_Thumb.png"
    },
    {
      "name": "Нин Гуан",
      "rarity": 4,
      "element": "geo",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/2/2b/Character_Ningguang_Thumb.png"
    },
    {
      "name": "Ноэлль",
      "rarity": 4,
      "element": "geo",
      "weapon": "claymore",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/ab/Character_Noelle_Thumb.png"
    },
    {
      "name": "Ци Ци",
      "rarity": 5,
      "element": "cryo",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/d/d5/Character_Qiqi_Thumb.png"
    },
    {
      "name": "Райдэн",
      "rarity": 5,
      "element": "electro",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/52/Character_Raiden_Shogun_Thumb.png"
    },
    {
      "name": "Рэйзор",
      "rarity": 4,
      "element": "electro",
      "weapon": "claymore",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1d/Character_Razor_Thumb.png"
    },
    {
      "name": "Розария",
      "rarity": 4,
      "element": "cryo",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f6/Character_Rosaria_Thumb.png"
    },
    {
      "name": "Сангономия Кокоми",
      "rarity": 5,
      "element": "hydro",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/cc/Character_Sangonomiya_Kokomi_Thumb.png"
    },
    {
      "name": "Саю",
      "rarity": 4,
      "element": "anemo",
      "weapon": "claymore",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/ec/Character_Sayu_Thumb.png"
    },
    {
      "name": "Шэнь Хэ",
      "rarity": 5,
      "element": "cryo",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/58/Character_Shenhe_Thumb.png"
    },
    {
      "name": "Хэйдзо",
      "rarity": 4,
      "element": "anemo",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/e/e4/Character_Shikanoin_Heizou_Thumb.png"
    },
    {
      "name": "Сахароза",
      "rarity": 4,
      "element": "anemo",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/6/61/Character_Sucrose_Thumb.png"
    },
    {
      "name": "Тарталья",
      "rarity": 5,
      "element": "hydro",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/53/Character_Tartaglia_Thumb.png"
    },
    {
      "name": "Тома",
      "rarity": 4,
      "element": "pyro",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8a/Character_Thoma_Thumb.png"
    },
   {
      "name": "Тигнари",
      "rarity": 5,
      "element": "dendro",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/91/Character_Tighnari_Thumb.png"
    },
    {
      "name": "Путешественник   (Анемо)",
      "rarity": 5,
      "element": "anemo",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/71/Character_Traveler_Thumb.png"
    },
    {
      "name": "Путешественник   (Електро)",
      "rarity": 5,
      "element": "electro",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/71/Character_Traveler_Thumb.png"
    },
    {
      "name": "Путешественник   (Гео)",
      "rarity": 5,
      "element": "geo",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/71/Character_Traveler_Thumb.png"
    },

   {
      "name": "Путешественник   (Дендро)",
      "rarity": 5,
      "element": "dendro",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/7/71/Character_Traveler_Thumb.png"
    },
    {
      "name": "Венти",
      "rarity": 5,
      "element": "anemo",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8d/Character_Venti_Thumb.png"
    },
    {
      "name": "Сян Лин",
      "rarity": 4,
      "element": "pyro",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a0/Character_Xiangling_Thumb.png"
    },
    {
      "name": "Сяо",
      "rarity": 5,
      "element": "anemo",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/b/b9/Character_Xiao_Thumb.png"
    },
    {
      "name": "Син Цю",
      "rarity": 4,
      "element": "hydro",
      "weapon": "sword",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/4/4a/Character_Xingqiu_Thumb.png"
    },
    {
      "name": "Синь Янь",
      "rarity": 4,
      "element": "pyro",
      "weapon": "claymore",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9d/Character_Xinyan_Thumb.png"
    },
    {
      "name": "Яэ Мико",
      "rarity": 5,
      "element": "electro",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/5/57/Character_Yae_Miko_Thumb.png"
    },
    {
      "name": "Янь Фэй",
      "rarity": 4,
      "element": "pyro",
      "weapon": "catalyst",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/1/1f/Character_Yanfei_Thumb.png"
    },
    {
      "name": "Е Лань",
      "rarity": 5,
      "element": "hydro",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a8/Character_Yelan_Thumb.png"
    },
    {
      "name": "Ëимия",
      "rarity": 5,
      "element": "pyro",
      "weapon": "bow",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/05/Character_Yoimiya_Thumb.png"
    },
    {
      "name": "Юнь Цзинь",
      "rarity": 4,
      "element": "geo",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/cb/Character_Yun_Jin_Thumb.png"
    },
    {
      "name": "Чжун Ли",
      "rarity": 5,
      "element": "geo",
      "weapon": "polearm",
      "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Character_Zhongli_Thumb.png"
    }
    ]
    """.trimIndent()
}
