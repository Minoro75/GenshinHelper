package io.minoro75.genshinhelper.data.assets.uk.items.books

import org.intellij.lang.annotations.Language

object AdmonitionDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "про Напоумлення",
            "domain_name": "Steeple of Ignorance",
            "description": "Ви можете отримати книжки про Напоумлення, як нагороду за проходження підземелля в Сумеру"
          }
        ]
    """.trimIndent()
}
