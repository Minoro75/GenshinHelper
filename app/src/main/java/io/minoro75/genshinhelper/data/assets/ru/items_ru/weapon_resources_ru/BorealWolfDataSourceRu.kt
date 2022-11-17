package io.minoro75.genshinhelper.data.assets.ru.items_ru.weapon_resources_ru

import org.intellij.lang.annotations.Language

object BorealWolfDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Арктический волк",
            "domain_name": "Сад Сесилии",
            "description": "Вы можете получить Арктический волк в награду за прохождение подземелья в Мондштаде"
          }
        ]
    """.trimIndent()
}