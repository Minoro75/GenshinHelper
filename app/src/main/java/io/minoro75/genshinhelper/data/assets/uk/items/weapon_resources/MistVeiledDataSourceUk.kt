package io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources

import org.intellij.lang.annotations.Language

object MistVeiledDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Обвиті туманом",
            "domain_name": "Hidden Palace of Lianshan Formula",
            "description": "You can collect Mist Veiled resources as a random reward from the domain located in Liyue"
          }
        ]
    """.trimIndent()
}