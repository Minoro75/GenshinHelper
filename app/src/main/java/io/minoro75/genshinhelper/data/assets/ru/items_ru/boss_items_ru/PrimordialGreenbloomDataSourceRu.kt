package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import org.intellij.lang.annotations.Language

object PrimordialGreenbloomDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Первозданный цветок оазиса",
            "domain_name": "Realm of Beginnings",
            "description": "Вы можете получить Первозданный цветок оазиса в качестве награды за победу над боссом в пустыне Сумеру."
          },
          {
            "name": "Первозданный цветок оазиса",
            "domain_name": "Convert: Worldspan Fern",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой."
          }
        ]
    """.trimIndent()
}