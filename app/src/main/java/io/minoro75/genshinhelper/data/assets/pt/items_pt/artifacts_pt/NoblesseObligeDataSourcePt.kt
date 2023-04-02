package io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt

import org.intellij.lang.annotations.Language

object NoblesseObligeDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Antigo Ritual Real",
            "domain_name": "Clear Pool and Mountain Cavern",
            "description": "Recompensa do Domínio"
          },
          {
            "name": "Antigo Ritual Real",
            "domain_name": "Artifact Strongbox: Noblesse Oblige",
            "description": "Vá para um Balcão de Síntese e use o Relicário: Antigo Ritual Real para converter pelo menos 3 artefatos em um novo artefato."
          }
        ]
    """.trimIndent()
}