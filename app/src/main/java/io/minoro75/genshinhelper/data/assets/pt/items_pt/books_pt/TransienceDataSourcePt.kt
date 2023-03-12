package io.minoro75.genshinhelper.data.assets.pt.items_pt.books_pt

import org.intellij.lang.annotations.Language

object TransienceDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Transience",
            "domain_name": "Violet Court",
            "description": "You can collect Transience books as a random reward from the domain located in Inazuma"
          }
        ]
    """.trimIndent()
}