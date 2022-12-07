package io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources

import org.intellij.lang.annotations.Language

object BorealWolfDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Арктичний вовк",
            "domain_name": "Cecilia Garden",
            "description": "Ви можете отримати Арктичного вовка в нагороду за прохождення підземелля в Мондштаді"
          }
        ]
    """.trimIndent()
}