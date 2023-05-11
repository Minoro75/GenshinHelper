package io.minoro75.genshinhelper.data.assets.en.items.boss_items

import org.intellij.lang.annotations.Language

object WorldspanFernDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Worldspan Fern",
            "domain_name": "Realm of Beginnings",
            "description": "You can collect Worldspan Fern as a random reward from the domain located in Sumeru desert"
          },
          {
            "name": "Worldspan Fern",
            "domain_name": "Convert: Worldspan Fern",
            "description": "Go to a Crafting table and use the Convert section to convert one item to another."
          }
        ]
    """.trimIndent()
}