package io.minoro75.genshinhelper.data.assets.en.items.artifacts

import org.intellij.lang.annotations.Language

object VermilionHereafterDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Vermillion Hereafter",
            "domain_name": "The Lost Valley",
            "description": "Domain reward"
          }
        ]
    """.trimIndent()
}