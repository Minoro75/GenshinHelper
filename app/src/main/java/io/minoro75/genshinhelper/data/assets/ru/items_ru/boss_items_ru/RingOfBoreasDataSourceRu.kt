package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import org.intellij.lang.annotations.Language

object RingOfBoreasDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Кольцо Борея",
            "domain_name": "Lupus Boreas, Dominator of Wolves",
            "description": "Вы можете получить Кольцо Борея как награду за победу над Андриусом в Вольфендоме."
          },
          {
            "name": "Кольцо Борея",
            "domain_name": "Convert: Ring of Boreas",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой."
          }
        ]
    """.trimIndent()
}