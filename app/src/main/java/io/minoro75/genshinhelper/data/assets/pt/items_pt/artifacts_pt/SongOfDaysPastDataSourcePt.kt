package io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt

import org.intellij.lang.annotations.Language

object SongOfDaysPastDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Canção do Passado",
            "domain_name": "Waterfall Wen",
            "description": "Recompensa do Domínio"
          }
        ]
    """.trimIndent()
}
