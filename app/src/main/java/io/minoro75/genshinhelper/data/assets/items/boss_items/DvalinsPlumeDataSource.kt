package io.minoro75.genshinhelper.data.assets.items.boss_items

import org.intellij.lang.annotations.Language

object DvalinsPlumeDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Dvalin's Plume",
            "domain_name": "Confront Stormterror",
            "description": "You can collect Dvalin's Plume as a random reward from the Stormterror domain located in Stormterror's Lair."
          }
        ]
    """.trimIndent()
}