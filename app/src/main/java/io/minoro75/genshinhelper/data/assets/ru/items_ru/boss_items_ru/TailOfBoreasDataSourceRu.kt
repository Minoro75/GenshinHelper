package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import org.intellij.lang.annotations.Language

object TailOfBoreasDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
       [
          {
            "name": "Хвост Борея",
            "domain_name": "Испытание Волка Севера",
            "description": "Вы можете получить Хвост Борея как награду за победу над Андриусом в Вольфендоме."
          },
          {
            "name": "Хвост Борея",
            "domain_name": "Создать: Хвост Борея",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой."
          }
        ]
    """.trimIndent()
}