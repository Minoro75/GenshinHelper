package io.minoro75.genshinhelper.data.assets.en.items.artifacts

import org.intellij.lang.annotations.Language

object CrimsonWitchOfFlamesDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Crimson Witch of Flames",
            "domain_name": "Hidden Palace of Zhou Formula",
            "description": "Domain reward"
          },
          {
            "name": "Crimson Witch of Flames",
            "domain_name": "Artifact Strongbox: Crimson Witch of Flames",
            "description": "Go to a Crafting table and use the Artifact Strongbox: Crimson Witch of Flames to convert at least 3 Artifacts into one brand new artifact."
          }
        ]
    """.trimIndent()
}