package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import org.intellij.lang.annotations.Language

object DenialAndJudgmentDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Отрицание и вердикт",
            "domain_name": "Scattered Ruins",
            "description": "Вы можете получить [Отрицание и вердикт] как награду за подземелье с Арлекино в Фонтейне."
          },
          {
            "name": "Отрицание и вердикт",
            "domain_name": "Convert: Denial and Judgment",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой."
          }
        ]
    """.trimIndent()
}