package io.minoro75.genshinhelper.data.assets.ru.items_ru.weapon_resources_ru

import org.intellij.lang.annotations.Language

object ScorchingMightDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Пылающая мощь",
            "domain_name": "Башня презренной гордости",
            "description": "Вы можете получить Пылающую мощь в награду за прохождение подземелья в Сумеру"
          }
        ]
    """.trimIndent()
}