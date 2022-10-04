package io.minoro75.genshinhelper.data.assets.items.boss_items

import org.intellij.lang.annotations.Language

object SpiritLocketOfBoreasDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Spirit Locket of Boreas",
            "domain_name": "Lupus Boreas, Dominator of Wolves",
            "description": "You can collect Spirit Locket of Boreas as a random reward from the Lupus Boreas located in Wolvendom."
          }
        ]
    """.trimIndent()
}