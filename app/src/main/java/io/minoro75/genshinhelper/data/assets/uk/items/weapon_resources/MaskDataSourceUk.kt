package io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources

import org.intellij.lang.annotations.Language

object MaskDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Маска",
            "domain_name": "Court of Flowing Sand",
            "description": "Ви можете отримати Маску в нагороду за прохождення підземелля в Інадзумі"
          }
        ]
    """.trimIndent()
}