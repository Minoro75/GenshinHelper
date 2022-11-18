package io.minoro75.genshinhelper.data.assets.ru.items_ru.weapon_resources_ru

import org.intellij.lang.annotations.Language

object DecarabianDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Декарабиан",
            "domain_name": "Сад Сесилии",
            "description": "Вы можете получить Декарабиана в награду за прохождение подземелья в Мондштаде"
          }
        ]
    """.trimIndent()
}