package io.minoro75.genshinhelper.data.assets.en.items.boss_items

import org.intellij.lang.annotations.Language

object MoltenMomentDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Molten Moment",
            "domain_name": "Narukami Island: Tenshukaku",
            "description": "You can collect Molten Moment as a random reward from the Signora domain located in Inazuma City"
          },
          {
            "name": "Molten Moment",
            "domain_name": "Convert: Molten Moment",
            "description": "Go to a Crafting table and use the Convert section to convert one item to another."
          }
        ]
    """.trimIndent()
}