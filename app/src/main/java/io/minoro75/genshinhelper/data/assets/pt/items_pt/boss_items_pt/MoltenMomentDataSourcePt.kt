package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import org.intellij.lang.annotations.Language

object MoltenMomentDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Momento Derretido",
            "domain_name": "Narukami Island: Tenshukaku",
            "description": "Você pode coletar o Momento Derretido como uma recompensa aleatória do domínio da Signora, localizado na Cidade de Inazuma."
          },
          {
            "name": "Momento Derretido",
            "domain_name": "Convert: Molten Moment",
            "description": "Vá para um Balcão de Síntese e use a seção Converter para converter um item em outro."
          }
        ]
    """.trimIndent()
}