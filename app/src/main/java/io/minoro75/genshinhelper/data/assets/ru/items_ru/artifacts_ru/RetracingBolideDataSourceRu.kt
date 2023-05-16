package io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru

import org.intellij.lang.annotations.Language

object RetracingBolideDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Встречная комета",
            "domain_name": "Domain of Guyun",
            "description": "Награда подземелья"
          },
          {
            "name": "Встречная комета",
            "domain_name": "Artifact Strongbox: Retracing Bolide",
            "description": "Воспользуйтесь Алхимией и создайте Реликварий: Встречная комета что бы превратить 3 Артефакта в один из нужного комплекта."
          }
        ]
    """.trimIndent()
}