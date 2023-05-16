package io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru

import org.intellij.lang.annotations.Language

object PaleFlameDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Бледный огонь",
            "domain_name": "Ridge Watch",
            "description": "Награда подземелья"
          }
        ]
    """.trimIndent()
}