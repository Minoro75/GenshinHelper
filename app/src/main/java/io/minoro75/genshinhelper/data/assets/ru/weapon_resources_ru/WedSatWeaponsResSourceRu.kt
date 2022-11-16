package io.minoro75.genshinhelper.data.assets.ru.weapon_resources_ru

import org.intellij.lang.annotations.Language

object WedSatWeaponsResSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val resourcesList = """
        [
          {
            "name": "Львиный клык",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/4/40/Item_Shackles_of_the_Dandelion_Gladiator.png"
          },
          {
            "name": "Чёрный сидерит",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/1/17/Item_Bit_of_Aerosiderite.png"
          },
          {
            "name": "Маска",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/a/a9/Item_Mask_of_the_One-Horned.png"
          },
          {
            "name": "Пылающая мощь",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/a/af/Item_Dream_of_Scorching_Might.png"
          }
        ]
    """.trimIndent()
}
