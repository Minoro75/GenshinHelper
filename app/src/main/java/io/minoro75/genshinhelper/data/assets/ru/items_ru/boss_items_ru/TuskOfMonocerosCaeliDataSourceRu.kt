package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import org.intellij.lang.annotations.Language

object TuskOfMonocerosCaeliDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Рог небесного кита",
            "domain_name": "Золотая палата",
            "description": "Вы можете получить Рог небесного кита за победу над Чайлдом возле Гавани Ли Юэ."
          },
          {
            "name": "Рог небесного кита",
            "domain_name": "Создать: Рог небесного кита",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой."
          }
        ]
    """.trimIndent()
}