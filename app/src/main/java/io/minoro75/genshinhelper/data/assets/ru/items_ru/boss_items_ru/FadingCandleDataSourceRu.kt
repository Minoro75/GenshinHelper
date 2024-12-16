package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import org.intellij.lang.annotations.Language

object FadingCandleDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Угасающая свеча",
            "domain_name": "Scattered Ruins",
            "description": "Вы можете получить [Угасающая свеча] как награду за подземелье с Арлекино в Фонтейне."
          },
          {
            "name": "Угасающая свеча",
            "domain_name": "Convert: Fading Candle",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой."
          }
        ]
    """.trimIndent()
}