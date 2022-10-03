package io.minoro75.genshinhelper.data.assets.items.artifacts

import org.intellij.lang.annotations.Language

object EchoesOfTheOfferingDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Echoes of An Offering",
            "domain_name": "The Lost Valley",
            "description": "Domain reward"
          }
        ]
    """.trimIndent()
}