package io.minoro75.genshinhelper.data.assets.en.items.artifacts

import org.intellij.lang.annotations.Language

object RetracingBolideDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Retracing Bolide",
            "domain_name": "Domain of Guyun",
            "description": "Domain reward"
          },
          {
            "name": "Retracing Bolide",
            "domain_name": "Artifact Strongbox: Retracing Bolide",
            "description": "Go to a Crafting table and use the Artifact Strongbox: Retracing Bolide to convert at least 3 Artifacts into one brand new artifact."
          }
        ]
    """.trimIndent()
}