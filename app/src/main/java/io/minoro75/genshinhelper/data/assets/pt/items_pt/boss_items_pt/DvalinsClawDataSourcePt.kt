package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import org.intellij.lang.annotations.Language

object DvalinsClawDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Garra do Vento Oriental",
            "domain_name": "Confront Stormterror",
            "description": "Você pode coletar a Garra do Vento Oriental como uma recompensa aleatória do domínio do Stormterror, localizado na Toca do Stormterror."
          },
          {
            "name": "Garra do Vento Oriental",
            "domain_name": "Convert: Dvalin's Claw",
            "description": "Vá para um Balcão de Síntese e use a seção Converter para converter um item em outro."
          }
        ]
    """.trimIndent()
}