package io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt

import org.intellij.lang.annotations.Language

object BloodstainedChivalryDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Cavaleiro Manchado de Sangue",
            "domain_name": "Clear Pool and Mountain Cavern",
            "description": "Recompensa do Domínio"
          },
          {
            "name": "Cavaleiro Manchado de Sangue",
            "domain_name": "Artifact Strongbox: Bloodstained Chivalry",
            "description": "Vá para um Balcão de Síntese e use o Relicário: Cavaleiro Manchado de Sangue para converter pelo menos 3 artefatos em um novo artefato."
          }
        ]
    """.trimIndent()
}