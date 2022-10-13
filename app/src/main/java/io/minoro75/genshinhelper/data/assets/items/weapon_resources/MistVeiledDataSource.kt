package io.minoro75.genshinhelper.data.assets.items.weapon_resources

import org.intellij.lang.annotations.Language

object MistVeiledDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Mist Veiled",
            "domain_name": "Hidden Palace of Lianshan Formula",
            "description": "You can collect Mist Veiled resources as a random reward from the domain located in Liyue"
          }
        ]
    """.trimIndent()
}