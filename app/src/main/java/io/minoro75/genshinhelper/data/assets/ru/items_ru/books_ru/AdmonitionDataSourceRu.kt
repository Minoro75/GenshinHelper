package io.minoro75.genshinhelper.data.assets.ru.items_ru.books_ru

import org.intellij.lang.annotations.Language

object AdmonitionDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "о Наставлениях",
            "domain_name": "Steeple of Ignorance",
            "description": "Вы можете получить книги о Наставлениях как награду из подземелья в Сумеру"
          }
        ]
    """.trimIndent()
}
