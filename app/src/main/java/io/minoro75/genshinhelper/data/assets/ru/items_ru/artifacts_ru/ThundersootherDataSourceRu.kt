package io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru

import org.intellij.lang.annotations.Language

object ThundersootherDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Усмиряющий гром",
            "domain_name": "Midsummer Courtyard",
            "description": "Награда подземелья"
          },
          {
            "name": "Усмиряющий гром",
            "domain_name": "Artifact Strongbox: Thundersoother",
            "description": "Воспользуйтесь Алхимией и создайте Реликварий: Усмиряющий гром что бы превратить 3 Артефакта в один из нужного комплекта."
          }
        ]
    """.trimIndent()
}