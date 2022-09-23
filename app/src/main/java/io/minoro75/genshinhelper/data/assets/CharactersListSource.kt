package io.minoro75.genshinhelper.data.assets

import org.intellij.lang.annotations.Language

object CharactersListSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 1st part"

    @Language("JSON")
    val charactersList = """
       [
    {
      "name": "Albedo",
      "rarity": 5,
      "element": "geo",
      "weapon": "sword",
      "image_url": "https://paimon.moe/images/characters/albedo.png"
    },
    {
      "name": "Aloy",
      "rarity": 5,
      "element": "cryo",
      "weapon": "bow",
      "image_url": "https://paimon.moe/images/characters/aloy.png"
    },
    {
      "name": "Amber",
      "rarity": 4,
      "element": "pyro",
      "weapon": "bow",
      "image_url": "https://paimon.moe/images/characters/amber.png"
    },
    {
      "name": "Arataki Itto",
      "rarity": 5,
      "element": "geo",
      "weapon": "claymore",
      "image_url": "https://paimon.moe/images/characters/arataki_itto.png"
    },
    {
      "name": "Barbara",
      "rarity": 4,
      "element": "hydro",
      "weapon": "catalyst",
      "image_url": "https://paimon.moe/images/characters/barbara.png"
    },
    {
      "name": "Beidou",
      "rarity": 4,
      "element": "electro",
      "weapon": "claymore",
      "image_url": "https://paimon.moe/images/characters/beidou.png"
    },
    {
      "name": "Bennett",
      "rarity": 4,
      "element": "pyro",
      "weapon": "sword",
      "image_url": "https://paimon.moe/images/characters/bennett.png"
    },
    {
      "name": "Chongyun",
      "rarity": 4,
      "element": "cryo",
      "weapon": "claymore",
      "image_url": "https://paimon.moe/images/characters/chongyun.png"
    },
   {
      "name": "Collei",
      "rarity": 4,
      "element": "dendro",
      "weapon": "bow",
      "image_url": "https://paimon.moe/images/characters/collei.png"
    },
    {
      "name": "Diluc",
      "rarity": 5,
      "element": "pyro",
      "weapon": "claymore",
      "image_url": "https://paimon.moe/images/characters/diluc.png"
    },
    {
      "name": "Diona",
      "rarity": 4,
      "element": "cryo",
      "weapon": "bow",
      "image_url": "https://paimon.moe/images/characters/diona.png"
    },
    {
      "name": "Eula",
      "rarity": 5,
      "element": "cryo",
      "weapon": "claymore",
      "image_url": "https://paimon.moe/images/characters/eula.png"
    },
    {
      "name": "Fischl",
      "rarity": 4,
      "element": "electro",
      "weapon": "bow",
      "image_url": "https://paimon.moe/images/characters/fischl.png"
    },
    {
      "name": "Ganyu",
      "rarity": 5,
      "element": "cryo",
      "weapon": "bow",
      "image_url": "https://paimon.moe/images/characters/ganyu.png"
    },
    {
      "name": "Gorou",
      "rarity": 4,
      "element": "geo",
      "weapon": "bow",
      "image_url": "https://paimon.moe/images/characters/gorou.png"
    },
    {
      "name": "Hu Tao",
      "rarity": 5,
      "element": "pyro",
      "weapon": "polearm",
      "image_url": "https://paimon.moe/images/characters/hu_tao.png"
    },
    {
      "name": "Jean",
      "rarity": 5,
      "element": "anemo",
      "weapon": "sword",
      "image_url": "https://paimon.moe/images/characters/jean.png"
    },
    {
      "name": "Kaedehara Kazuha",
      "rarity": 5,
      "element": "anemo",
      "weapon": "sword",
      "image_url": "https://paimon.moe/images/characters/kaedehara_kazuha.png"
    },
    {
      "name": "Kaeya",
      "rarity": 4,
      "element": "cryo",
      "weapon": "sword",
      "image_url": "https://paimon.moe/images/characters/kaeya.png"
    },
    {
      "name": "Kamisato Ayaka",
      "rarity": 5,
      "element": "cryo",
      "weapon": "sword",
      "image_url": "https://paimon.moe/images/characters/kamisato_ayaka.png"
    },
    {
      "name": "Kamisato Ayato",
      "rarity": 5,
      "element": "hydro",
      "weapon": "sword",
      "image_url": "https://paimon.moe/images/characters/kamisato_ayato.png"
    },
    {
      "name": "Keqing",
      "rarity": 5,
      "element": "electro",
      "weapon": "sword",
      "image_url": "https://paimon.moe/images/characters/keqing.png"
    },
    {
      "name": "Klee",
      "rarity": 5,
      "element": "pyro",
      "weapon": "catalyst",
      "image_url": "https://paimon.moe/images/characters/klee.png"
    },
    {
      "name": "Kujou Sara",
      "rarity": 4,
      "element": "electro",
      "weapon": "bow",
      "image_url": "https://paimon.moe/images/characters/kujou_sara.png"
    },
    {
      "name": "Kuki Shinobu",
      "rarity": 4,
      "element": "electro",
      "weapon": "sword",
      "image_url": "https://paimon.moe/images/characters/kuki_shinobu.png"
    },
    {
      "name": "Lisa",
      "rarity": 4,
      "element": "electro",
      "weapon": "catalyst",
      "image_url": "https://paimon.moe/images/characters/lisa.png"
    },
    {
      "name": "Mona",
      "rarity": 5,
      "element": "hydro",
      "weapon": "catalyst",
      "image_url": "https://paimon.moe/images/characters/mona.png"
    },
    {
      "name": "Ningguang",
      "rarity": 4,
      "element": "geo",
      "weapon": "catalyst",
      "image_url": "https://paimon.moe/images/characters/ningguang.png"
    },
    {
      "name": "Noelle",
      "rarity": 4,
      "element": "geo",
      "weapon": "claymore",
      "image_url": "https://paimon.moe/images/characters/noelle.png"
    },
    {
      "name": "Qiqi",
      "rarity": 5,
      "element": "cryo",
      "weapon": "sword",
      "image_url": "https://paimon.moe/images/characters/qiqi.png"
    },
    {
      "name": "Raiden Shogun",
      "rarity": 5,
      "element": "electro",
      "weapon": "polearm",
      "image_url": "https://paimon.moe/images/characters/raiden_shogun.png"
    },
    {
      "name": "Razor",
      "rarity": 4,
      "element": "electro",
      "weapon": "claymore",
      "image_url": "https://paimon.moe/images/characters/razor.png"
    },
    {
      "name": "Rosaria",
      "rarity": 4,
      "element": "cryo",
      "weapon": "polearm",
      "image_url": "https://paimon.moe/images/characters/rosaria.png"
    },
    {
      "name": "Sangonomiya Kokomi",
      "rarity": 5,
      "element": "hydro",
      "weapon": "catalyst",
      "image_url": "https://paimon.moe/images/characters/sangonomiya_kokomi.png"
    },
    {
      "name": "Sayu",
      "rarity": 4,
      "element": "anemo",
      "weapon": "claymore",
      "image_url": "https://paimon.moe/images/characters/sayu.png"
    },
    {
      "name": "Shenhe",
      "rarity": 5,
      "element": "cryo",
      "weapon": "polearm",
      "image_url": "https://paimon.moe/images/characters/shenhe.png"
    },
    {
      "name": "Shikanoin Heizou",
      "rarity": 4,
      "element": "anemo",
      "weapon": "catalyst",
      "image_url": "https://paimon.moe/images/characters/shikanoin_heizou.png"
    },
    {
      "name": "Sucrose",
      "rarity": 4,
      "element": "anemo",
      "weapon": "catalyst",
      "image_url": "https://paimon.moe/images/characters/sucrose.png"
    },
    {
      "name": "Tartaglia",
      "rarity": 5,
      "element": "hydro",
      "weapon": "bow",
      "image_url": "https://paimon.moe/images/characters/tartaglia.png"
    },
    {
      "name": "Thoma",
      "rarity": 4,
      "element": "pyro",
      "weapon": "polearm",
      "image_url": "https://paimon.moe/images/characters/thoma.png"
    },
   {
      "name": "Tighnari",
      "rarity": 5,
      "element": "dendro",
      "weapon": "bow",
      "image_url": "https://paimon.moe/images/characters/tighnari.png"
    },
    {
      "name": "Traveler   (Anemo)",
      "rarity": 5,
      "element": "anemo",
      "weapon": "sword",
      "image_url": "https://paimon.moe/images/characters/traveler_anemo.png"
    },
    {
      "name": "Traveler   (Electro)",
      "rarity": 5,
      "element": "electro",
      "weapon": "sword",
      "image_url": "https://paimon.moe/images/characters/traveler_anemo.png"
    },
    {
      "name": "Traveler   (Geo)",
      "rarity": 5,
      "element": "geo",
      "weapon": "sword",
      "image_url": "https://paimon.moe/images/characters/traveler_anemo.png"
    },

   {
      "name": "Traveler   (Denro)",
      "rarity": 5,
      "element": "dendro",
      "weapon": "sword",
      "image_url": "https://paimon.moe/images/characters/traveler_anemo.png"
    },
    {
      "name": "Venti",
      "rarity": 5,
      "element": "anemo",
      "weapon": "bow",
      "image_url": "https://paimon.moe/images/characters/venti.png"
    },
    {
      "name": "Xiangling",
      "rarity": 4,
      "element": "pyro",
      "weapon": "polearm",
      "image_url": "https://paimon.moe/images/characters/xiangling.png"
    },
    {
      "name": "Xiao",
      "rarity": 5,
      "element": "anemo",
      "weapon": "polearm",
      "image_url": "https://paimon.moe/images/characters/xiao.png"
    },
    {
      "name": "Xingqiu",
      "rarity": 4,
      "element": "hydro",
      "weapon": "sword",
      "image_url": "https://paimon.moe/images/characters/xingqiu.png"
    },
    {
      "name": "Xinyan",
      "rarity": 4,
      "element": "pyro",
      "weapon": "claymore",
      "image_url": "https://paimon.moe/images/characters/xinyan.png"
    },
    {
      "name": "Yae Miko",
      "rarity": 5,
      "element": "electro",
      "weapon": "catalyst",
      "image_url": "https://paimon.moe/images/characters/yae_miko.png"
    },
    {
      "name": "Yanfei",
      "rarity": 4,
      "element": "pyro",
      "weapon": "catalyst",
      "image_url": "https://paimon.moe/images/characters/yanfei.png"
    },
    {
      "name": "Yelan",
      "rarity": 5,
      "element": "hydro",
      "weapon": "bow",
      "image_url": "https://paimon.moe/images/characters/yelan.png"
    },
    {
      "name": "Yoimiya",
      "rarity": 5,
      "element": "pyro",
      "weapon": "bow",
      "image_url": "https://paimon.moe/images/characters/yoimiya.png"
    },
    {
      "name": "Yun Jin",
      "rarity": 4,
      "element": "geo",
      "weapon": "polearm",
      "image_url": "https://paimon.moe/images/characters/yun_jin.png"
    },
    {
      "name": "Zhongli",
      "rarity": 5,
      "element": "geo",
      "weapon": "polearm",
      "image_url": "https://paimon.moe/images/characters/zhongli.png"
    }
  ]
        """.trimIndent()
}
