package io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt

import org.intellij.lang.annotations.Language

object OceanHuedClamDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Concha Tingida Pelo Mar",
            "domain_name": "Slumbering Court",
            "description": "Recompensa do Domínio"
          }
        ]
    """.trimIndent()
}