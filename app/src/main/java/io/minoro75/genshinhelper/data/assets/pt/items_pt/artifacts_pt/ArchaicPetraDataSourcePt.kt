package io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt

import org.intellij.lang.annotations.Language

object ArchaicPetraDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Pedra Arcaica",
            "domain_name": "Domain of Guyun",
            "description": "Recompensa do Domínio"
          },
          {
            "name": "Pedra Arcaica",
            "domain_name": "Artifact Strongbox: Archaic Petra",
            "description": "Vá para um Balcão de Síntese e use o Relicário: Pedra Arcaica para converter pelo menos 3 artefatos em um novo artefato."
          }
        ]
    """.trimIndent()
}