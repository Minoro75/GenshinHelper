package io.minoro75.genshinhelper.data.assets.en.items.books

import org.intellij.lang.annotations.Language

object AdmonitionDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Admonition",
            "domain_name": "Steeple of Ignorance",
            "description": "You can collect Admonition books as a random reward from the domain located in Sumeru"
          }
        ]
    """.trimIndent()
}
