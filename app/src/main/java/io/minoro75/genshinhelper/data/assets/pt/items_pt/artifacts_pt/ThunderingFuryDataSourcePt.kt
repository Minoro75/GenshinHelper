package io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt

import org.intellij.lang.annotations.Language

object ThunderingFuryDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Trovão Furioso",
            "domain_name": "Midsummer Courtyard",
            "description": "Recompensa do Domínio"
          },
          {
            "name": "Trovão Furioso",
            "domain_name": "Artifact Strongbox: Thundering Fury",
            "description": "Vá para um Balcão de Síntese e use o Relicário: Trovão Furioso para converter pelo menos 3 artefatos em um novo artefato."
          }
        ]
    """.trimIndent()
}