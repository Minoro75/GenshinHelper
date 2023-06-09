package io.minoro75.genshinhelper.data.assets.ru.items_ru.books_ru

import org.intellij.lang.annotations.Language

object OrderDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "о Порядке",
            "domain_name": "Pale Forgotten Glory",
            "description": "Вы можете получить книги о Порядке как награду из подземелья в Фонтейне"
          }
        ]
    """.trimIndent()
}
