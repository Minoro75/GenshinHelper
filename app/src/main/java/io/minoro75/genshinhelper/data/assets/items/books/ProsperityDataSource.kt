package io.minoro75.genshinhelper.data.assets.items.books

import org.intellij.lang.annotations.Language

object ProsperityDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Prosperity",
            "domain_name": "Taishan Mansion",
            "description": "You can collect Prosperity books as a random reward from the domain located in Liyue"
          }
        ]
    """.trimIndent()
}