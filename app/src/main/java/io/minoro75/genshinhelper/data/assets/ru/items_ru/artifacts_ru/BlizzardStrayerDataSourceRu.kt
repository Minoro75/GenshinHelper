package io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru

import org.intellij.lang.annotations.Language

object BlizzardStrayerDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Заблудший в метели",
            "domain_name": "Peak of Vindagnyr",
            "description": "Награда подземелья"
          },
          {
            "name": "Заблудший в метели",
            "domain_name": "Artifact Strongbox: Blizzard Strayer",
            "description": "Воспользуйтесь Алхимией и создайте Реликварий: Заблудший в метели что бы превратить 3 Артефакта в один из нужного комплекта."
          }
        ]
    """.trimIndent()
}
