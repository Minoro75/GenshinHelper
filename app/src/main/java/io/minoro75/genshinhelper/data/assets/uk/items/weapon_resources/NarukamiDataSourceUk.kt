package io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources

import org.intellij.lang.annotations.Language

object NarukamiDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Нарукамі",
            "domain_name": "Court of Flowing Sand",
            "description": "You can collect Narukami resources as a random reward from the domain located in Inazuma"
          }
        ]
    """.trimIndent()
}