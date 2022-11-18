package io.minoro75.genshinhelper.data.assets.en.items.weapon_resources

import org.intellij.lang.annotations.Language

object ForestDewDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Forest Dew",
            "domain_name": "Tower of Abject Pride",
            "description": "You can collect Forest Dews resources as a random reward from the domain located in Sumeru"
          }
        ]
    """.trimIndent()
}