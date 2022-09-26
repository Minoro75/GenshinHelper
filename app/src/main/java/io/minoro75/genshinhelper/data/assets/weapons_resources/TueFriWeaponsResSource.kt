package io.minoro75.genshinhelper.data.assets.weapons_resources

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
            "url": "https://paimon.moe/images/items/boreal_wolfs_nostalgia.png"
          },
          {
            "name": "Mist Veiled Elixir",
            "url": "https://paimon.moe/images/items/mist_veiled_primo_elixir.png"
          },
          {
            "name": "Narukami",
            "url": "https://paimon.moe/images/items/narukamis_valor.png"
          },
          {
            "name": "Oasis Garden",
            "url": "https://paimon.moe/images/items/oasis_gardens_truth.png"
          }
        ]
    """.trimIndent()
}
