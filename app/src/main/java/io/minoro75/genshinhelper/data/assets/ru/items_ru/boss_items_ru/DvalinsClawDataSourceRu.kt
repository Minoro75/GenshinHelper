package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import org.intellij.lang.annotations.Language

object DvalinsClawDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Коготь Двалина",
            "domain_name": "Логово Ужаса Бури",
            "description": "Вы можете получить Коготь Двалина как награду за подземелье с Ужасом Бури возле его логова."
          },
          {
            "name": "Коготь Двалина",
            "domain_name": "Создать: Коготь Двалина",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой.."
          }
        ]
    """.trimIndent()
}