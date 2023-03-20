package io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt

import org.intellij.lang.annotations.Language

object ViridescentVenererDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Sombra Verde",
            "domain_name": "Valley of Remembrance",
            "description": "Recompensa do Domínio"
          },
          {
            "name": "Sombra Verde",
            "domain_name": "Artifact Strongbox: Viridescent Venerer",
            "description": "Vá para um Balcão de Síntese e use o Relicário: Sombra Verde para converter pelo menos 3 artefatos em um novo artefato."
          }
        ]
    """.trimIndent()
}