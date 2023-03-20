package io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt

import org.intellij.lang.annotations.Language

object RetracingBolideDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Meteoro Invertido",
            "domain_name": "Domain of Guyun",
            "description": "Recompensa do Domínio"
          },
          {
            "name": "Meteoro Invertido",
            "domain_name": "Artifact Strongbox: Retracing Bolide",
            "description": "Vá para um Balcão de Síntese e use o Relicário: Meteoro Invertido para converter pelo menos 3 artefatos em um novo artefato."
          }
        ]
    """.trimIndent()
}