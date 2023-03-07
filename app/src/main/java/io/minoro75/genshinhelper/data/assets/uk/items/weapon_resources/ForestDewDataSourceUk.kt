package io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources

import org.intellij.lang.annotations.Language

object ForestDewDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Лісова роса",
            "domain_name": "Tower of Abject Pride",
            "description": "Ви можете отримати Лісова роса в нагороду за прохождення підземелля в Сумеру"
          }
        ]
    """.trimIndent()
}