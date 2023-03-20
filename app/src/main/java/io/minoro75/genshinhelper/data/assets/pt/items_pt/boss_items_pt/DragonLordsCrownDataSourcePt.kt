package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import org.intellij.lang.annotations.Language

object DragonLordsCrownDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Coroa do Senhor dos Dragões",
            "domain_name": "Beneath the Dragon-Queller",
            "description": "Você pode coletar a Coroa do Senhor dos Dragões como uma recompensa aleatória do domínio do Azhdaha, localizado na Montanha Hulao."
          },
          {
            "name": "Coroa do Senhor dos Dragões",
            "domain_name": "Convert: Dragon Lord's Crown",
            "description": "Vá para um Balcão de Síntese e use a seção Converter para converter um item em outro."
          }
        ]
    """.trimIndent()
}