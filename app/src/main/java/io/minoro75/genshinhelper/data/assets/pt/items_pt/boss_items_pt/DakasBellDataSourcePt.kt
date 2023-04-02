package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import io.minoro75.genshinhelper.common.Constants
import org.intellij.lang.annotations.Language

object DakasBellDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = Constants.gameVersion

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Sino do Vazio",
            "domain_name": "Joururi Workshop",
            "description": "Você pode coletar o Sino do Vazio como uma recompensa aleatória do domínio do Scaramouche, localizado na Cidade de Sumeru."
          },
          {
            "name": "Sino do Vazio",
            "domain_name": "Convert: Daka's Bell",
            "description": "Vá para um Balcão de Síntese e use a seção Converter para converter um item em outro."
          }
        ]
    """.trimIndent()
}