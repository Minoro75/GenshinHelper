package io.minoro75.genshinhelper.data.assets.uk.items.artifacts

import org.intellij.lang.annotations.Language

object EmblemOfSeveredFateDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Емблена відрізаної долі",
            "domain_name": "Momiji-Dyed Court",
            "description": "Нагорода за проходженя підземелля"
          }
        ]
    """.trimIndent()
}