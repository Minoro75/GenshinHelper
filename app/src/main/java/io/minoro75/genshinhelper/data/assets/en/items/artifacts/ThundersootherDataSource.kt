package io.minoro75.genshinhelper.data.assets.en.items.artifacts

import org.intellij.lang.annotations.Language

object ThundersootherDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Thundersoother",
            "domain_name": "Midsummer Courtyard",
            "description": "Domain reward"
          },
          {
            "name": "Thundersoother",
            "domain_name": "Artifact Strongbox: Thundersoother",
            "description": "Go to a Crafting table and use the Artifact Strongbox: Thundersoother to convert at least 3 Artifacts into one brand new artifact."
          }
        ]
    """.trimIndent()
}