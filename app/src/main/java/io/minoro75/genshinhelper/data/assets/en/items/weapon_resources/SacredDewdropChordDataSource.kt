package io.minoro75.genshinhelper.data.assets.en.items.weapon_resources

import org.intellij.lang.annotations.Language

object SacredDewdropChordDataSource {
    /** here we define our JSON instead of reading from assets **/

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Sacred Dewdrop",
            "domain_name": "Echoes of the Deep Tides",
            "description": "You can collect Sacred Dewdrop resources as a random reward from the domain located in Fontaine"
          }
        ]
    """.trimIndent()
}