package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import org.intellij.lang.annotations.Language

object AshenHeartDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Пепельное сердце",
            "domain_name": "Остров Наруками: Тэнсюкаку",
            "description": "Вы можете получить Пепельное сердце как награду за подземелье с Синьорой в Инадзуме."
          },
          {
            "name": "Пепельное сердце",
            "domain_name": "Создать: Пепельное сердце",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой."
          }
        ]
    """.trimIndent()
}