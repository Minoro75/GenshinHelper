package io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources

import org.intellij.lang.annotations.Language

object GuyunDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Гуюнь",
            "domain_name": "Hidden Palace of Lianshan Formula",
            "description": "You can collect Guyun's resources as a random reward from the domain located in Liyue"
          }
        ]
    """.trimIndent()
}