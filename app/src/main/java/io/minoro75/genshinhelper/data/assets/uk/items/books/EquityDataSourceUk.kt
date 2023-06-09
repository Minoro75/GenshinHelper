package io.minoro75.genshinhelper.data.assets.uk.items.books

import org.intellij.lang.annotations.Language

object EquityDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "про Неупередженість",
            "domain_name": "Pale Forgotten Glory",
            "description": "Ви можете отримати книжки про Неупередженість, як нагороду за проходження підземелля в Фонтейні"
          }
        ]
    """.trimIndent()
}
