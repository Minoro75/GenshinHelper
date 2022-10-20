package io.minoro75.genshinhelper.data.assets.items.artifacts

import org.intellij.lang.annotations.Language

object EmblemOfSeveredFateDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Emblem of Severed Fate",
            "domain_name": "Momiji-Dyed Court",
            "description": "Domain reward"
          }
        ]
    """.trimIndent()
}