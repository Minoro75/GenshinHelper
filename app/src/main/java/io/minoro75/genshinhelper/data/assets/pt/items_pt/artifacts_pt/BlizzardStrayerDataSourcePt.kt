package io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt

import org.intellij.lang.annotations.Language

object BlizzardStrayerDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Herói Invernal",
            "domain_name": "Peak of Vindagnyr",
            "description": "Recompensa do Domínio"
          },
          {
            "name": "Herói Invernal",
            "domain_name": "Artifact Strongbox: Blizzard Strayer",
            "description": "Vá para um Balcão de Síntese e use o Relicário: Herói Invernal para converter pelo menos 3 artefatos em um novo artefato."
          }
        ]
    """.trimIndent()
}
