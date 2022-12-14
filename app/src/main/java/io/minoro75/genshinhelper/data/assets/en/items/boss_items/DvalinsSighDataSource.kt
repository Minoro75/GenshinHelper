package io.minoro75.genshinhelper.data.assets.en.items.boss_items

import org.intellij.lang.annotations.Language

object DvalinsSighDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Dvalin's Sigh",
            "domain_name": "Confront Stormterror",
            "description": "You can collect Dvalin's Sigh as a random reward from the Stormterror domain located in Stormterror's Lair."
          },
          {
            "name": "Dvalin's Sigh",
            "domain_name": "Convert: Dvalin's Sigh",
            "description": "Go to a Crafting table and use the Convert section to convert one item to another."
          }
        ]
    """.trimIndent()
}