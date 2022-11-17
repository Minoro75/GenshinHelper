package io.minoro75.genshinhelper.data.assets.ru.items_ru.weapon_resources_ru

import org.intellij.lang.annotations.Language

object AerosideriteDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.1 1st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Чёрный сидерит",
            "domain_name": "Лабиринт Ляншань",
            "description": "Вы можете получить Чёрный сидерит в награду за прохождение подземелья в Ли Юэ"
          }
        ]
    """.trimIndent()
}