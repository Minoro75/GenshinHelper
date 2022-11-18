package io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru

import org.intellij.lang.annotations.Language

object MaidenBelovedDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Возлюбленная юная дева",
            "domain_name": "Долина воспоминаний",
            "description": "Награда подземелья"
          },
          {
            "name": "Возлюбленная юная дева",
            "domain_name": "Реликварий: Возлюбленная юная дева",
            "description": "Воспользуйтесь Алхимией и создайте Реликварий: Возлюбленная юная дева что бы превратить 3 Артефакта в один из нужного комплекта."
          }
        ]
    """.trimIndent()
}