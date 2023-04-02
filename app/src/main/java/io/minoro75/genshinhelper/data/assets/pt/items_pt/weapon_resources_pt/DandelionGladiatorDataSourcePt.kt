package io.minoro75.genshinhelper.data.assets.pt.items_pt.weapon_resources_pt

import org.intellij.lang.annotations.Language

object DandelionGladiatorDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Gladiador de Dandelion",
            "domain_name": "Cecilia Garden",
            "description": "Você pode coletar recursos do conjunto Gladiador  de Dandelion como recompensas aleatórias do domínio localizado em Mondstadt."
          }
        ]
    """.trimIndent()
}