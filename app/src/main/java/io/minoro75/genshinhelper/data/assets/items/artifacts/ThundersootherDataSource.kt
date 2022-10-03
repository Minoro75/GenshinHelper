package io.minoro75.genshinhelper.data.assets.items.artifacts

import org.intellij.lang.annotations.Language

object ThundersootherDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Thundersoother",
            "domain_name": "Midsummer Courtyard",
            "description": "Domain reward"
          }
        ]
    """.trimIndent()
}