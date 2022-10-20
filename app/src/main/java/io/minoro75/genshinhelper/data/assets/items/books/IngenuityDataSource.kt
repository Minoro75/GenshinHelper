package io.minoro75.genshinhelper.data.assets.items.books

import org.intellij.lang.annotations.Language

object IngenuityDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Ingenuity",
            "domain_name": "Steeple of Ignorance",
            "description": "You can collect Ingenuity books as a random reward from the domain located in Sumeru"
          }
        ]
    """.trimIndent()
}
