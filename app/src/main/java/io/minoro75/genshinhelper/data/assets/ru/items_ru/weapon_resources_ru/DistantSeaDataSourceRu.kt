package io.minoro75.genshinhelper.data.assets.ru.items_ru.weapon_resources_ru

import org.intellij.lang.annotations.Language

object DistantSeaDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Внешние моря",
            "domain_name": "Court of Flowing Sand",
            "description": "Вы можете получить Внешние моря в награду за прохождение подземелья в Инадзуме"
          }
        ]
    """.trimIndent()
}