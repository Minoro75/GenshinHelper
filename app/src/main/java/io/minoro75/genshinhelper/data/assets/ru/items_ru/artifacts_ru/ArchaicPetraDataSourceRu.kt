package io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru

import org.intellij.lang.annotations.Language

object ArchaicPetraDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Архаичный камень",
            "domain_name": "Domain of Guyun",
            "description": "Награда подземелья"
          },
          {
            "name": "Архаичный камень",
            "domain_name": "Artifact Strongbox: Archaic Petra",
            "description": "Воспользуйтесь Алхимией и создайте Реликварий: Архаичный камень что бы превратить 3 Артефакта в один из нужного комплекта."
          }
        ]
    """.trimIndent()
}