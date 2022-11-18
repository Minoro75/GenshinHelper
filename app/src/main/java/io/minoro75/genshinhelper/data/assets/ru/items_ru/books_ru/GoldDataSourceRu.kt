package io.minoro75.genshinhelper.data.assets.ru.items_ru.books_ru

import org.intellij.lang.annotations.Language

object GoldDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "о Золоте",
            "domain_name": "Тайшаньфу",
            "description": "Вы можете получить книги о Золоте как награду из подземелья в Ли Юэ"
          }
        ]
    """.trimIndent()
}