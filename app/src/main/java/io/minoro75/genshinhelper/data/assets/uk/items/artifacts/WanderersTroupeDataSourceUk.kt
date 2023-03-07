package io.minoro75.genshinhelper.data.assets.uk.items.artifacts

import org.intellij.lang.annotations.Language

object WanderersTroupeDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Мандрівна трупа",
            "domain_name": "Bosses",
            "description": "Нагорода за перемогу над босами"
          },
          {
            "name": "Мандрівна трупа",
            "domain_name": "Artifact Strongbox: Wanderer's Troupe",
            "description": "Йдіть до алхімічного столу та використайте Скриню з артефактом: Мандрівна трупа щоб перетворити 3 артефакти на 1 з потрібного набору."
          }
        ]
    """.trimIndent()
}