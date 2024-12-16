package io.minoro75.genshinhelper.data.assets.en.items.boss_items

import org.intellij.lang.annotations.Language

object DenialAndJudgmentDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Denial and Judgment",
            "domain_name": "Scattered Ruins",
            "description": "You can collect Denial and Judgment as a random reward from the Arlecchino domain located in Fontaine"
          },
          {
            "name": "Denial and Judgment",
            "domain_name": "Convert: Denial and Judgment",
            "description": "Go to a Crafting table and use the Convert section to convert one item to another."
          }
        ]
    """.trimIndent()
}