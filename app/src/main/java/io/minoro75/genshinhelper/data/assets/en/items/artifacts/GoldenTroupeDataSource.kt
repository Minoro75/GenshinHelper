package io.minoro75.genshinhelper.data.assets.en.items.artifacts

import org.intellij.lang.annotations.Language

object GoldenTroupeDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Golden Troupe",
            "domain_name": "Denouement of Sin",
            "description": "Domain reward"
          }
        ]
    """.trimIndent()
}
