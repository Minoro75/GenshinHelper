package io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru

import org.intellij.lang.annotations.Language

object GladiatorsFinaleDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Конец гладиатора",
            "domain_name": "Боссы",
            "description": "Может выпасть с любого босса"
          },
          {
            "name": "Конец гладиатора",
            "domain_name": "Реликварий: Конец гладиатора",
            "description": "Воспользуйтесь Алхимией и создайте Реликварий: Конец гладиатора что бы превратить 3 Артефакта в один из нужного комплекта."
          }
        ]
    """.trimIndent()
}