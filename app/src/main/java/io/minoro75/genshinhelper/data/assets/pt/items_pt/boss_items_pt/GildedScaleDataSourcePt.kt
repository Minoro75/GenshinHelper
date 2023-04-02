package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import org.intellij.lang.annotations.Language

object GildedScaleDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Escama Dourada",
            "domain_name": "Beneath the Dragon-Queller",
            "description": "Você pode coletar a Escama Dourada como uma recompensa aleatória do domínio do Azhdaha, localizado na Montanha Hulao."
          },
          {
            "name": "Escama Dourada",
            "domain_name": "Convert: Gilded Scale",
            "description": "Vá para um Balcão de Síntese e use a seção Converter para converter um item em outro."
          }
        ]
    """.trimIndent()
}