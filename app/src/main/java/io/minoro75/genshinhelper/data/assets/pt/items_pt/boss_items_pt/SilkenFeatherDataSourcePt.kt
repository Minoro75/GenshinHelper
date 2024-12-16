package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import org.intellij.lang.annotations.Language

object SilkenFeatherDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Pluma de Seda",
            "domain_name": "Scattered Ruins",
            "description": "You can collect Silken Feather as a random reward from the Arlecchino domain located in Fontaine"
          },
          {
            "name": "Pluma de Seda",
            "domain_name": "Convert: Silken Feather",
            "description": "Go to a Crafting table and use the Convert section to convert one item to another."
          }
        ]
    """.trimIndent()
}