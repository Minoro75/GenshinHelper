package io.minoro75.genshinhelper.data.assets.items.boss_items

import org.intellij.lang.annotations.Language

object TearsOfTheCalamitiousGodDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Tears of the Calamitous God",
            "domain_name": "End of the Oneiric Euthymia",
            "description": "You can collect the Tears of the Calamitous God as a random reward from the Raiden Shogun Trounce Domain located under the Grand Narukami Shrine."
          },
           {
            "name": "Tears of the Calamitous God",
            "domain_name": "Convert: Tears of the Calamitous God",
            "description": "Go to a Crafting table and use the Convert section to convert one item to another."
          }
        ]
    """.trimIndent()
}