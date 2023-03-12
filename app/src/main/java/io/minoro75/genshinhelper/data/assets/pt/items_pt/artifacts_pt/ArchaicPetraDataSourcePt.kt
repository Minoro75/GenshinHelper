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
            "name": "Archaic Petra",
            "domain_name": "Domain of Guyun",
            "description": "Domain reward"
          },
          {
            "name": "Archaic Petra",
            "domain_name": "Artifact Strongbox: Archaic Petra",
            "description": "Go to a Crafting table and use the Artifact Strongbox: Archaic Petra to convert at least 3 Artifacts into one brand new artifact."
          }
        ]
    """.trimIndent()
}