package io.minoro75.genshinhelper.data.assets.items.weapon_resources

import org.intellij.lang.annotations.Language

object ScorchingMightDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Scorching Might",
            "domain_name": "Tower of Abject Pride",
            "description": "You can collect Scorching Mights resources as a random reward from the domain located in Sumeru"
          }
        ]
    """.trimIndent()
}