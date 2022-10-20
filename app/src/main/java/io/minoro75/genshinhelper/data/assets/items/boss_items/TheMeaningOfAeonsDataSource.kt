package io.minoro75.genshinhelper.data.assets.items.boss_items

import org.intellij.lang.annotations.Language

object TheMeaningOfAeonsDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "The Meaning of Aeons",
            "domain_name": "End of the Oneiric Euthymia",
            "description": "You can collect The Meaning of Aeons as a random reward from the Raiden Shogun Trounce Domain located under the Grand Narukami Shrine."
          },
          {
            "name": "The Meaning of Aeons",
            "domain_name": "Convert: The Meaning of Aeons",
            "description": "Go to a Crafting table and use the Convert section to convert one item to another."
          }
        ]
    """.trimIndent()
}