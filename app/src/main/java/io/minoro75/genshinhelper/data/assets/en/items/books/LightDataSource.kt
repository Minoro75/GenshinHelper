package io.minoro75.genshinhelper.data.assets.en.items.books

import org.intellij.lang.annotations.Language

object LightDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Light",
            "domain_name": "Violet Court",
            "description": "You can collect Light books as a random reward from the domain located in Inazuma"
          }
        ]
    """.trimIndent()
}