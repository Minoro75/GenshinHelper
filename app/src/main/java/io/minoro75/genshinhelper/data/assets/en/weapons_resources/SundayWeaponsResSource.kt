package io.minoro75.genshinhelper.data.assets.en.weapons_resources

import org.intellij.lang.annotations.Language

object SundayWeaponsResSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val resourcesList = """
        [
         {
            "name": "Decarabian",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8a/Item_Fragment_of_Decarabian%27s_Epic.png"
          },
          {
            "name": "Guyun",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/9/94/Item_Relic_from_Guyun.png"
          },
          {
            "name": "Distant Sea",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/2/29/Item_Jade_Branch_of_a_Distant_Sea.png"
          },
          {
            "name": "Forest Dew",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/6/61/Item_Silver_Talisman_of_the_Forest_Dew.png"
          },
          {
            "name": "Boreal Wolf",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/9/98/Item_Boreal_Wolf%27s_Broken_Fang.png"
          },
          {
            "name": "Mist Veiled Elixir",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/9/9b/Item_Mist_Veiled_Gold_Elixir.png"
          },
          {
            "name": "Narukami",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/f/f5/Item_Narukami%27s_Affection.png"
          },
          {
            "name": "Oasis Garden",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/2/23/Item_Oasis_Garden%27s_Mourning.png"
          },
          {
            "name": "Dandelion Gladiator",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/4/40/Item_Shackles_of_the_Dandelion_Gladiator.png"
          },
          {
            "name": "Aerosiderite",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/1/17/Item_Bit_of_Aerosiderite.png"
          },
          {
            "name": "Mask",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a9/Item_Mask_of_the_One-Horned.png"
          },
          {
            "name": "Scorching Might",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/a/af/Item_Dream_of_Scorching_Might.png"
          }
        ]
    """.trimIndent()
}
