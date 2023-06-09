package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import org.intellij.lang.annotations.Language

object EveramberDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Вечный янтарь",
            "domain_name": "Realm of Beginnings",
            "description": "Вы можете получить Вечный янтарь в качестве награды за победу над боссом в пустыне Сумеру."
          },
          {
            "name": "Вечный янтарь",
            "domain_name": "Convert: Everamber",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой."
          }
        ]
    """.trimIndent()
}