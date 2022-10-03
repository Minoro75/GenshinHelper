package io.minoro75.genshinhelper.data.assets.items.artifacts

import org.intellij.lang.annotations.Language

object RetracingBolideDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Retracing Bolide",
            "domain_name": "Domain of Guyun",
            "description": "Domain reward"
          }
        ]
    """.trimIndent()
}