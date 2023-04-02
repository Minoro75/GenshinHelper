package io.minoro75.genshinhelper.data.assets.pt.items_pt.weapon_resources_pt

import org.intellij.lang.annotations.Language

object GuyunDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Guyun",
            "domain_name": "Hidden Palace of Lianshan Formula",
            "description": "Você pode coletar recursos do conjunto Guyun como recompensas aleatórias do domínio localizado em Liyue."
          }
        ]
    """.trimIndent()
}