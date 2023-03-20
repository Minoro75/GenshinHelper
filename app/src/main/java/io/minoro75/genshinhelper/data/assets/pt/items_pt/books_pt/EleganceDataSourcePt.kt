package io.minoro75.genshinhelper.data.assets.pt.items_pt.books_pt

import org.intellij.lang.annotations.Language

object EleganceDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Cultura",
            "domain_name": "Violet Court",
            "description": "Você pode coletar os livros do conjunto Cultura como recompensas aleatórias do domínio localizado em Inazuma."
          }
        ]
    """.trimIndent()
}
