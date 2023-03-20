package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import org.intellij.lang.annotations.Language

object TheMeaningOfAeonsDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Significado de Éons",
            "domain_name": "End of the Oneiric Euthymia",
            "description": "Você pode coletar o Significado de Éons como uma recompensa aleatória do domínio da Raiden Shogun, localizado no Grande Santuário Narukami."
          },
          {
            "name": "Significado de Éons",
            "domain_name": "Convert: The Meaning of Aeons",
            "description": "Vá para um Balcão de Síntese e use a seção Converter para converter um item em outro."
          }
        ]
    """.trimIndent()
}