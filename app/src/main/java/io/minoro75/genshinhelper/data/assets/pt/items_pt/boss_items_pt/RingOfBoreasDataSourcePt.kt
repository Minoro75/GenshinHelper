package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import org.intellij.lang.annotations.Language

object RingOfBoreasDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Cálice do Vento Norte",
            "domain_name": "Lupus Boreas, Dominator of Wolves",
            "description": "Você pode coletar o Cálice do Vento Norte como uma recompensa aleatória do Lupus Boreas, localizado no Reino dos Lobos."
          },
          {
            "name": "Cálice do Vento Norte",
            "domain_name": "Convert: Ring of Boreas",
            "description": "Vá para um Balcão de Síntese e use a seção Converter para converter um item em outro."
          }
        ]
    """.trimIndent()
}