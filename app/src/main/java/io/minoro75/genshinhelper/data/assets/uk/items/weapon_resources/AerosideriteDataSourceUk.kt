package io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources

import org.intellij.lang.annotations.Language

object AerosideriteDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Чорний сидеріт",
            "domain_name": "Hidden Palace of Lianshan Formula",
            "description": "You can collect Aerosiderite's resources as a random reward from the domain located in Liyue"
          }
        ]
    """.trimIndent()
}