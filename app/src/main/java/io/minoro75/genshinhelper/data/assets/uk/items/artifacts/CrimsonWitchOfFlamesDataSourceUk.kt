package io.minoro75.genshinhelper.data.assets.uk.items.artifacts

import org.intellij.lang.annotations.Language

object CrimsonWitchOfFlamesDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Вогняна відьма",
            "domain_name": "Hidden Palace of Zhou Formula",
            "description": "Нагорода за проходженя підземелля"
          },
          {
            "name": "Вогняна відьма",
            "domain_name": "Artifact Strongbox: Crimson Witch of Flames",
            "description": "Йдіть до алхімічного столу та використайте Скриню з артефактом: Вогняна відьма щоб перетворити 3 артефакти на 1 з потрібного набору."
          }
        ]
    """.trimIndent()
}