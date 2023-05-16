package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import org.intellij.lang.annotations.Language

object TheMeaningOfAeonsDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
       [
          {
            "name": "Смысл эонов",
            "domain_name": "End of the Oneiric Euthymia",
            "description": "Вы можете получить Смысл эонов как награду за подземелье с Райдэн, которое находится рядом с Великим храмом Наруками."
          },
          {
            "name": "Смысл эонов",
            "domain_name": "Convert: The Meaning of Aeons",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой."
          }
        ]
    """.trimIndent()
}