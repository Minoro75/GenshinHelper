package io.minoro75.genshinhelper.data.assets.uk.items.artifacts

import org.intellij.lang.annotations.Language

object ThundersootherDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Громовержець",
            "domain_name": "Midsummer Courtyard",
            "description": "Нагорода за проходженя підземелля"
          },
          {
            "name": "Громовержець",
            "domain_name": "Artifact Strongbox: Thundersoother",
            "description": "Йдіть до алхімічного столу та використайте Скриню з артефактом: Громовержець щоб перетворити 3 артефакти на 1 з потрібного набору."
          }
        ]
    """.trimIndent()
}