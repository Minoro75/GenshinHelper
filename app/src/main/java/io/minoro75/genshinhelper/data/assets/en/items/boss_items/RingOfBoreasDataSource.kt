package io.minoro75.genshinhelper.data.assets.en.items.boss_items

import org.intellij.lang.annotations.Language

object RingOfBoreasDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Ring of Boreas",
            "domain_name": "Lupus Boreas, Dominator of Wolves",
            "description": "You can collect Ring of Boreas as a random reward from the Lupus Boreas located in Wolvendom."
          },
          {
            "name": "Ring of Boreas",
            "domain_name": "Convert: Ring of Boreas",
            "description": "Go to a Crafting table and use the Convert section to convert one item to another."
          }
        ]
    """.trimIndent()
}