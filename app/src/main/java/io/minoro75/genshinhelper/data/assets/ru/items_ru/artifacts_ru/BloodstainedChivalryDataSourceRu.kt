package io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru

import org.intellij.lang.annotations.Language

object BloodstainedChivalryDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Рыцарь крови",
            "domain_name": "Clear Pool and Mountain Cavern",
            "description": "Награда подземелья"
          },
          {
            "name": "Рыцарь крови",
            "domain_name": "Artifact Strongbox: Bloodstained Chivalry",
            "description": "Воспользуйтесь Алхимией и создайте Реликварий: Рыцарь крови что бы превратить 3 Артефакта в один из нужного комплекта."
          }
        ]
    """.trimIndent()
}