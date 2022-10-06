package io.minoro75.genshinhelper.data.assets.items.artifacts

import org.intellij.lang.annotations.Language

object BloodstainedChivalryDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Bloodstained Chivalry",
            "domain_name": "Clear Pool and Mountain Cavern",
            "description": "Domain reward"
          },
          {
            "name": "Bloodstained Chivalry",
            "domain_name": "Artifact Strongbox: Bloodstained Chivalry",
            "description": "Go to a Crafting table and use the Artifact Strongbox: Bloodstained Chivalry to convert at least 3 Artifacts into one brand new artifact."
          }
        ]
    """.trimIndent()
}