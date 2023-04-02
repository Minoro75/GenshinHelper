package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import org.intellij.lang.annotations.Language

object AshenHeartDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Coração das Cinzas",
            "domain_name": "Narukami Island: Tenshukaku",
            "description": "Você pode coletar o Coração das Cinzas como uma recompensa aleatória do domínio da Signora, localizado na Cidade de Inazuma."
          },
          {
            "name": "Coração das Cinzas",
            "domain_name": "Convert: Ashen Heart",
            "description": "Vá para um Balcão de Síntese e use a seção Converter para converter um item em outro."
          }
        ]
    """.trimIndent()
}