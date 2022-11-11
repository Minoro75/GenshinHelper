package io.minoro75.genshinhelper.data.assets.en.items.artifacts

import org.intellij.lang.annotations.Language

object WanderersTroupeDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Wanderer's Troupe",
            "domain_name": "Bosses",
            "description": "Any boss drops"
          },
          {
            "name": "Wanderer's Troupe",
            "domain_name": "Artifact Strongbox: Wanderer's Troupe",
            "description": "Go to a Crafting table and use the Artifact Strongbox: Wanderer's Troupe to convert at least 3 Artifacts into one brand new artifact."
          }
        ]
    """.trimIndent()
}