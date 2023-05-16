package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import org.intellij.lang.annotations.Language

object WorldspanFernDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Объявший небосвод папоротник",
            "domain_name": "Realm of Beginnings",
            "description": "Вы можете получить Объявший небосвод папоротник в качестве награды за победу над боссом в пустыне Сумеру."
          },
          {
            "name": "Объявший небосвод папоротник",
            "domain_name": "Convert: Worldspan Fern",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой."
          }
        ]
    """.trimIndent()
}