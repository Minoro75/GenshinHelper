package io.minoro75.genshinhelper.data.assets.ru.items_ru.weapon_resources_ru

import org.intellij.lang.annotations.Language

object DandelionGladiatorDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Львиный клык",
            "domain_name": "Сад Сесилии",
            "description": "Вы можете получить Львиный клык в награду за прохождение подземелья в Мондштаде"
          }
        ]
    """.trimIndent()
}