package io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt

import org.intellij.lang.annotations.Language

object MaidenBelovedDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Donzela Amada",
            "domain_name": "Valley of Remembrance",
            "description": "Recompensa do Domínio"
          },
          {
            "name": "Donzela Amada",
            "domain_name": "Artifact Strongbox: Maiden Beloved",
            "description": "Vá para um Balcão de Síntese e use o Relicário: Donzela Amada para converter pelo menos 3 artefatos em um novo artefato."
          }
        ]
    """.trimIndent()
}