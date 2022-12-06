package io.minoro75.genshinhelper.data.assets.uk.items.artifacts

import org.intellij.lang.annotations.Language

object BlizzardStrayerDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Загублений у хуртовині",
            "domain_name": "Peak of Vindagnyr",
            "description": "Нагорода за проходженя підземелля"
          },
          {
            "name": "Загублений у хуртовині",
            "domain_name": "Artifact Strongbox: Blizzard Strayer",
            "description": "Йдіть до алхімічного столу та використайте Скриню з артефактом: Загублений у хуртовині щоб перетворити 3 артефакти на 1 з потрібного набору."
          }
        ]
    """.trimIndent()
}
