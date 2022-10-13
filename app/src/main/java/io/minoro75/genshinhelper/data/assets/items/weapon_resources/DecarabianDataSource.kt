package io.minoro75.genshinhelper.data.assets.items.weapon_resources

import org.intellij.lang.annotations.Language

object DecarabianDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Decarabian",
            "domain_name": "Cecilia Garden",
            "description": "You can collect Decarabian resources as a random reward from the domain located in Mondstadt"
          }
        ]
    """.trimIndent()
}