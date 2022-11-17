package io.minoro75.genshinhelper.data.assets.ru.books_ru

import org.intellij.lang.annotations.Language

object LightDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "о Свете",
            "domain_name": "Фиалковый зал",
            "description": "Вы можете получить книги об Усердии как награду из подземелья в Инадзуме"
          }
        ]
    """.trimIndent()
}