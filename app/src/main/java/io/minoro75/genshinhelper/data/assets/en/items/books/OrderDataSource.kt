package io.minoro75.genshinhelper.data.assets.en.items.books

import org.intellij.lang.annotations.Language

object OrderDataSource {
    /** here we define our JSON instead of reading from assets **/

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Order",
            "domain_name": "Pale Forgotten Glory",
            "description": "You can collect Order books as a random reward from the domain located in Fontaine"
          }
        ]
    """.trimIndent()
}
