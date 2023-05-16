package io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru

import org.intellij.lang.annotations.Language

object LavawalkerDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Ступающий по лаве",
            "domain_name": "Hidden Palace of Zhou Formula",
            "description": "Награда подземелья"
          },
          {
            "name": "Ступающий по лаве",
            "domain_name": "Artifact Strongbox: Lavawalker",
            "description": "Воспользуйтесь Алхимией и создайте Реликварий: Ступающий по лаве что бы превратить 3 Артефакта в один из нужного комплекта."
          }
        ]
    """.trimIndent()
}