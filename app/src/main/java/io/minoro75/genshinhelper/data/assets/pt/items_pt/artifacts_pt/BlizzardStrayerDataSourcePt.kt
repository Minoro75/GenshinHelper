package io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt

import org.intellij.lang.annotations.Language

object BlizzardStrayerDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Blizzard Strayer",
            "domain_name": "Peak of Vindagnyr",
            "description": "Domain reward"
          },
          {
            "name": "Blizzard Strayer",
            "domain_name": "Artifact Strongbox: Blizzard Strayer",
            "description": "Go to a Crafting table and use the Artifact Strongbox: Blizzard Strayer to convert at least 3 Artifacts into one brand new artifact."
          }
        ]
    """.trimIndent()
}
