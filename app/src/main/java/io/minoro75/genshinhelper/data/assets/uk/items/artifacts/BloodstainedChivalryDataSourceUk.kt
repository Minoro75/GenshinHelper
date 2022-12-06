package io.minoro75.genshinhelper.data.assets.uk.items.artifacts

import org.intellij.lang.annotations.Language

object BloodstainedChivalryDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Криваве лицарство",
            "domain_name": "Clear Pool and Mountain Cavern",
            "description": "Нагорода за проходженя підземелля"
          },
          {
            "name": "Криваве лицарство",
            "domain_name": "Artifact Strongbox: Bloodstained Chivalry",
            "description": "Йдіть до алхімічного столу та використайте Скриню з артефактом: Криваве лицарство щоб перетворити 3 артефакти на 1 з потрібного набору."
          }
        ]
    """.trimIndent()
}