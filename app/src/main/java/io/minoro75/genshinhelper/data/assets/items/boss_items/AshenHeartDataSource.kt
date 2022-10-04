package io.minoro75.genshinhelper.data.assets.items.boss_items

import org.intellij.lang.annotations.Language

object AshenHeartDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Ashen Heart",
            "domain_name": "Narukami Island: Tenshukaku",
            "description": "You can collect Ashen Heart as a random reward from the Signora domain located in Inazuma City"
          }
        ]
    """.trimIndent()
}