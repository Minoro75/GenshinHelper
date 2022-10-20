package io.minoro75.genshinhelper.data.assets.items.artifacts

import org.intellij.lang.annotations.Language

object OceanHuedClamDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Ocean-Hued Clam",
            "domain_name": "Slumbering Court",
            "description": "Domain reward"
          }
        ]
    """.trimIndent()
}