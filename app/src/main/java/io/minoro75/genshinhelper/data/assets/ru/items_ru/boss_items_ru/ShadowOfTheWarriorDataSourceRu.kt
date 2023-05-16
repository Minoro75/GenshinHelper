package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import org.intellij.lang.annotations.Language

object ShadowOfTheWarriorDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Тень воина",
            "domain_name": "Enter the Golden House",
            "description": "Вы можете получить Тень воина за победу над Чайлдом возле Гавани Ли Юэ."
          },
          {
            "name": "Тень воина",
            "domain_name": "Convert: Shadow of the Warrior",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой."
          }
        ]
    """.trimIndent()
}