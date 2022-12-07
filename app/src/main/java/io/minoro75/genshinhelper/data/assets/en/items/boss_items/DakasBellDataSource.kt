package io.minoro75.genshinhelper.data.assets.en.items.boss_items

import io.minoro75.genshinhelper.common.Constants
import org.intellij.lang.annotations.Language

object DakasBellDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = Constants.gameVersion

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Daka's Bell",
            "domain_name": "Joururi Workshop",
            "description": "You can collect the Daka's Bell as a random reward from the Scaramouche Domain located near Sumeru City."
          },
          {
            "name": "Daka's Bell",
            "domain_name": "Convert: Daka's Bell",
            "description": "Go to a Crafting table and use the Convert section to convert one item to another."
          }
        ]
    """.trimIndent()
}