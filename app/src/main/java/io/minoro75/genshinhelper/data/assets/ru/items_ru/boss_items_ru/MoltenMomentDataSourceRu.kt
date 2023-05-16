package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import org.intellij.lang.annotations.Language

object MoltenMomentDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Расплавленный миг",
            "domain_name": "Narukami Island: Tenshukaku",
            "description": "Вы можете получить Расплавленный миг как награду за подземелье с Синьорой в Инадзуме."
          },
          {
            "name": "Расплавленный миг",
            "domain_name": "Convert: Molten Moment",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой."
          }
        ]
    """.trimIndent()
}