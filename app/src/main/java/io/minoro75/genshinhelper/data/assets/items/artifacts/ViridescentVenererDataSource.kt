package io.minoro75.genshinhelper.data.assets.items.artifacts

import org.intellij.lang.annotations.Language

object ViridescentVenererDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Viridescent Venerer",
            "domain_name": "Valley of Remembrance",
            "description": "Domain reward"
          },
          {
            "name": "Viridescent Venerer",
            "domain_name": "Artifact Strongbox: Viridescent Venerer",
            "description": "Go to a Crafting table and use the Artifact Strongbox: Viridescent Venerer to convert at least 3 Artifacts into one brand new artifact."
          }
        ]
    """.trimIndent()
}