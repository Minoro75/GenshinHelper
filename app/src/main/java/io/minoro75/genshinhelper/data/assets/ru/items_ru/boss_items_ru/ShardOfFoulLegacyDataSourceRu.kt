package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import org.intellij.lang.annotations.Language

object ShardOfFoulLegacyDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
       [
          {
            "name": "Осколок дьявольского меча",
            "domain_name": "Enter the Golden House",
            "description": "Вы можете получить Осколок дьявольского меча за победу над Чайлдом возле Гавани Ли Юэ."
          },
          {
            "name": "Осколок дьявольского меча",
            "domain_name": "Convert: Shard of Foul Legacy",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой."
          }
        ]
    """.trimIndent()
}