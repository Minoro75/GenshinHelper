package io.minoro75.genshinhelper.data.assets.pt.items_pt.weapon_resources_pt

import org.intellij.lang.annotations.Language

object NarukamiDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Narukami",
            "domain_name": "Court of Flowing Sand",
            "description": "Você pode coletar recursos do conjunto Narukami como recompensas aleatórias do domínio localizado em Inazuma."
          }
        ]
    """.trimIndent()
}