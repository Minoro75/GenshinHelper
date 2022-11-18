package io.minoro75.genshinhelper.data.assets.ru.items_ru.books_ru

import org.intellij.lang.annotations.Language

object IngenuityDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "об Остроумии",
            "domain_name": "Башня невежества",
            "description": "Вы можете получить книги об Остроумии как награду из подземелья в Сумеру"
          }
        ]
    """.trimIndent()
}
