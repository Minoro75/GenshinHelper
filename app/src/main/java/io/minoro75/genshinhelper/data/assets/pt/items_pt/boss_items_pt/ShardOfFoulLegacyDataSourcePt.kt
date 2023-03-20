package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import org.intellij.lang.annotations.Language

object ShardOfFoulLegacyDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Fragmento de Espada do Rei Demônio",
            "domain_name": "Enter the Golden House",
            "description": "Você pode coletar o Fragmento de Espada do Rei Demônio como uma recompensa aleatória do domínio do Childe, localizado no Porto de Liyue."
          },
          {
            "name": "Fragmento de Espada do Rei Demônio",
            "domain_name": "Convert: Shard of Foul Legacy",
            "description": "Vá para um Balcão de Síntese e use a seção Converter para converter um item em outro."
          }
        ]
    """.trimIndent()
}