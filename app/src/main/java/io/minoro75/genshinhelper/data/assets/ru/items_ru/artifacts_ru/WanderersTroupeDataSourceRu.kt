package io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru

import org.intellij.lang.annotations.Language

object WanderersTroupeDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Странствующий ансамбль",
            "domain_name": "Bosses",
            "description": "Может выпасть с любого босса"
          },
          {
            "name": "Странствующий ансамбль",
            "domain_name": "Artifact Strongbox: Wanderer's Troupe",
            "description": "Воспользуйтесь Алхимией и создайте Реликварий: Странствующий ансамбль что бы превратить 3 Артефакта в один из нужного комплекта."
          }
        ]
    """.trimIndent()
}