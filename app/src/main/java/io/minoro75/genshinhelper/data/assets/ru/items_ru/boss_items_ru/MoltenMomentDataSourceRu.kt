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
            "domain_name": "Остров Наруками: Тэнсюкаку",
            "description": "Вы можете получить Расплавленный миг как награду за подземелье с Синьорой в Инадзуме."
          },
          {
            "name": "Расплавленный миг",
            "domain_name": "Создать: Расплавленный миг",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой."
          }
        ]
    """.trimIndent()
}