package io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru

import org.intellij.lang.annotations.Language

object ViridescentVenererDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Изумрудная тень",
            "domain_name": "Valley of Remembrance",
            "description": "Награда подземелья"
          },
          {
            "name": "Изумрудная тень",
            "domain_name": "Artifact Strongbox: Viridescent Venerer",
            "description": "Воспользуйтесь Алхимией и создайте Реликварий: Изумрудная тень что бы превратить 3 Артефакта в один из нужного комплекта."
          }
        ]
    """.trimIndent()
}