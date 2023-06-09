package io.minoro75.genshinhelper.data.assets.en.items.books

import org.intellij.lang.annotations.Language

object JusticeDataSource {
    /** here we define our JSON instead of reading from assets **/

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Justice",
            "domain_name": "Pale Forgotten Glory",
            "description": "You can collect Justice books as a random reward from the domain located in Fontaine"
          }
        ]
    """.trimIndent()
}
