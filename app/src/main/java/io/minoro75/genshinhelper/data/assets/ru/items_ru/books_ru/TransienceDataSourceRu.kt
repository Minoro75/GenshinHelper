package io.minoro75.genshinhelper.data.assets.ru.items_ru.books_ru

import org.intellij.lang.annotations.Language

object TransienceDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "о Бренности",
            "domain_name": "Violet Court",
            "description": "Вы можете получить книги о Бренности как награду из подземелья в Инадзуме"
          }
        ]
    """.trimIndent()
}