package io.minoro75.genshinhelper.data.assets.en.items.artifacts

import org.intellij.lang.annotations.Language

object HeartOfDepthDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Heart of Depth",
            "domain_name": "Peak of Vindagnyr",
            "description": "Domain reward"
          },
          {
            "name": "Heart of Depth",
            "domain_name": "Artifact Strongbox: Heart of Depth",
            "description": "Go to a Crafting table and use the Artifact Strongbox: Heart of Depth to convert at least 3 Artifacts into one brand new artifact."
          }
        ]
    """.trimIndent()
}