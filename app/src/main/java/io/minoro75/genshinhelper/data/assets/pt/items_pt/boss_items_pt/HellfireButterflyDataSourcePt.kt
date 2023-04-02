package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import org.intellij.lang.annotations.Language

object HellfireButterflyDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Borboleta das Chamas Infernais",
            "domain_name": "Narukami Island: Tenshukaku",
            "description": "Você pode coletar a Borboleta das Chamas Infernais como uma recompensa aleatória do domínio da Signora, localizado na Cidade de Inazuma."
          },
          {
            "name": "Borboleta das Chamas Infernais",
            "domain_name": "Convert: Hellfire Butterfly",
            "description": "Vá para um Balcão de Síntese e use a seção Converter para converter um item em outro."
          }
        ]
    """.trimIndent()
}