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
          }
        ]
    """.trimIndent()
}