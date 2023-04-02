package io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt

import org.intellij.lang.annotations.Language

object HeartOfDepthDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Profundezas do Coração",
            "domain_name": "Peak of Vindagnyr",
            "description": "Recompensa do Domínio"
          },
          {
            "name": "Profundezas do Coração",
            "domain_name": "Artifact Strongbox: Heart of Depth",
            "description": "Vá para um Balcão de Síntese e use o Relicário: Profundezas do Coração para converter pelo menos 3 artefatos em um novo artefato."
          }
        ]
    """.trimIndent()
}