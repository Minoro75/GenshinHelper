package io.minoro75.genshinhelper.data.assets.uk.items.artifacts

import org.intellij.lang.annotations.Language

object GoldenTroupeDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Золота трупа",
            "domain_name": "Denouement of Sin",
            "description": "Нагорода за проходженя підземелля"
          }
        ]
    """.trimIndent()
}
