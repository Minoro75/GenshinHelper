package io.minoro75.genshinhelper.data.assets.en.items.boss_items

import org.intellij.lang.annotations.Language

object ShadowOfTheWarriorDataSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Shadow of the Warrior",
            "domain_name": "Enter the Golden House",
            "description": "You can collect Shadow of the Warrior as a random reward from the Childe domain located in Liyue Harbour."
          },
          {
            "name": "Shadow of the Warrior",
            "domain_name": "Convert: Shadow of the Warrior",
            "description": "Go to a Crafting table and use the Convert section to convert one item to another."
          }
        ]
    """.trimIndent()
}