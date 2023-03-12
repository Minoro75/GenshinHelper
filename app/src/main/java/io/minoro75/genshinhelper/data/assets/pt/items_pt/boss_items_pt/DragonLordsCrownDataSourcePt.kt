package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import org.intellij.lang.annotations.Language

object DragonLordsCrownDataSourcePt {
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
          },
          {
            "name": "Dragon Lord's Crown",
            "domain_name": "Convert: Dragon Lord's Crown",
            "description": "Go to a Crafting table and use the Convert section to convert one item to another."
          }
        ]
    """.trimIndent()
}