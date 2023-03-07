package io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources

import org.intellij.lang.annotations.Language

object DistantSeaDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Далеке море",
            "domain_name": "Court of Flowing Sand",
            "description": "Ви можете отримати Далеке море в нагороду за прохождення підземелля в Інадзумі"
          }
        ]
    """.trimIndent()
}