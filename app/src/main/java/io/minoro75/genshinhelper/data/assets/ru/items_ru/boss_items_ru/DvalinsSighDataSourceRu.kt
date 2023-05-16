package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import org.intellij.lang.annotations.Language

object DvalinsSighDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
       [
          {
            "name": "Вздох Двалина",
            "domain_name": "Confront Stormterror",
            "description": "Вы можете получить Вздох Двалина как награду за подземелье с Ужасом Бури возле его логова."
          },
          {
            "name": "Вздох Двалина",
            "domain_name": "Convert: Dvalin's Sigh",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой.."
          }
        ]
    """.trimIndent()
}