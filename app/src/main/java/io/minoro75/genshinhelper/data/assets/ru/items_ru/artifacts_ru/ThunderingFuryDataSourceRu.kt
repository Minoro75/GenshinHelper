package io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru

import org.intellij.lang.annotations.Language

object ThunderingFuryDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Громогласный рёв ярости",
            "domain_name": "Июльские сады",
            "description": "Награда подземелья"
          },
          {
            "name": "Громогласный рёв ярости",
            "domain_name": "Реликварий: Громогласный рёв ярости",
            "description": "Воспользуйтесь Алхимией и создайте Реликварий: Громогласный рёв ярости что бы превратить 3 Артефакта в один из нужного комплекта."
          }
        ]
    """.trimIndent()
}