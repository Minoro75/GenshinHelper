package io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt

import org.intellij.lang.annotations.Language

object GildedDreamsDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Sonhos Dourados",
            "domain_name": "Spire of Solitary Enlightenment",
            "description": "Recompensa do Domínio"
          }
        ]
    """.trimIndent()
}