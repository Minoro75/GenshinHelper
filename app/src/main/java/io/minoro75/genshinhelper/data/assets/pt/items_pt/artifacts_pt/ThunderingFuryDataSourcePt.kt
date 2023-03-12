package io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt

import org.intellij.lang.annotations.Language

object ThunderingFuryDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Thundering Fury",
            "domain_name": "Midsummer Courtyard",
            "description": "Domain reward"
          },
          {
            "name": "Thundering Fury",
            "domain_name": "Artifact Strongbox: Thundering Fury",
            "description": "Go to a Crafting table and use the Artifact Strongbox: Thundering Fury to convert at least 3 Artifacts into one brand new artifact."
          }
        ]
    """.trimIndent()
}