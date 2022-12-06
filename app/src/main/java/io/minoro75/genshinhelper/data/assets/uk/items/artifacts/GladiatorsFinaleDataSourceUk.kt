package io.minoro75.genshinhelper.data.assets.uk.items.artifacts

import org.intellij.lang.annotations.Language

object GladiatorsFinaleDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Церемонія поховання гладіатора",
            "domain_name": "Bosses",
            "description": "Нагорода за перемогу над босами"
          },
          {
            "name": "Церемонія поховання гладіатора",
            "domain_name": "Artifact Strongbox: Gladiator's Finale",
            "description": "Йдіть до алхімічного столу та використайте Скриню з артефактом: Церемонія поховання гладіатора щоб перетворити 3 артефакти на 1 з потрібного набору."
          }
        ]
    """.trimIndent()
}