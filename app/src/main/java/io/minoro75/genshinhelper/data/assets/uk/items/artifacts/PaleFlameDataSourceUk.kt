package io.minoro75.genshinhelper.data.assets.uk.items.artifacts

import org.intellij.lang.annotations.Language

object PaleFlameDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Блідий вогонь",
            "domain_name": "Ridge Watch",
            "description": "Нагорода за проходженя підземелля"
          }
        ]
    """.trimIndent()
}