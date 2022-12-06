package io.minoro75.genshinhelper.data.assets.uk.items.artifacts

import org.intellij.lang.annotations.Language

object GildedDreamsDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Оздоблені золотом мрії",
            "domain_name": "Spire of Solitary Enlightenment",
            "description": "Нагорода за проходженя підземелля"
          }
        ]
    """.trimIndent()
}