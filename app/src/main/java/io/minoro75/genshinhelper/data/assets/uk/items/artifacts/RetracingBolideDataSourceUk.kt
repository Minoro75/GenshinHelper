package io.minoro75.genshinhelper.data.assets.uk.items.artifacts

import org.intellij.lang.annotations.Language

object RetracingBolideDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Зворотня комета",
            "domain_name": "Domain of Guyun",
            "description": "Нагорода за проходженя підземелля"
          },
          {
            "name": "Зворотня комета",
            "domain_name": "Artifact Strongbox: Retracing Bolide",
            "description": "Йдіть до алхімічного столу та використайте Скриню з артефактом: Зворотня комета щоб перетворити 3 артефакти на 1 з потрібного набору."
          }
        ]
    """.trimIndent()
}