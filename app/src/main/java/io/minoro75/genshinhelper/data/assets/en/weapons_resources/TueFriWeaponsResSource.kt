package io.minoro75.genshinhelper.data.assets.en.weapons_resources

import org.intellij.lang.annotations.Language

object TueFriWeaponsResSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val resourcesList = """
        [
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
          }
        ]
    """.trimIndent()
}
