package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import org.intellij.lang.annotations.Language

object ShardOfFoulLegacyDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Shard of a Foul Legacy",
            "domain_name": "Enter the Golden House",
            "description": "You can collect Shard of Foul Legacy as a random reward from the Childe domain located in Liyue Harbour."
          },
          {
            "name": "Shard of a Foul Legacy",
            "domain_name": "Convert: Shard of Foul Legacy",
            "description": "Go to a Crafting table and use the Convert section to convert one item to another."
          }
        ]
    """.trimIndent()
}