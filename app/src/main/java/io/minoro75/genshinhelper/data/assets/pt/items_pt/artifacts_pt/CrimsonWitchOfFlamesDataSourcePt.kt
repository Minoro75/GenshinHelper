package io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt

import org.intellij.lang.annotations.Language

object CrimsonWitchOfFlamesDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "A Bruxa das Chamas Carmesim",
            "domain_name": "Hidden Palace of Zhou Formula",
            "description": "Recompensa do Domínio"
          },
          {
            "name": "A Bruxa das Chamas Carmesim",
            "domain_name": "Artifact Strongbox: Crimson Witch of Flames",
            "description": "Vá para um Balcão de Síntese e use o Relicário: A Bruxa das Chamas Carmesim para converter pelo menos 3 artefatos em um novo artefato."
          }
        ]
    """.trimIndent()
}