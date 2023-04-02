package io.minoro75.genshinhelper.data.assets.pt.items_pt.books_pt

import org.intellij.lang.annotations.Language

object DiligenceDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Esforço",
            "domain_name": "Taishan Mansion",
            "description": "Você pode coletar os livros do conjunto Esforço como recompensas aleatórias do domínio localizado em Liyue."
          }
        ]
    """.trimIndent()
}
