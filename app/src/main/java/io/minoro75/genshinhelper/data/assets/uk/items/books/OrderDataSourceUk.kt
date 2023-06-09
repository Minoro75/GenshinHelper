package io.minoro75.genshinhelper.data.assets.uk.items.books

import org.intellij.lang.annotations.Language

object OrderDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "про Порядок",
            "domain_name": "Pale Forgotten Glory",
            "description": "Ви можете отримати книжки про Порядок, як нагороду за проходження підземелля в Фонтейні"
          }
        ]
    """.trimIndent()
}
