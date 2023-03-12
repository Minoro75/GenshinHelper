package io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt

import org.intellij.lang.annotations.Language

object LavawalkerDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Lavawalker",
            "domain_name": "Hidden Palace of Zhou Formula",
            "description": "Domain reward"
          },
          {
            "name": "Lavawalker",
            "domain_name": "Artifact Strongbox: Lavawalker",
            "description": "Go to a Crafting table and use the Artifact Strongbox: Lavawalker to convert at least 3 Artifacts into one brand new artifact."
          }
        ]
    """.trimIndent()
}