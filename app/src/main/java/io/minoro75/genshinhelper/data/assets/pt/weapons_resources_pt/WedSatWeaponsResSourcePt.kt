package io.minoro75.genshinhelper.data.assets.pt.weapons_resources_pt

import org.intellij.lang.annotations.Language

object WedSatWeaponsResSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val resourcesList = """
        [
          {
            "name": "Gladiador de Dandelion",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/4/40/Item_Shackles_of_the_Dandelion_Gladiator.png"
          },
          {
            "name": "Aerosiderite",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/1/17/Item_Bit_of_Aerosiderite.png"
          },
          {
            "name": "Máscara",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a9/Item_Mask_of_the_One-Horned.png"
          },
          {
            "name": "Poder Escaldante",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/a/af/Item_Dream_of_Scorching_Might.png"
          },
          {
            "name": "Prata do Mar Pristino",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/5/54/Item_Silver_Goblet_of_the_Pristine_Sea.png"
          }
        ]
    """.trimIndent()
}
