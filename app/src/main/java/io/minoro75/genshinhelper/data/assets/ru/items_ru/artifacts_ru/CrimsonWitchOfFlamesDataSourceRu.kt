package io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru

import org.intellij.lang.annotations.Language

object CrimsonWitchOfFlamesDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Горящая алая ведьма",
            "domain_name": "Скрытый дворец Уван",
            "description": "Награда подземелья"
          },
          {
            "name": "Горящая алая ведьма",
            "domain_name": "Реликварий: Горящая алая ведьма",
            "description": "Воспользуйтесь Алхимией и создайте Реликварий: Горящая алая ведьма что бы превратить 3 Артефакта в один из нужного комплекта."
          }
        ]
    """.trimIndent()
}