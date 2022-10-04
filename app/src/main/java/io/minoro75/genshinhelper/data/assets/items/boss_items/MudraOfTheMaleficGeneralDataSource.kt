package io.minoro75.genshinhelper.data.assets.items.boss_items

import org.intellij.lang.annotations.Language

object MudraOfTheMaleficGeneralDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Mudra of the Malefic General",
            "domain_name": "End of the Oneiric Euthymia",
            "description": "You can collect the Mudra of the Malefic General as a random reward from the Raiden Shogun Trounce Domain located under the Grand Narukami Shrine."
          }
        ]
    """.trimIndent()
}