package io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru

import org.intellij.lang.annotations.Language

object HeartOfDepthDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Сердце глубин",
            "domain_name": "Peak of Vindagnyr",
            "description": "Награда подземелья"
          },
          {
            "name": "Сердце глубин",
            "domain_name": "Artifact Strongbox: Heart of Depth",
            "description": "Воспользуйтесь Алхимией и создайте Реликварий: Сердце глубин что бы превратить 3 Артефакта в один из нужного комплекта."
          }
        ]
    """.trimIndent()
}