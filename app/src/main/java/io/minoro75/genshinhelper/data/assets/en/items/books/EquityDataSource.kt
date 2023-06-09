package io.minoro75.genshinhelper.data.assets.en.items.books

import org.intellij.lang.annotations.Language

object EquityDataSource {
    /** here we define our JSON instead of reading from assets **/

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Equity",
            "domain_name": "Pale Forgotten Glory",
            "description": "You can collect Equity books as a random reward from the domain located in Fontaine"
          }
        ]
    """.trimIndent()
}
