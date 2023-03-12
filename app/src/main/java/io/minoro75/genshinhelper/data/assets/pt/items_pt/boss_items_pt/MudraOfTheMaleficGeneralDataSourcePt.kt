package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import org.intellij.lang.annotations.Language

object MudraOfTheMaleficGeneralDataSourcePt {
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
          },
          {
            "name": "Mudra of the Malefic General",
            "domain_name": "Convert: Mudra of the Malefic General",
            "description": "Go to a Crafting table and use the Convert section to convert one item to another."
          }
        ]
    """.trimIndent()
}