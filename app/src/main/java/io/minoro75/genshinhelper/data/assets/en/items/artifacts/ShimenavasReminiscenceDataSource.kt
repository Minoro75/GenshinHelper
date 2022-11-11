package io.minoro75.genshinhelper.data.assets.en.items.artifacts

import org.intellij.lang.annotations.Language

object ShimenavasReminiscenceDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Shimenawa's Reminiscence",
            "domain_name": "Momiji-Dyed Court",
            "description": "Domain reward"
          }
        ]
    """.trimIndent()
}