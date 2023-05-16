package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import org.intellij.lang.annotations.Language

object MudraOfTheMaleficGeneralDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Мудра зловещего генерала",
            "domain_name": "End of the Oneiric Euthymia",
            "description": "Вы можете получить Мудру зловещего генерала как награду за подземелье с Райдэн, которое находится рядом с Великим храмом Наруками."
          },
          {
            "name": "Мудра зловещего генерала",
            "domain_name": "Convert: Mudra of the Malefic General",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой."
          }
        ]
    """.trimIndent()
}