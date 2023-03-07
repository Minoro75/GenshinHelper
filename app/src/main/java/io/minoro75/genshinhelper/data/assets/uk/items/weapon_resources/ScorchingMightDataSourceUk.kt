package io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources

import org.intellij.lang.annotations.Language

object ScorchingMightDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Палаюча міць",
            "domain_name": "Tower of Abject Pride",
            "description": "Ви можете отримати Палаючу міць в нагороду за прохождення підземелля в Сумеру"
          }
        ]
    """.trimIndent()
}