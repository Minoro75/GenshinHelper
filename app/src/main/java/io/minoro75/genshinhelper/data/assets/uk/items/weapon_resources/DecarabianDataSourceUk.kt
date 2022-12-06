package io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources

import org.intellij.lang.annotations.Language

object DecarabianDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Декарабіан",
            "domain_name": "Cecilia Garden",
            "description": "You can collect Decarabian resources as a random reward from the domain located in Mondstadt"
          }
        ]
    """.trimIndent()
}