package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import org.intellij.lang.annotations.Language

object MudraOfTheMaleficGeneralDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Mudra da Shogun Maléfica",
            "domain_name": "End of the Oneiric Euthymia",
            "description": "Você pode coletar a Mudra da Shogun Maléfica como uma recompensa aleatória do domínio da Raiden Shogun, localizado no Grande Santuário Narukami."
          },
          {
            "name": "Mudra da Shogun Maléfica",
            "domain_name": "Convert: Mudra of the Malefic General",
            "description": "Vá para um Balcão de Síntese e use a seção Converter para converter um item em outro."
          }
        ]
    """.trimIndent()
}