package io.minoro75.genshinhelper.data.assets.items.weapon_resources

import org.intellij.lang.annotations.Language

object DandelionGladiatorDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Dandelion Gladiator",
            "domain_name": "Cecilia Garden",
            "description": "You can collect Dandelion Gladiator's resources as a random reward from the domain located in Mondstadt"
          }
        ]
    """.trimIndent()
}