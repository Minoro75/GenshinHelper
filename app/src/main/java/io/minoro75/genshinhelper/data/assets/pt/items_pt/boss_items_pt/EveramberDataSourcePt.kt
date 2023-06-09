package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import org.intellij.lang.annotations.Language

object EveramberDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Âmbar Eterno",
            "domain_name": "Realm of Beginnings",
            "description": "Você pode coletar o Âmbar Eterno como uma recompensa aleatória do domínio localizado no deserto de Sumeru"
          },
          {
            "name": "Âmbar Eterno",
            "domain_name": "Convert: Everamber",
            "description": "Vá para um Balcão de Síntese e use a seção Converter para converter um item em outro."
          }
        ]
    """.trimIndent()
}