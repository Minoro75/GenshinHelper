package io.minoro75.genshinhelper.data.assets.uk.items.artifacts

import org.intellij.lang.annotations.Language

object ViridescentVenererDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Смарагдова тінь",
            "domain_name": "Valley of Remembrance",
            "description": "Нагорода за проходженя підземелля"
          },
          {
            "name": "Смарагдова тінь",
            "domain_name": "Artifact Strongbox: Viridescent Venerer",
            "description": "Йдіть до алхімічного столу та використайте Скриню з артефактом: Смарагдова тінь щоб перетворити 3 артефакти на 1 з потрібного набору."
          }
        ]
    """.trimIndent()
}