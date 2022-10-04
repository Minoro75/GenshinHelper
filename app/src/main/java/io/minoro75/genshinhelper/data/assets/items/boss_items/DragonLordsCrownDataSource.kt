package io.minoro75.genshinhelper.data.assets.items.boss_items

import org.intellij.lang.annotations.Language

object DragonLordsCrownDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Dragon Lord's Crown",
            "domain_name": "Beneath the Dragon-Queller",
            "description": "You can collect Dragon Lord's Crown as a random reward from the Azhdaha domain located near Mt. Hulao."
          }
        ]
    """.trimIndent()
}