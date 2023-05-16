package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import org.intellij.lang.annotations.Language

object TearsOfTheCalamitiousGodDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
      [
          {
            "name": "Слёзы очищения божества бедствий",
            "domain_name": "End of the Oneiric Euthymia",
            "description": "Вы можете получить Слёзы очищения божества бедствий как награду за подземелье с Райдэн, которое находится рядом с Великим храмом Наруками."
          },
          {
            "name": "Слёзы очищения божества бедствий",
            "domain_name": "Convert: Tears of the Calamitous God",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой."
          }
        ]
    """.trimIndent()
}