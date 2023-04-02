package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import io.minoro75.genshinhelper.common.Constants
import org.intellij.lang.annotations.Language

object PuppetStringsDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = Constants.gameVersion

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Fios da Marionete",
            "domain_name": "Joururi Workshop",
            "description": "Você pode coletar os Fios da Marionete como uma recompensa aleatória do domínio do Scaramouche, localizado na Cidade de Sumeru."
          },
          {
            "name": "Fios da Marionete",
            "domain_name": "Convert: Puppet Strings",
            "description": "Vá para um Balcão de Síntese e use a seção Converter para converter um item em outro."
          }
        ]
    """.trimIndent()
}