package io.minoro75.genshinhelper.data.assets.en.items.artifacts

import org.intellij.lang.annotations.Language

object NighttimeWhispersDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Nighttime Whispers",
            "domain_name": "Waterfall Wen",
            "description": "Domain reward"
          }
        ]
    """.trimIndent()
}
