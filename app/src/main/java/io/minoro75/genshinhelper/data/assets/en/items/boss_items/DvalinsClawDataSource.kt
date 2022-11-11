package io.minoro75.genshinhelper.data.assets.en.items.boss_items

import org.intellij.lang.annotations.Language

object DvalinsClawDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Dvalin's Claw",
            "domain_name": "Confront Stormterror",
            "description": "You can collect Dvalin's Claw as a random reward from the Stormterror domain located in Stormterror's Lair."
          },
          {
            "name": "Dvalin's Claw",
            "domain_name": "Convert: Dvalin's Claw",
            "description": "Go to a Crafting table and use the Convert section to convert one item to another."
          }
        ]
    """.trimIndent()
}