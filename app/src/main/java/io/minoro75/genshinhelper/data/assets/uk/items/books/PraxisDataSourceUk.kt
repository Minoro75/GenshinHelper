package io.minoro75.genshinhelper.data.assets.uk.items.books

import org.intellij.lang.annotations.Language

object PraxisDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "про Діяння",
            "domain_name": "Steeple of Ignorance",
            "description": "Ви можете отримати книжки про Діяння, як нагороду за проходження підземелля в Сумеру"
          }
        ]
    """.trimIndent()
}