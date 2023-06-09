package io.minoro75.genshinhelper.data.assets.en.weapons_resources

import org.intellij.lang.annotations.Language

object WedSatWeaponsResSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val resourcesList = """
        [
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
          },
          {
            "name": "Goblet of the Pristine Sea",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/5/54/Item_Silver_Goblet_of_the_Pristine_Sea.png"
          }
        ]
    """.trimIndent()
}
