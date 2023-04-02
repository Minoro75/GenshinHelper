package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import org.intellij.lang.annotations.Language

object TuskOfMonocerosCaeliDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Chifre de Baleia Come-Céu",
            "domain_name": "Enter the Golden House",
            "description": "Você pode coletar o Chifre de Baleia Come-Céu como uma recompensa aleatória do domínio do Childe, localizado no Porto de Liyue."
          },
           {
            "name": "Chifre de Baleia Come-Céu",
            "domain_name": "Convert: Tusk of Monoceros Caeli",
            "description": "Vá para um Balcão de Síntese e use a seção Converter para converter um item em outro."
          }
        ]
    """.trimIndent()
}