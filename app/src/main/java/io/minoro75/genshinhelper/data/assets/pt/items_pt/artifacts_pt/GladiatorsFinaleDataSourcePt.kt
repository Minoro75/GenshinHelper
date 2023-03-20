package io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt

import org.intellij.lang.annotations.Language

object GladiatorsFinaleDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Último Juramento do Gladiador",
            "domain_name": "Bosses",
            "description": "Recompensa de Qualquer Chefe"
          },
          {
            "name": "Último Juramento do Gladiador",
            "domain_name": "Artifact Strongbox: Gladiator's Finale",
            "description": "Vá para um Balcão de Síntese e use o Relicário: Último Juramento do Gladiador para converter pelo menos 3 artefatos em um novo artefato."
          }
        ]
    """.trimIndent()
}