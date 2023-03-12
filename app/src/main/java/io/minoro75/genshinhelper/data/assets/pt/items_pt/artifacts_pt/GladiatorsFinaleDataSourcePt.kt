package io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt

import org.intellij.lang.annotations.Language

object GladiatorsFinaleDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Gladiator's Finale",
            "domain_name": "Bosses",
            "description": "Any boss drops"
          },
          {
            "name": "Gladiator's Finale",
            "domain_name": "Artifact Strongbox: Gladiator's Finale",
            "description": "Go to a Crafting table and use the Artifact Strongbox: Gladiator's Finale to convert at least 3 Artifacts into one brand new artifact."
          }
        ]
    """.trimIndent()
}