package io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru

import org.intellij.lang.annotations.Language

object ShimenavasReminiscenceDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Воспоминания Симэнавы",
            "domain_name": "Momiji-Dyed Court",
            "description": "Награда подземелья"
          }
        ]
    """.trimIndent()
}