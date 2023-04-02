package io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt

import org.intellij.lang.annotations.Language

object WanderersTroupeDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Trupe Itinerante",
            "domain_name": "Bosses",
            "description": "Recompensa de Qualquer Chefe"
          },
          {
            "name": "Trupe Itinerante",
            "domain_name": "Artifact Strongbox: Wanderer's Troupe",
            "description": "Vá para um Balcão de Síntese e use o Relicário: Trupe Itinerante para converter pelo menos 3 artefatos em um novo artefato."
          }
        ]
    """.trimIndent()
}