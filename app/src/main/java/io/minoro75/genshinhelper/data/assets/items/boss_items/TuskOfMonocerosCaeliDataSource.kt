package io.minoro75.genshinhelper.data.assets.items.boss_items

import org.intellij.lang.annotations.Language

object TuskOfMonocerosCaeliDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Tusk of Monoceros Caeli",
            "domain_name": "Enter the Golden House",
            "description": "You can collect Tusk of Monoceros Caeli as a random reward from the Childe domain located in Liyue Harbour."
          },
           {
            "name": "Tusk of Monoceros Caeli",
            "domain_name": "Convert: Tusk of Monoceros Caeli",
            "description": "Go to a Crafting table and use the Convert section to convert one item to another."
          }
        ]
    """.trimIndent()
}