package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import org.intellij.lang.annotations.Language

object PrimordialGreenbloomDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Florescência Primogênita do Oásis",
            "domain_name": "Realm of Beginnings",
            "description": "Você pode coletar o Florescência Primogênita do Oásis como uma recompensa aleatória do domínio localizado no deserto de Sumeru"
          },
          {
            "name": "Florescência Primogênita do Oásis",
            "domain_name": "Convert: Worldspan Fern",
            "description": "Vá para um Balcão de Síntese e use a seção Converter para converter um item em outro."
          }
        ]
    """.trimIndent()
}