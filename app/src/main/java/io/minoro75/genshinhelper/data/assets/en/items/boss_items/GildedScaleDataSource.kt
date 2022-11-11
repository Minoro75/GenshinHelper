package io.minoro75.genshinhelper.data.assets.en.items.boss_items

import org.intellij.lang.annotations.Language

object GildedScaleDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Gilded Scale",
            "domain_name": "Beneath the Dragon-Queller",
            "description": "You can collect Gilded Scale as a random reward from the Azhdaha domain located near Mt. Hulao."
          },
          {
            "name": "Gilded Scale",
            "domain_name": "Convert: Gilded Scale",
            "description": "Go to a Crafting table and use the Convert section to convert one item to another."
          }
        ]
    """.trimIndent()
}