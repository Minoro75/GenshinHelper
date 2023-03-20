package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import org.intellij.lang.annotations.Language

object TearsOfTheCalamitiousGodDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Lágrima da Deusa do Desastre",
            "domain_name": "End of the Oneiric Euthymia",
            "description": "Você pode coletar a Lágrima da Deusa do Desastre como uma recompensa aleatória do domínio da Raiden Shogun, localizado no Grande Santuário Narukami."
          },
           {
            "name": "Lágrima da Deusa do Desastre",
            "domain_name": "Convert: Tears of the Calamitous God",
            "description": "Vá para um Balcão de Síntese e use a seção Converter para converter um item em outro."
          }
        ]
    """.trimIndent()
}