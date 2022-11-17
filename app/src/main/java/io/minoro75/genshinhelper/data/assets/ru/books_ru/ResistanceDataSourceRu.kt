package io.minoro75.genshinhelper.data.assets.ru.books_ru

import org.intellij.lang.annotations.Language

object ResistanceDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "о Борьбе",
            "domain_name": "Забытый каньон",
            "description": "Вы можете получить книги о Поэзии как награду из подземелья в Мондтштаде"
          }
        ]
    """.trimIndent()
}