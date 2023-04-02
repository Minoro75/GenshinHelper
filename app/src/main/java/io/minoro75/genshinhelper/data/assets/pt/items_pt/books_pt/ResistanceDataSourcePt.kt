package io.minoro75.genshinhelper.data.assets.pt.items_pt.books_pt

import org.intellij.lang.annotations.Language

object ResistanceDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Resistência",
            "domain_name": "Forsaken Rift",
            "description": "Você pode coletar os livros do conjunto Resistência como recompensas aleatórias do domínio localizado em Mondstadt."
          }
        ]
    """.trimIndent()
}