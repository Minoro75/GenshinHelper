package io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt

import org.intellij.lang.annotations.Language

object ThundersootherDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Lançador de Trovões",
            "domain_name": "Midsummer Courtyard",
            "description": "Jardim do Verão"
          },
          {
            "name": "Lançador de Trovões",
            "domain_name": "Artifact Strongbox: Thundersoother",
            "description": "Vá para um Balcão de Síntese e use o Relicário: Lançador de Trovões para converter pelo menos 3 artefatos em um novo artefato."
          }
        ]
    """.trimIndent()
}