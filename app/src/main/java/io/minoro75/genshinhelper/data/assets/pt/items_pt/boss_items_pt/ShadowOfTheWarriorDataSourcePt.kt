package io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt

import org.intellij.lang.annotations.Language

object ShadowOfTheWarriorDataSourcePt {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Sombra do Guerreiro",
            "domain_name": "Enter the Golden House",
            "description": "Você pode coletar a Sombra do Guerreiro como uma recompensa aleatória do domínio do Childe, localizado no Porto de Liyue."
          },
          {
            "name": "Sombra do Guerreiro",
            "domain_name": "Convert: Shadow of the Warrior",
            "description": "Vá para um Balcão de Síntese e use a seção Converter para converter um item em outro."
          }
        ]
    """.trimIndent()
}