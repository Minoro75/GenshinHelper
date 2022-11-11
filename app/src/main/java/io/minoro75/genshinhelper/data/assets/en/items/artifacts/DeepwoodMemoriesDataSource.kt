package io.minoro75.genshinhelper.data.assets.en.items.artifacts

import org.intellij.lang.annotations.Language

object DeepwoodMemoriesDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Deepwood Memories",
            "domain_name": "Spire of Solitary Enlightenment",
            "description": "Domain reward"
          }
        ]
    """.trimIndent()
}