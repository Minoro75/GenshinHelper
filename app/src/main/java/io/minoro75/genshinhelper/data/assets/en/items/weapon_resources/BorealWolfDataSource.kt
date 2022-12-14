package io.minoro75.genshinhelper.data.assets.en.items.weapon_resources

import org.intellij.lang.annotations.Language

object BorealWolfDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Boreal Wolf",
            "domain_name": "Cecilia Garden",
            "description": "You can collect Boreal Wolf's resources as a random reward from the domain located in Mondstadt"
          }
        ]
    """.trimIndent()
}