package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import org.intellij.lang.annotations.Language

object HellfireButterflyDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Hellfire Butterfly",
            "domain_name": "Narukami Island: Tenshukaku",
            "description": "You can collect Hellfire Butterfly as a random reward from the Signora domain located in Inazuma City"
          },
          {
            "name": "Hellfire Butterfly",
            "domain_name": "Convert: Hellfire Butterfly",
            "description": "Go to a Crafting table and use the Convert section to convert one item to another."
          }
        ]
    """.trimIndent()
}