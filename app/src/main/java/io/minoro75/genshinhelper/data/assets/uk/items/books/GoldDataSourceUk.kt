package io.minoro75.genshinhelper.data.assets.uk.items.books

import org.intellij.lang.annotations.Language

object GoldDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "про Золото",
            "domain_name": "Taishan Mansion",
            "description": "Ви можете отримати книжки про Золото, як нагороду за проходження підземелля в Лі Юе"
          }
        ]
    """.trimIndent()
}