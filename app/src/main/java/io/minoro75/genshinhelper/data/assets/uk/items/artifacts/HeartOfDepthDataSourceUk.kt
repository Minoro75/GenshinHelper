package io.minoro75.genshinhelper.data.assets.uk.items.artifacts

import org.intellij.lang.annotations.Language

object HeartOfDepthDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Серце глибин",
            "domain_name": "Peak of Vindagnyr",
            "description": "Нагорода за проходженя підземелля"
          },
          {
            "name": "Серце глибин",
            "domain_name": "Artifact Strongbox: Heart of Depth",
            "description": "Йдіть до алхімічного столу та використайте Скриню з артефактом: Сердце глибин щоб перетворити 3 артефакти на 1 з потрібного набору."
          }
        ]
    """.trimIndent()
}