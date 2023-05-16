package io.minoro75.genshinhelper.data.assets.ru.items_ru.weapon_resources_ru

import org.intellij.lang.annotations.Language

object GuyunDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Гуюнь",
            "domain_name": "Hidden Palace of Lianshan Formula",
            "description": "Вы можете получить Гуюнь в награду за прохождение подземелья в Ли Юэ"
          }
        ]
    """.trimIndent()
}