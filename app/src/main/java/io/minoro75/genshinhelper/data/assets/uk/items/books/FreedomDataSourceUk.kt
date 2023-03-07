package io.minoro75.genshinhelper.data.assets.uk.items.books

import org.intellij.lang.annotations.Language

object FreedomDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "про Волю",
            "domain_name": "Forsaken Rift",
            "description": "Ви можете отримати книжки про Волю, як нагороду за проходження підземелля в Мондштаді"
          }
        ]
    """.trimIndent()
}