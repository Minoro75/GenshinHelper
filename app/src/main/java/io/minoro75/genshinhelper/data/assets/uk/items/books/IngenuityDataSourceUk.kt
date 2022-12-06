package io.minoro75.genshinhelper.data.assets.uk.items.books

import org.intellij.lang.annotations.Language

object IngenuityDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "про Винахідливість",
            "domain_name": "Steeple of Ignorance",
            "description": "Ви можете отримати книжки про Винахідливість, як нагороду за проходження підземелля в Сумеру"
          }
        ]
    """.trimIndent()
}
