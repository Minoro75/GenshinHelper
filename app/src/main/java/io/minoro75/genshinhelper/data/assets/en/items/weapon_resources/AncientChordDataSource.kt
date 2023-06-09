package io.minoro75.genshinhelper.data.assets.en.items.weapon_resources

import org.intellij.lang.annotations.Language

object AncientChordDataSource {
    /** here we define our JSON instead of reading from assets **/

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Ancient Chord",
            "domain_name": "Echoes of the Deep Tides",
            "description": "You can collect Ancient Chord resources as a random reward from the domain located in Fontaine"
          }
        ]
    """.trimIndent()
}