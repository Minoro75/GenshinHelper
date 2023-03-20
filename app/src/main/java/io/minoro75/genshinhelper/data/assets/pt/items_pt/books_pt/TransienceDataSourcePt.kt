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
            "name": "Mundo Mortal",
            "domain_name": "Violet Court",
            "description": "Você pode coletar os livros do conjunto Mundo Mortal como recompensas aleatórias do domínio localizado em Inazuma."
          }
        ]
    """.trimIndent()
}