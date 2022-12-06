package io.minoro75.genshinhelper.data.assets.uk.items.artifacts

import org.intellij.lang.annotations.Language

object HuskOfOpulentDreamsDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Пробудження від сну",
            "domain_name": "Slumbering Court",
            "description": "Нагорода за проходженя підземелля"
          }
        ]
    """.trimIndent()
}
