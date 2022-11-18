package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import org.intellij.lang.annotations.Language

object GildedScaleDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
          [
          {
            "name": "Позолоченная чешуя",
            "domain_name": "Под древом подавления",
            "description": "Вы можете получить Позолоченную чешую как награду за подземелье с Аждахой возле горы Хулао."
          },
          {
            "name": "Позолоченная чешуя",
            "domain_name": "Создать: Позолоченная чешуя",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой.."
          }
        ]
    """.trimIndent()
}