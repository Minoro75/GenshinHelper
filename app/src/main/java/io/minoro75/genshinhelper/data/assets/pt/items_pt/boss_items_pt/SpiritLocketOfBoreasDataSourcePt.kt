package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import org.intellij.lang.annotations.Language

object SpiritLocketOfBoreasDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Alma do Vento do Norte",
            "domain_name": "Lupus Boreas, Dominator of Wolves",
            "description": "Você pode coletar a Alma do Vento do Norte como uma recompensa aleatória do Lupus Boreas, localizado no Reino dos Lobos."
          },
          {
            "name": "Alma do Vento do Norte",
            "domain_name": "Convert: Spirit Locket of Boreas",
            "description": "Vá para um Balcão de Síntese e use a seção Converter para converter um item em outro."
          }
        ]
    """.trimIndent()
}