package io.minoro75.genshinhelper.data.assets.pt.items_pt.books_pt

import org.intellij.lang.annotations.Language

object OrderDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Ordem",
            "domain_name": "Pale Forgotten Glory",
            "description": "Você pode coletar os livros do conjunto Ordem como recompensas aleatórias do domínio localizado em Fontaine."
          }
        ]
    """.trimIndent()
}
