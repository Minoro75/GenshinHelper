package io.minoro75.genshinhelper.data.assets.items.boss_items

import org.intellij.lang.annotations.Language

object BloodjadeBranchDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Bloodjade Branch",
            "domain_name": "Beneath the Dragon-Queller",
            "description": "You can collect Bloodjade Branch as a random reward from the Azhdaha domain located near Mt. Hulao."
          }
        ]
    """.trimIndent()
}