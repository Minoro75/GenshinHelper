package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import org.intellij.lang.annotations.Language

object HellfireButterflyDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Бабочка адского пламени",
            "domain_name": "Narukami Island: Tenshukaku",
            "description": "Вы можете получить Бабочка адского пламени как награду за подземелье с Синьорой в Инадзуме."
          },
          {
            "name": "Бабочка адского пламени",
            "domain_name": "Convert: Hellfire Butterfly",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой."
          }
        ]
    """.trimIndent()
}